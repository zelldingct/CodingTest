package Array;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Scanner;

public class visibleStudents_2 {
    public int solution(int n , int[] arr) {
        int answer=1, max=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max) {
                answer++;
                max=arr[i];
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        visibleStudents_2 visibleStudents = new visibleStudents_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(visibleStudents.solution(n, arr));
    }
}
