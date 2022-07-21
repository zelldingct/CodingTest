package sorting_Searching;

import java.util.Scanner;

public class BubbleSort_2 {
    public int[] solution(int n, int[] arr) {
        int[] answer = arr;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort_2 bubbleSort = new BubbleSort_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : bubbleSort.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

}
