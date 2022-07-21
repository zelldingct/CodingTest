package sorting_Searching;
import java.util.Scanner;


public class SelectionSort_1 {
    public int[] solution(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort_1 selectionSort = new SelectionSort_1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        for(int x:selectionSort.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
