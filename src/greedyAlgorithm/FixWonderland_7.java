package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
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
    static int[] unf;

    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) unf[fa]=fb;


    }

    public static void main(String[] args) {
        FixWonderland_7 fixWonderland = new FixWonderland_7();
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        unf = new int[v + 1];
        ArrayList<Info> arr = new ArrayList<>();

        for (int i = 1; i <= v; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            arr.add(new Info(a, b, c));
        }

        int answer = 0;

        Collections.sort(arr);

        for (Info ob : arr) {
            int fv1 = Find(ob.s);
            int fv2 = Find(ob.e);
            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.s, ob.e);
            }
        }
        System.out.println(answer);
        for (int i = 0; i < e; i++) {
            System.out.println(arr.get(i).s + " " + arr.get(i).e + " " + arr.get(i).cost);
        }
        for(int x : unf){
            System.out.print(x+" ");
        }
    }
}
