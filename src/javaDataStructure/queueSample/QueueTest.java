package javaDataStructure.queueSample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    @DisplayName("Queue Test")
    public void ArrayQueueTest() {
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("test1");
        queue.enqueue("test2");
        queue.enqueue("test3");
        queue.dequeue();
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
    @Test
    @DisplayName("LinkedQueue Test")
    public void LinkedQueueTest() {
        LinkedQueue<String> queue2 = new LinkedQueue<>();
        queue2.enqueue("test1");
        queue2.enqueue("test2");
        queue2.enqueue("test3");
        queue2.dequeue();

        while(!queue2.isEmpty()){
            System.out.println(queue2.dequeue());
            System.out.println(queue2.isEmpty());
        }
    }
    @Test
    @DisplayName("InheritedQueue Test")
    public void InheritedQueue() {
        InheritedQueue<String> queue3 = new InheritedQueue<>();
        queue3.enqueue("test1");
        queue3.enqueue("test2");
        queue3.enqueue("test3");
        queue3.dequeue();

        while(!queue3.isEmpty()){
            System.out.println(queue3.dequeue());
            System.out.println(queue3.isEmpty());
        }
    }
    @Test
    @DisplayName("listQueue Test")
    public void listQueue() {
        listQueue<String> queue4 = new listQueue<>();
        queue4.enqueue("test1");
        queue4.enqueue("test2");
        queue4.enqueue("test3");
        queue4.dequeue();

        while(!queue4.isEmpty()){
            System.out.println(queue4.dequeue());
            System.out.println(queue4.isEmpty());
        }
    }
    @Test
    @DisplayName("Palindrome Test")
    public void palindromeTest() {
        PalindromeSample palin = new PalindromeSample();
        System.out.println("Palindrome Check!");
        String str = "lioninoil";
        boolean t =palin.isPalindrome(str);
        String result;
        if(t){
             result = "Yes!";
        }else{
             result = "No!";
        }
        System.out.println(str + " is Palindrome?: " + result);
    }
}
