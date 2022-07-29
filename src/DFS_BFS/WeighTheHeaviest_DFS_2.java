package DFS_BFS;

import java.util.Scanner;

public class WeighTheHeaviest_DFS_2 {
public static int answer=0;

    public void DFS(int c, int L, int sum, int[] arr){
        if(L==arr.length){
            if(sum<c){
                answer=Math.max(sum,answer);
            }
        }else{
            DFS(c,L+1,sum+arr[L],arr);
            DFS(c,L+1,sum,arr);
        }

    }

    public static void main(String[] args) {
        WeighTheHeaviest_DFS_2 weighTheHeaviest = new WeighTheHeaviest_DFS_2();
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        weighTheHeaviest.DFS(c,0,0,arr);
        System.out.println(answer);
    }
}
