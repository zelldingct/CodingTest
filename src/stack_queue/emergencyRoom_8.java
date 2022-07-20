package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class emergencyRoom_8 {
    public int solution(int n, int m, int[] risk){
        int answer=0;
        Queue<Person> q = new LinkedList<>();
        for( int i=0; i<n;i++){
            q.offer(new Person(i,risk[i]));
        }
        while(!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x:q) {
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id== m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        emergencyRoom_8 emergencyRoom = new emergencyRoom_8();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] risk = new int[n];
        for( int x : risk){
            x = scanner.nextInt();
        }
        System.out.println(emergencyRoom.solution(n,m,risk));
    }
}
