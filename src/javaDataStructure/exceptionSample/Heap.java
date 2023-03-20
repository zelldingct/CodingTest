package javaDataStructure.exceptionSample;

public class Heap {
    public Heap(int n) {
        int[] item = new int[n];
        int size = item.length;
        int maxHeap = n;
    }

    class HeapException extends Exception {
        public HeapException (String msg) {
            super (msg);
        }
    }
    public void insert(int newItems) throws HeapException {
        int size;
        int maxHeap;

            System.out.println(newItems);

    }

//    public static void main(String[] args) {
//        Heap h = new Heap(3);
//        try {
//            h.insert(1);
//            h.insert(10);
//            h.insert(30);
//            h.insert(20);
//            h.insert(50);
//        }catch (HeapException ex){
//            System.out.println("HeapException: " + ex.getMessage());
//        }
//    }

}
