package javaDataStructure.listSample;

public interface ListInterface<E> {

    public void add(int i, E x);//i번째에 X를 넣는다.
    public void append(E x);//배열의 가장 마지막에  x를 넣는다.
    public E remove(int i);//배열의 i번째를 지운다.
    public boolean removeItem(E x);//원소 x를 지운다.
    public E get(int i);//배열의 i번째 원소를 가지고 온다.
    public void set(int i, E x);//i번째에  x를 넣는다.
    public int indexOf(E x);//원소 X가 몇번째에 존재하는 지 알려준다.
    public int len();//배열의 길이를 구한다.
    public boolean isEmpty();//배열이 비어있는지 확인한다.
    public void clear();//배열을 비운다.

}
