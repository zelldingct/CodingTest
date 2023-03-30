package javaDataStructure.sortSample;

public class Sorting {
    int A[];

    public Sorting(int[] B) {
        A = B;
    }

    //선택정렬(복잡도:n^2)
    public void selectionSort() {
        int k; int tmp;
        for(int last = A.length-1; last >= 1; last--){
            k = theLargest(last);
            tmp=A[k]; A[k]=A[last]; A[last]=tmp;
        }
    }
    private int theLargest(int last){
        int largest=0;
        for(int i=0; i<=last; i++){
            if(A[i]>A[largest]){largest=i;}

        }
        return largest;
    }

    //버블정렬(복잡도:n^2)
    public void bubbleSort(){
        int tmp=0;
        boolean swapped;
        for(int last = A.length-1; last >=2 ; last--){
            swapped=false;
            for(int i=0; i<=last-1; i++){
                if(A[i]>A[i+1]){
                    tmp = A[i]; A[i]=A[i+1]; A[i+1]=tmp;
                    swapped=true;
                }
                if(swapped=false){
                    break;
                }
                tmp = tmp;
            }
        }
    }

    //삽입정렬(복잡도:n^2)
    public void insertionSort(){
        for(int i = 1; i<=A.length-1; i++){
            int loc = i-1;
            int newItem = A[i];
            while(loc >=0 && newItem <A[loc]){
                A[loc+1]=A[loc];
                loc--;
            }
            A[loc+1]= newItem;
            for(int j=0;j<A.length; j++ ) {
                System.out.print(A[j]+" ");
            }
            System.out.println(" ");
        }
    }


}
