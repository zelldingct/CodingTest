package String;

import java.util.Locale;
import java.util.Scanner;

public class confirmPalindrome2 {

    public String solution(String s){
        String answer = "NO"  ;
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        confirmPalindrome2 confirmPalindrome2 = new confirmPalindrome2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(confirmPalindrome2.solution(str));
    }
}
