package dynamicProgramming;

import java.util.Scanner;

public class WayToStair_1 {
    public int DFS(int L){

         if(L==0){
             return 1;
         }else{
            return(L*DFS(L-1));
         }
    }

    public int solution(int n){
        int answer=0;
        int x = n/2;
        int y = n%2;
        if(y==0){
        for (int i=0; i<=x; i++){
            answer += DFS(x + i) / (DFS(2 * i) * DFS(x - i));
        }
        }else{
            for(int i=0; i<=x; i++) {
                answer += DFS(x + 1 + i) / (DFS(2*i+1)*DFS(x-i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        WayToStair_1 wayToStair = new WayToStair_1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(wayToStair.solution(n));
        System.out.println(wayToStair.DFS(n));
    }
}
