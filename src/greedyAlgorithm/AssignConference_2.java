package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if(this.end==o.end){return this.start-o.start;}
        else{return this.end-o.end;}
    }

}

public class AssignConference_2 {
    public int solution(ArrayList<Time> arr, int n) {
        int answer=0;
        Collections.sort(arr);
        int et=0;
        for(Time ob  : arr){
            if(ob.start>=et){
                answer++;
                et=ob.end;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AssignConference_2 assignConference = new AssignConference_2();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            arr.add(new Time(start,end));
        }
        System.out.println(assignConference.solution(arr, n));
    }
}
