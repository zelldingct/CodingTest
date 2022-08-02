package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int height,weight;

    Body(int height, int weight){
        this.height = height;
        this.weight = weight;

    }
    @Override
    public int compareTo(Body o){
        return o.height-this.height;
    }
}

public class PickPlayer_1 {

    public int solution(ArrayList<Body> arr, int n){
        int cnt=0;
        Collections.sort(arr);
        int max= Integer.MIN_VALUE;
        for(Body ob: arr){
            if(ob.weight>max){
                max=ob.weight;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        PickPlayer_1 pickPlayer = new PickPlayer_1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            arr.add(new Body(height, weight));
        }
        System.out.println(pickPlayer.solution(arr,n));
    }
}
