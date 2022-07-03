package String;

import java.util.Scanner;

public class deleteDuplicateLetter {
    public String solution ( String str){
        String answer = "" ;
        for(int i = 0; i<str.length(); i++){
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        deleteDuplicateLetter deleteDuplicateLetter = new deleteDuplicateLetter();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(deleteDuplicateLetter.solution(str));
    }
}
