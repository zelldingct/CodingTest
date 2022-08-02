package DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountIslandNum_BFS_14 {
    static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
    static int n, answer = 0;
    Queue<Point> Q = new LinkedList<>();



    public void solution(int[][] board) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);

                }
            }
        }
    }

    public void BFS(int x, int y, int[][] board) {
        Q.offer(new Point(x,y));
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        CountIslandNum_BFS_14 countIslandNum= new CountIslandNum_BFS_14();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        countIslandNum.solution(arr);
        System.out.println(answer);

    }
}
