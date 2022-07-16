package array;

import java.util.Scanner;

public class countPeak_10 {
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public int solution( int n, int[][] arr ){
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for (int k=0; k<4; k++){
                    int nx = i +dx[k];
                    int ny = j +dy[k];
                    if( nx>=0 && n>nx && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){cnt++;}
            }
            answer=cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        countPeak_10 countPeak = new countPeak_10();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(countPeak.solution(n,arr));
    }
}
