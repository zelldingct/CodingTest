package twoPonters_SlidingWindow;

import java.util.Scanner;

public class getMaxSales_3 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum=0;
        for(int i=0; i<m ;i++){
            sum+=arr[i];
            answer=sum;
        }
        for(int i=m; i<n; i++) {
            sum+=(arr[i]-arr[i-m]);
            answer=Math.max(answer,sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        getMaxSales_3 getMaxSales = new getMaxSales_3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(getMaxSales.solution(n,m,arr));
    }
}
