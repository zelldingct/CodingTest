package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class removeParentheses_2 {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x :
                str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }



        for(int i=0; i<stack.size(); i++ ){
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        removeParentheses_2 removeParentheses = new removeParentheses_2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(removeParentheses.solution(str));
    }
}
