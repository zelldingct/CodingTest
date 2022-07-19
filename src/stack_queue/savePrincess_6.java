package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class savePrincess_6 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for(int i=1; i<=n; i++) Q.offer(i);

        while(!Q.isEmpty()){
            for(int i=1; i<k; i++){
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size()==1) break;
        }
        return answer=Q.poll();
    }

    public static void main(String[] args) {
        savePrincess_6 savePrincess = new savePrincess_6();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(savePrincess.solution(n,k));
    }
}
