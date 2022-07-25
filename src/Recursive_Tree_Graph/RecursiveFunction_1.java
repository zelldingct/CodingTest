package Recursive_Tree_Graph;

import java.util.Scanner;

public class RecursiveFunction_1 {
    public void DFS (int n){
        if(n==0) return;
        else {

            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        RecursiveFunction_1 recursiveFunction = new RecursiveFunction_1();
        recursiveFunction.DFS(3);
    }
}
