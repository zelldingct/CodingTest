package DFS_BFS;

import java.util.Scanner;

public class SameSubset_DFS_1 {
    static String answer="No";
    static int n, total=0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr){
        if(flag) return;//원하는조건을 찾고 나면 모든 재귀함수들이 리턴되어버림
        if(sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){
                answer="YES";
                flag=true;
            }
        }else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        SameSubset_DFS_1 sameSubset = new SameSubset_DFS_1();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
            total+=arr[i];
        }
        sameSubset.DFS(0,0,arr);
        System.out.println(answer);
    }
}
