package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class pickDollUsingCrane_3 {
    public int solution(int n, int[][] board, int m, int[] moves ){
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for(int i=0; i<m; i++){ //moves에 있는 것 차례대로 시행
            int x = moves[i]-1;
            for(int j=0; j<n; j++) {
                if (board[j][x] != 0) {
                    int tmp = board[j][x];
                    board[j][x] = 0;
                    if (!basket.isEmpty() && tmp == basket.peek()) {
                        answer += 2;
                        basket.pop();
                    } else {
                        basket.push(tmp);
                    }
                    break;//지금 if문 안에 break가 걸려있는데 if가 true가 되면 for도 탈출하게 된다. 매우 중요.
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        pickDollUsingCrane_3 pickDollUsingCrane = new pickDollUsingCrane_3();
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
