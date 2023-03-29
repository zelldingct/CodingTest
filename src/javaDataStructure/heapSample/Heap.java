package javaDataStructure.heapSample;

public class Heap<E extends Comparable> implements HeapInterface<E> {

    private E[] A;
    private int numItems;

    public Heap(int arraySize) {
        A=(E[]) new Comparable[arraySize];
        numItems = 0;
    }
    public Heap(E[] B, int numElements){
        A=B;
        numItems = numElements;
    }

    private void percolateUp(int i){
        int parent = (i-1)/2;
        if(parent>=0 && A[i].compareTo(A[parent])>0){
            E tmp = A[i];
            A[i]=A[parent];
            A[parent] = tmp;
            percolateUp(parent);
        }
    }

    private void percolateDown(int i){
        int child = 2*i + 1;
        int rightChild = 2*i +2;
        if(child <= numItems-1){
            if(rightChild <= numItems-1 && A[child].compareTo(A[rightChild])<0){
                child = rightChild;
        }
            if(A[i].compareTo(A[child])<0){
                E tmp = A[i];
                A[i] = A[child];
                A[child] = tmp;
                percolateDown(child);
            }
        }
    }
    @Override
    public void insert(E newItem) throws HeapException {
        if(numItems <A.length){
            A[numItems] = newItem;
            percolateUp(numItems);
            numItems++;
        }else throw new HeapException("HeapErr: Insert()-Overflow!");
    }

    @Override
    public E deleteMax() throws HeapException {
        if(!isEmpty()){
            E max = A[0];
            A[0] = A[numItems-1];
            numItems--;
            percolateDown(0);
            return max;
        }else throw new HeapException("HeapErr: Delete()-Underflow!");
    }

    public void buildHeap() {
        if(numItems>=2){
            for(int i=(numItems-2)/2; i >=0 ;i--){
                percolateDown(i);
            }
        }

    }

    @Override
    public E max() throws HeapException {
        if(!isEmpty()) {
            return A[0];
        } else throw new HeapException("HeapErr: Max()-Empty!");
    }

    @Override
    public boolean isEmpty() {
        return numItems==0;
    }

    @Override
    public void clear() {
        A = (E[]) new Object[A.length];
         numItems = 0;
    }

}
