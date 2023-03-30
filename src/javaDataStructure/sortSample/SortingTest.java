package javaDataStructure.sortSample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class SortingTest {
    static final int NUM_SCALE = 10;
    final int SIZE = 10;
    public static void prepare(int[] A){
        for(int i=0; i<A.length; i++){
            A[i] = (int) (NUM_SCALE*Math.random());
        }
    }
    @Test
    @DisplayName("SortingTest")
    public void sortingTest() {

        int[] A = new int[SIZE];
        prepare(A);
        Sorting s = new Sorting(A);

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("  시작  ");
        s.insertionSort();
//        System.out.println(" ");
//        for(int i=0; i<A.length; i++){
//            System.out.print(A[i]+" ");
//        }
    }
}
