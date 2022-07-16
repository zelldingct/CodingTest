package twoPonters_SlidingWindow;

import java.util.Scanner;

public class sumSuccessiveNum_5 {

    public int solution ( int n){
        int answer = 0;
        int cnt=1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        sumSuccessiveNum_5 sumSuccessiveNum = new sumSuccessiveNum_5();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumSuccessiveNum.solution(n));

    }
}
