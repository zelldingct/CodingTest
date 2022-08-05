package greedyAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Line implements Comparable<Line>{
    public int vex;
    public int cost;
    Line(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Line o) {
        return this.cost-o.cost;
    }
}

public class FixWonderland_PriorityQueue_8 {
    public static void main(String[] args) {
      FixWonderland_PriorityQueue_8 fixWonderland_priorityQueue = new FixWonderland_PriorityQueue_8();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Line>> graph = new ArrayList<ArrayList<Line>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Line>());
        }
        int[] ch = new int[n+1];
        for(int i=0; i<m; i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            graph.get(a).add(new Line(b, c));
            graph.get(b).add(new Line(a,c));
        }
        int answer=0;
        PriorityQueue<Line> pQ = new PriorityQueue<>();
        pQ.offer(new Line(1,0));
        while(!pQ.isEmpty()){
            Line tmp=pQ.poll();
            int ev =tmp.vex;
            if(ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for(Line ob: graph.get(ev)){
                    if(ch[ob.vex]==0){
                        pQ.offer(new Line(ob.vex, ob.cost));
                    }
                }
            }
            System.out.println(answer);
        }



    }
}
