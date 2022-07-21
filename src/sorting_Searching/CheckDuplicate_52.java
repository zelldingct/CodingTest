package sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicate_52 {
    public String solution(int n, int[] arr){
        String answer="U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
                if(arr[i]==arr[i+1]){
                    answer = "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CheckDuplicate_52 checkDuplicate = new CheckDuplicate_52();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(checkDuplicate.solution(n,arr));
    }
}
