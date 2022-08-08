package dynamicProgramming;

import java.util.Scanner;

public class getHighestScore_Knapsack_6 {
    static int[] dy;
    static int n,m;
    public static void main(String[] args) {
        getHighestScore_Knapsack_6 getHighestScore_knapsack= new getHighestScore_Knapsack_6();
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         m = scanner.nextInt();
         dy = new int[m+1];
         for(int i=0; i<n; i++){
             int ps=scanner.nextInt();
             int pt=scanner.nextInt();
             for(int j=m; j>=pt; j--){
                 dy[j]=Math.max(dy[j],dy[j-pt]+ps);
             }
         }
        System.out.println(dy[m]);
    }
}
