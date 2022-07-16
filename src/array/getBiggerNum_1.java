package array;

import java.util.ArrayList;
import java.util.Scanner;

public class getBiggerNum_1 {

    public ArrayList<Integer> solution(int n , int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        getBiggerNum_1 getBiggerNum1 = new getBiggerNum_1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int x : getBiggerNum1.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
