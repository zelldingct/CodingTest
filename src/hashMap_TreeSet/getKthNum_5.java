package hashMap_TreeSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class getKthNum_5 {
    public int solution(int N, int K, int[] arr) {
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            for(int j=i+1; j<N; j++){
                for(int l=j+1; l<N; l++ ){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt=0;
        for(int x:Tset){
            cnt++;
            if(cnt==K){
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        getKthNum_5 getKthNum = new getKthNum_5();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(getKthNum.solution(N, K, arr));
    }
}
