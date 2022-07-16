package twoPonters_SlidingWindow;

import java.util.Scanner;

public class getSerialSequence_4 {
    public int solution (int n, int m, int[] arr){
        int answer=0;
        int sum=0;
        int lt=0;

        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m){answer++;}
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m){answer++;}
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        getSerialSequence_4 getSerialSequence = new getSerialSequence_4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] arr = new int[8];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(getSerialSequence.solution(n,m,arr));
    }
}
