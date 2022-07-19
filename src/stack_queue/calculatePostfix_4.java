package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class calculatePostfix_4 {

    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) {
                stack.push(x-48);
            }else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt / rt);
            }
        }
        return answer+=stack.get(0);
    }

    public static void main(String[] args) {
        calculatePostfix_4 calculatePostfix = new calculatePostfix_4();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(calculatePostfix.solution(str));
    }
}
