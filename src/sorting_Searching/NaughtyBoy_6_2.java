package sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NaughtyBoy_6_2 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp=arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NaughtyBoy_6_2 naughtyBoy = new NaughtyBoy_6_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : naughtyBoy.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
