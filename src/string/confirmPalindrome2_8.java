package string;

import java.util.Scanner;

public class confirmPalindrome2_8 {

    public String solution(String s){
        String answer = "NO"  ;
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        confirmPalindrome2_8 confirmPalindrome2 = new confirmPalindrome2_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(confirmPalindrome2.solution(str));
    }
}
