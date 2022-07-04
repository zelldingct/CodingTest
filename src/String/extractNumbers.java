package String;

import java.util.Scanner;

public class extractNumbers {
    public int solution (String str) {
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57)  answer= answer*10 + (x-48);
        }
        return answer;

    }

    public static void main(String[] args) {
        extractNumbers extractNumbers = new extractNumbers();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(extractNumbers.solution(str));
    }
}
