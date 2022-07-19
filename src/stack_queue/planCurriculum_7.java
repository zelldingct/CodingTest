package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class planCurriculum_7 {
    public String solution(String need, String plan){
        String answer ="YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x:need.toCharArray()){
            queue.offer(x);
        }
        for(char x:plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "No";
                }
            }
        }
        if(!queue.isEmpty()) return "No";
        return answer;
    }

    public static void main(String[] args) {
        planCurriculum_7 planCurriculum7 = new planCurriculum_7();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(planCurriculum7.solution(a, b));
    }
}
