package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class correctParentheses_1 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()){
                    return "NO";
                }else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){return "NO";}
        return answer;
    }

    public static void main(String[] args) {
        correctParentheses_1 correctParentheses = new correctParentheses_1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(correctParentheses.solution(str));
    }
}
