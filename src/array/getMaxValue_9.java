package array;

import java.util.Scanner;

public class getMaxValue_9 {
    public int solution (int n, int[][] arr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++) {
            sum1=0; sum2=0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
                }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
            }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
            answer=Math.max(answer,sum1);
        }
        return answer;
    }

    public static void main(String[] args) {
        getMaxValue_9 getMaxValue = new getMaxValue_9();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(getMaxValue.solution(n,arr));

    }
}
