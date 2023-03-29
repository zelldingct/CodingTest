package javaDataStructure.heapSample;

public interface HeapInterface<E> {
    //Complete Binary Tree에 데이터 넣기
    public void insert(E newItem) throws Exception;
    //delete Root
    public E deleteMax() throws Exception;
    //show Root
    public E max() throws Exception;
    //check Heap null
    public boolean isEmpty();
    //make Heap null
    public void clear();
}
