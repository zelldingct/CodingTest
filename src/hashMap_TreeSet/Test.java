package hashMap_TreeSet;

public class Test {
    public static void main(String[] args) {

        System.out.println(random());
    }

     public static int random(){
        double x = Math.random();
        int y = (int)Math.round(x*100);
        return y;

    }
}
