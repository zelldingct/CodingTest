package string;

import java.util.Scanner;

public class extractNumbers_9 {
    public int solution (String str) {
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57)  answer= answer*10 + (x-48);

        }
        return answer;

    }

    public static void main(String[] args) {
        extractNumbers_9 extractNumbers = new extractNumbers_9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(extractNumbers.solution(str));
    }
}
