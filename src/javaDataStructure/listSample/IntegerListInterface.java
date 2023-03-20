package javaDataStructure.listSample;

public interface IntegerListInterface {
    public void add(int i, Integer x);//i번째에 정수 X를 넣는다.
    public void append(Integer x);//배열의 가장 마지막에 정수 x를 넣는다.
    public Integer remove(int i);//배열의 i번째를 지운다.
    public boolean removeItem(Integer x);//원소 x를 지운다.
    public Integer get(int i);//배열의 i번째 원소를 가지고 온다.
    public void set(int i, Integer x);//i번째에 정수 x를 넣는다.
    public int indexOf(Integer x);//원소 X가 몇번째에 존재하는 지 알려준다.
    public int len();//배열의 길이를 구한다.
    public boolean isEmpty();//배열이 비어있는지 확인한다.
    public void clear();//배열을 비운다.

}
