package Array;

import java.util.Scanner;

public class countPossibleCouple_12 {
    public int solution (int n, int m, int[][] arr) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt=0;
                for(int k=0; k<m; k++){
                    int pi=0, pj=0;
                    for(int l=0; l<n; l++){
                        if(arr[k][l]==i){ pi=l;}
                        if(arr[k][l]==j){ pj=l;}
                    }
                    if(pi<pj){cnt++;}
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        countPossibleCouple_12 countPossibleCouple = new countPossibleCouple_12();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(countPossibleCouple.solution(n,m,arr));
    }

}
