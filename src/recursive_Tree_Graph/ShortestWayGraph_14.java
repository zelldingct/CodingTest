package recursive_Tree_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestWayGraph_14 {
    //BFS를 이용한 풀이
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        ch[v]=1;
        dis[v]=0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv=queue.poll();
            for(int nv:graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[cv]+1;
                }
            }
        }

    }

    public static void main(String[] args) {
        ShortestWayGraph_14 searchRoute = new ShortestWayGraph_14();
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];
        for(int i=0; i<m; i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            graph.get(a).add(b);
        }
        //ch[1]=1;
        searchRoute.BFS(1);
        for(int i=2; i<=n; i++){
        System.out.println(i+" : "+dis[i]);
        }
    }


}
