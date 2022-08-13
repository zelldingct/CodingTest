package Practice;

import java.util.Scanner;

public class Chap1Num2 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chap1Num2 main = new Chap1Num2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
