package javaDataStructure.listSample;
import javaDataStructure.listSample.Node;

public class LinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int numItems;

    public LinkedList() {
        numItems = 0;
        head = new Node<>(null, null);
    }


    public void add(int index, E item) {
        if(index >=0 && index <= numItems) {
            Node<E> prevNode = getNode(index-1);
            Node<E> newNode = new Node<>(item,prevNode.next);
            prevNode.next=newNode;
            numItems++;
        }
    }

    public void append(E item){
        Node<E> prevNode = head;
        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }
        Node<E> newNode = new Node<>(item, null);
        prevNode.next = newNode;
        numItems++;
    }

    public E remove(int index) {
        if(index >= 0 && index < numItems){
            Node<E> prevNode = getNode(index - 1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            numItems--;
            return currNode.item;
        }else{
            return null;
        }
    }

    public boolean removeItem(E x) {
        Node<E> currNode = head;
        Node<E> prevNode;
        for(int i=0; i<numItems; i++){
            prevNode = currNode;
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x) == 0) {
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    public E get(int index){
        if(index >=0 && index <= numItems-1){
            return getNode(index).item;
        }else{
            return null;
        }
    }

    public Node<E> getNode(int index){
        if ( index >= -1 && index <= numItems -1 ) {
            Node<E> currNode = head;
            for (int i = 0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        }else{
            return null;
        }
    }

    public void set(int index, E x){
        if(index >= 0 && index <= numItems -1){
            getNode(index).item = x;
        }else{
            System.out.println("에러발생1");
        }
    }

    public final int NOT_FOUND =-12345;

    public int indexOf(E x){
        Node<E> currNode = head;
        int i;
        for(i=0; i<numItems; i++){
            currNode = currNode.next;
            if(((Comparable)(currNode.item)).compareTo(x) ==0){
                return i;
            }
        }
        return NOT_FOUND;
    }

    public int len() {
        return numItems;
    }

    public boolean isEmpty(){
        return numItems ==0;
    }

    public void clear(){
        numItems = 0;
        head = new Node<>(null, null);
    }

    public static void main(String[] arEs) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0,300);
        list.add(0,200);
        list.add(0,100);
        list.append(500);
        list.append(600);
        list.remove(3);
        list.add(3,250);
        list.add(1,50);
        list.add(0,10);
        list.append(700);
        list.remove(1);
        list.removeItem(600);

        for(int i= 0; i<list.len(); i++ ){
            System.out.println(list.get(i));
        }
    }
}
