package sorting_Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class NaughtyBoy_6 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                answer.add(i + 1);
                break;
            }

        }
        if (!answer.isEmpty()) {
            for (int i = answer.get(0); i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    answer.add(i + 2);
                    break;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NaughtyBoy_6 naughtyBoy = new NaughtyBoy_6();
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
