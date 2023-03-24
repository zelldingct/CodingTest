package javaDataStructure.stackSample;

public class ArrayStack<E> implements StackInterface<E>{
    private E stack[];
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayStack(){
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }

    public ArrayStack(int n){
        stack = (E[]) new Object[n];
        topIndex = -1;
    }

    public boolean isFull() {
        return (topIndex==stack.length-1);
    }
    public void push(E newItem){
        if (isFull()){
            System.out.println("Stack이 모두 찼습니다. Stack을 비워주세요");
            }else{
            stack[++topIndex] = newItem;
        }
    }
    public boolean isEmpty() {
        return (topIndex<0);
    }
    public E top(){
        if(isEmpty()){
            return ERROR;
        }else{
            return stack[topIndex];
        }
    }

    public E pop(){
        if(isEmpty()){
            return ERROR;
        }else{
            return stack[topIndex--];
        }
    }

    public void popAll(){
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }
}
