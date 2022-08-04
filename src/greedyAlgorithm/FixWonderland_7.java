package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Info implements Comparable<Info> {
    int s, e, cost;
    public Info(int s, int e, int cost){
        this.s = s;
        this.e = e;
        this.cost = cost;
    }

    @Override
    public int compareTo(Info o) {
        return this.cost-o.cost;
    }
}

public class FixWonderland_7 {

    public static union(){

    }

    public static void main(String[] args) {
        FixWonderland_7 fixWonderland = new FixWonderland_7();
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        ArrayList<Info> arr = new ArrayList<>();

        for(int i=0; i<e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Info(a,b,c));
        }
        System.out.println();
    }
}
