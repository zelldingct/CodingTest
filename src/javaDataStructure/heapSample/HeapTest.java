package javaDataStructure.heapSample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HeapTest {
    @Test
    @DisplayName("HeapTest")
    public void HeapTest() throws HeapException {
        Heap<Integer> h = new Heap<>(5);
       try {
           h.insert(1);
           h.insert(10);
           //h.clear();

           h.insert(30);
           h.insert(10);
           h.insert(30);
           h.insert(20);
           h.insert(40);
//        h.deleteMax();

           h.insert(1);
           h.insert(3);
//        h.deleteMax();
       }catch(HeapException e){
           String msg =  e.getMessage();
           System.out.println(msg);
       }
        while(!h.isEmpty()){
            System.out.println(h.deleteMax());
        }
    }
}
