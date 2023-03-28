package javaDataStructure.queueSample;

import javaDataStructure.listSample.ArrayList;
import javaDataStructure.listSample.ListInterface;

public class listQueue<E> implements QueueInterface<E>{

    private ListInterface<E> list;

    public listQueue(){
        list = new ArrayList<E>();
    }
    @Override
    public void enqueue(E x) {
        list.append(x);
    }

    @Override
    public E dequeue() {
        return list.remove(0);
    }

    @Override
    public E front() {
        return list.get(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void dequeueAll() {
        list.clear();
    }
}
