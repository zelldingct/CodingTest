package Array;

import java.util.Scanner;

public class countPrimeNum {
    public int solution(int n){
        int answer=0;
        int[] ch = new int[n+1];
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i){
                    ch[j]=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        countPrimeNum countPrimeNum = new countPrimeNum();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countPrimeNum.solution(n));
    }
}
