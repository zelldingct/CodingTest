package sorting_Searching;

import java.util.Scanner;

public class CheckDuplicate_5 {
    public String solution(int n, int[] arr){
        String answer="U";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    answer = "D";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CheckDuplicate_5 checkDuplicate = new CheckDuplicate_5();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(checkDuplicate.solution(n,arr));
    }
}
