package javaDataStructure.listSample;
//Generic Version 그러나 실제로는 Generic 형태보다는 구체화 시켜서 사용하는 것이 명확하고 더 좋다. 물론 이게 범용성은 좋지만..
public class ArrayList<E> implements ListInterface<E> {
    private E[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public ArrayList(){
        item = (E[]) new Object[DEFAULT_CAPACITY];
        numItems=0;
    }
    private ArrayList(int n){
        item = (E[]) new Object[n];
        numItems=0;
    }

    @Override
    public void add(int index, E x) {
        if(numItems >= item.length || index <0 || index >numItems){
            System.out.println("index validation check Error1");
        } else{
            for(int i= numItems-1; i>=index; i--){
                item[i+1] = item[i];
            }
            item[index] = x;
            numItems++;

        }
    }

    @Override
    public void append(E x) {
        if(numItems >= item.length){
            System.out.println("validation check2");
        }else{
            item[numItems++]=x;
        }
    }

    @Override
    public E remove(int index) {

        if(isEmpty()||index<0||index>numItems-1){
            return null;
        }else {
            E tmp = item[index];
            for(int i = index; i <=numItems-2; i++){
                item[i]=item[i+1];}
            numItems--;


            return tmp;
        }
    }

    @Override
    public boolean removeItem(E x) {
        int k = 0;

        while(k <numItems && ((Comparable)item[k]).compareTo(x) != 0 )
            k++;

        if (k == numItems) {
            return false;
        } else {
            for (int i = k; i <= numItems - 2; i++) {
                item[i] = item[i + 1];}
            numItems--;

            return true;
        }

    }

    @Override
    public E get(int index) {
        if(index >= 0 && index <= numItems-1){
            return item[index];

        }else {
            return null;
        }
    }

    @Override
    public void set(int index, E x) {
        if(index >=0 && index <= numItems -1){
            item[index]=x;
        }else{
            System.out.println("index validation error3");
        }
    }

    private final int NOT_FOUND = -12345;
    @Override
    public int indexOf(E x) {
        int i = 0;
        for(i = 0; i<numItems; i++){
            if(((Comparable)item[i]).compareTo(x) ==0){
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public int len() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        item = (E[]) new Object[item.length];
        numItems = 0;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"test");
        list.add(0,"sample");
        list.add(0,"String");
        list.append("test2");
        list.remove(3);
        list.add(3,"added-at-3");
        list.add(1,"added-at-1");
        list.add(0,"added-at-0");
        list.append("appended");
        list.remove(1);
        list.removeItem("added-at-3");
        System.out.println(list.len());
        System.out.println(list.isEmpty());
        //list.clear();

        for(int i=0; i<list.len(); i++ ){
            System.out.print(list.get(i) +" ");
        }
    }
}
