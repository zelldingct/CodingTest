package Recursive_Tree_Graph;

public class GetFibonacci_4 {

    static int[] fibo;
    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return 1;
        else if(n==2) return 1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);

    }

    public static void main(String[] args) {
        GetFibonacci_4 getFibonacci = new GetFibonacci_4();
        int n=7;
        fibo=new int[n+1];
        getFibonacci.DFS(n);
        for(int i=1; i<=n; i++)System.out.println(getFibonacci.DFS(i)+" ");
    }
}
