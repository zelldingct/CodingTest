package Array;

import java.util.Scanner;

public class fibonacciSequence_4 {
    public int[] solution( int n ){
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        for(int i=2; i<n; i++) {
            answer[i]= answer[i-2]+answer[i-1];
        }


        return answer;
    }

    public static void main(String[] args) {
        fibonacciSequence_4 fibonacciSequence = new fibonacciSequence_4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int x:fibonacciSequence.solution(n)) System.out.print(x + " ");
    }
}
