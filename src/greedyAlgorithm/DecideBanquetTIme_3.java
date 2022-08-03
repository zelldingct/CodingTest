package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2>{
    public int time;
    public char state;

    Time2(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time2 o) {
        if(this.time==o.time){return this.state-o.state;}
        else{return this.time - o.time;}
    }

}

public class DecideBanquetTIme_3 {
    public int solution(ArrayList<Time2> arr){
        int answer=Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt=0;
        for(Time2 ob: arr){
            if(ob.state=='s'){
                cnt++;
            }else{
                cnt--;

            }
            answer=Math.max(answer,cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        DecideBanquetTIme_3 decideBanquetTIme = new DecideBanquetTIme_3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sT=scanner.nextInt();
            int eT=scanner.nextInt();
            arr.add(new Time2(sT, 's'));
            arr.add(new Time2(eT,'e'));
        }
        System.out.println(decideBanquetTIme.solution(arr));
    }
}
