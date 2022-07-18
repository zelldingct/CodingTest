package hashMap_TreeSet;

public class Test {
    public static void main(String[] args) {

        System.out.println(random());
        System.out.println(array());
    }

     public static int random(){
        double x = Math.random();
        int y = (int)Math.round(x*100);
        return y;

    }

    public static int array() {
        int[][] x= new int[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++)
                x[i][j] = i +j;
        }

        return x.length;
    }
}
