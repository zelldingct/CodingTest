package DFS_BFS;

import java.util.Scanner;

public class PickNumMarbleCombination_9 {

    static int[] combi,ch;
    static int n,m;

    public void DFS(int L, int s) {
        if(L==m){
            for(int x:combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        }else{
            for(int i=s; i<=n; i++) {
                combi[L]=i;
                    DFS(L+1, i+1);
                }
            }
        }


    public static void main(String[] args) {
        PickNumMarbleCombination_9 pickNumMarbleCombination = new PickNumMarbleCombination_9();
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        combi=new int[m];
        pickNumMarbleCombination.DFS(0,1);

    }

}
