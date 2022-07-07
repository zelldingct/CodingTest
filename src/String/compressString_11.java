package String;

import java.util.Scanner;

public class compressString_11 {

    public String solution(String str) {
        String answer = "";
        str=str+" ";
        int cnt=1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else {
            answer += str.charAt(i);
            if (cnt>1)  answer += String.valueOf(cnt);
            cnt = 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        compressString_11 compressString = new compressString_11();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(compressString.solution(str));
    }
}
