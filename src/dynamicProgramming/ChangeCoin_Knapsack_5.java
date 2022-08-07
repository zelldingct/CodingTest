package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeCoin_Knapsack_5 {
    static int[] dy;
    static int n,m;

    public int solution(int[] coin){
        int answer=0;
        Arrays.fill(dy,Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<=m; j++){
                dy[j]=Math.min(dy[j],dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        ChangeCoin_Knapsack_5 changeCoin_knapsack = new ChangeCoin_Knapsack_5();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] coin = new int[n];


        for(int i=0; i<n; i++){
            coin[i]=scanner.nextInt();
        }
        m = scanner.nextInt();
        dy = new int[m+1];
        System.out.println(changeCoin_knapsack.solution(coin));
    }
}
