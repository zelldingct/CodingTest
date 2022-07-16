package string;

import java.util.Scanner;

public class confirmPalindrome_7 {
    public String solution(String str){
        String answer = "YES" ;
        str=str.toUpperCase();
        int len=str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        confirmPalindrome_7 confirmPalindrome = new confirmPalindrome_7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(confirmPalindrome.solution(str));
    }
}
