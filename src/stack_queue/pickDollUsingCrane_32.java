package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class pickDollUsingCrane_32 {
    public int solution(int n, int[][] board, int m, int[] moves ){
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<n; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!basket.isEmpty() && tmp == basket.peek()) {
                        answer += 2;
                        basket.pop();
                    } else
                        basket.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        pickDollUsingCrane_32 pickDollUsingCrane = new pickDollUsingCrane_32();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                board[i][j] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++){
            moves[i] = scanner.nextInt();
        }
        System.out.println(pickDollUsingCrane.solution(n,board,m,moves));
    }

}
