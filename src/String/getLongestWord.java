package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class getLongestWord {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len=x.length();
            if(len>m){
                m=len;
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
    getLongestWord t = new getLongestWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
    }
}
