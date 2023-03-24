package javaDataStructure.stackSample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    @DisplayName("ArrayStack Test")
    public void ArrayStackTest() {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(300);
        stack.push(300);
        stack.push(200);
        stack.push(200);
        stack.push(100);
        stack.push(400);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
