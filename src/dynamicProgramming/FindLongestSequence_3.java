package dynamicProgramming;

import java.util.Scanner;

public class FindLongestSequence_3 {

    static int[] dy;
    public int solution (int[] arr) {
        int answer=0;
        dy=new int[arr.length];
        for(int i=1; i<arr.length; i++){
            int max=0;
            dy[0]=1;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && dy[j]>max){
                    max=dy[j];
                }
                dy[i]=max+1;
                answer=Math.max(answer,dy[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindLongestSequence_3 findLongestSequence = new FindLongestSequence_3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(findLongestSequence.solution(arr));
    }
}
