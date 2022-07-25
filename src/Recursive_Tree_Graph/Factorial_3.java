package Recursive_Tree_Graph;

public class Factorial_3 {

    public int DFS(int n){
        if(n==1){return 1;}
        else{ return n*DFS(n-1);}
    }

    public static void main(String[] args) {
        Factorial_3 factorial = new Factorial_3();
        System.out.println(factorial.DFS(5));
    }
}
