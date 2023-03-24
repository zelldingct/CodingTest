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
        stack.push(200);
        stack.push(100);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
    @Test
    @DisplayName("LinkedStack Test")
    public void LinkedStackTest() {
        LinkedStack<Integer> stack2 = new LinkedStack<>();

        stack2.push(300);
        stack2.push(200);
        stack2.push(100);

        while(!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }
    @Test
    @DisplayName("InheritedStack Test")
    public void InheritedStack() {
        InheritedStack<Integer> stack3 = new InheritedStack<>();

        stack3.push(300);
        stack3.push(200);
        stack3.push(100);

        while(!stack3.isEmpty()){
            System.out.println(stack3.pop());
        }
    }

}
