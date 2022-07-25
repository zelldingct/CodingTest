package Recursive_Tree_Graph;

public class PrintBinaryNumber_2 {
    public void DFS(int n){
        if(n==0) return;
        else{

            DFS(n/2);
            System.out.print(n%2+ " ");
        }
    }

    public static void main(String[] args) {
        PrintBinaryNumber_2 printBinaryNumber = new PrintBinaryNumber_2();
        printBinaryNumber.DFS(11);
    }
}
