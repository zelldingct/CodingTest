package string;

import java.util.Scanner;

public class CrackCode_12 {
    public String solution (String str,int num){
        String answer = "";
        for(int i=0; i<num; i++){
            String tmp=str.substring(0,7).replace('#','1').replace('*','0');
            int n = Integer.parseInt(tmp,2);
            answer+=(char)n;

            str= str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        CrackCode_12 crackCode = new CrackCode_12();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        System.out.println(crackCode.solution(str, num));
    }
}
