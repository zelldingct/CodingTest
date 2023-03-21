package javaDataStructure.listSample;
//Integer Version
public class IntegerArrayList implements IntegerListInterface{
    private Integer[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    public IntegerArrayList(){
        item = new Integer[DEFAULT_CAPACITY];
        numItems=0;
    }
    public IntegerArrayList(int n){
        item = new Integer[n];
        numItems=0;
    }

    @Override
    public void add(int index, Integer x) {
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
    public void append(Integer x) {
        if(numItems >= item.length){
            System.out.println("validation check2");
        }else{
            item[numItems++]=x;
        }
    }

    @Override
    public Integer remove(int index) {

        if(isEmpty()||index<0||index>numItems-1){
         return null;
     }else {
            Integer tmp = item[index];
         for(int i = index; i <=numItems-2; i++){
             item[i]=item[i+1];}
             numItems--;


         return tmp;
     }
    }

    @Override
    public boolean removeItem(Integer x) {
        int k = 0;

        while(k <numItems && item[k].compareTo(x) != 0 )
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
    public Integer get(int index) {
        if(index >= 0 && index <= numItems-1){
            return item[index];

        }else {
            return null;
        }
    }

    @Override
    public void set(int index, Integer x) {
        if(index >=0 && index <= numItems -1){
            item[index]=x;
        }else{
            System.out.println("index validation error3");
        }
    }

    private final int NOT_FOUND = -12345;
    @Override
    public int indexOf(Integer x) {
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
        item = new Integer[item.length];
        numItems = 0;
    }

    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();
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
        for(int i=0; i<list.len(); i++ ){
            System.out.println(list.get(i));
        }

    }
}
