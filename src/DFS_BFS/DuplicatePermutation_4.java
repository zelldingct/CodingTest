package DFS_BFS;

import java.util.Scanner;

public class DuplicatePermutation_4 {
    public static int n, m;
    static int[] pm;
    public void DFS(int L){
        if(L==m){
            for(int x:pm) System.out.print(x+ " ");
            System.out.println();
        }else{
            for(int i=1;i<=n;i++){
                pm[L]=i;
                DFS(L+1);
            }
        }

    }

    public static void main(String[] args) {
        DuplicatePermutation_4 duplicatePermutation = new DuplicatePermutation_4();
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        pm=new int[m];
        duplicatePermutation.DFS(0);
    }
}
