package DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExchangeCoin_5 {

    static int n,m;
    static int answer=Integer.MAX_VALUE;

    public void DFS( int L, int sum, Integer[] arr){
        if(sum>m)return;
        if(L>=answer) return;//시간 복잡도를 줄일 수 있다.
        if(sum==m){
            answer=Math.min(answer,L);
        }else{
            for(int i=0; i<n;i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        ExchangeCoin_5 exchangeCoin = new ExchangeCoin_5();
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m=scanner.nextInt();
        exchangeCoin.DFS(0,0, arr);
        System.out.println(answer);
    }
}
