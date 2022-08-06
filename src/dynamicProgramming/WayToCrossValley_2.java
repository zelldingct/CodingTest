package dynamicProgramming;

import java.util.Scanner;

public class WayToCrossValley_2 {

    static int[] dy;

    public int solution(int n) {
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<=n+1; i++){
            dy[i]=dy[i-2]+dy[i-1];
        }
        return dy[n+1];
    }

    public static void main(String[] args) {
    WayToCrossValley_2 wayToCrossValley = new WayToCrossValley_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dy = new int[n+2];
        System.out.println(wayToCrossValley.solution(n));
    }
}
