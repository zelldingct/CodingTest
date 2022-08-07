package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    int area, height, weight;
    public Brick(int area, int height, int weight){
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.area-this.area;
    }
}
public class MakeHighestTower_LIS_4 {

    static int[] dy;

    public int solution(ArrayList<Brick> arr){

        int answer=0;
        Collections.sort(arr);
        dy[0]=arr.get(0).height;
        answer=dy[0];
        for(int i=1; i<arr.size(); i++){
            int max_h=0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).weight>arr.get(i).weight && dy[j]>max_h){
                    max_h=dy[j];
                }
            }
            dy[i]=max_h + arr.get(i).height;
            answer=Math.max(answer,dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        MakeHighestTower_LIS_4 makeHighestTower = new MakeHighestTower_LIS_4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy=new int[n];
        for(int i=0; i<n; i++){
            int area = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr.add(new Brick(area,height,weight));
        }
        System.out.println(makeHighestTower.solution(arr));
    }
}
