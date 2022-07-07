package String;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseString_4 {

    public ArrayList<String> solution( int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);

        char[] s=x.toCharArray();
        int lt=0, rt=x.length()-1;
        while(lt<rt) {
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }
        String tmp = String.valueOf(s);
        answer.add(tmp);
        }
        return answer;

    }

    public static void main(String[] args) {
        reverseString_4 reverseString = new reverseString_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : reverseString.solution(n,str)){
            System.out.println(x);
        }
    }
}
