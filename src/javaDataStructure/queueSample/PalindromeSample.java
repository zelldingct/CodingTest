package javaDataStructure.queueSample;

import javaDataStructure.stackSample.LinkedStack;

public class PalindromeSample {
    public static boolean isPalindrome(String A) {


    LinkedStack s = new LinkedStack();
    LinkedQueue q = new LinkedQueue();

    for(int i = 0; i<A.length();i++){
        s.push(A.charAt(i));
        q.enqueue(A.charAt(i));
        }

    while(!s.isEmpty() &&s.pop() ==q.dequeue()){

    }

    if(s.isEmpty()){
        return true;
    }
    else{
        return false;
        }
    }
}
