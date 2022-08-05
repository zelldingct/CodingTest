package dynamicProgramming;

import java.util.Scanner;

public class WayToStair_1_2 {
    static int[] dy;

    public int solution(int n){
        int answer=0;
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<=n; i++){
            dy[i]=dy[i-2]+dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        WayToStair_1_2 wayToStair = new WayToStair_1_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
             dy=   new int[n+1];
        System.out.println(wayToStair.solution(n));
        System.out.println(Integer.MAX_VALUE);
    }
}
