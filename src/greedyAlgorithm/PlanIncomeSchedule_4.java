package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Plan implements Comparable<Plan> {
    int income;
    int term;
    public Plan(int income, int term){
        this.income = income;
        this.term = term;
    }

    @Override
    public int compareTo(Plan o) {
        return o.term-this.term;
    }
}

public class PlanIncomeSchedule_4 {
    static int n;
    static int max = Integer.MIN_VALUE;
    public int solution(ArrayList<Plan> arr){
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for(;j<n;j++){
                if(arr.get(j).term<i){break;}
                pQ.offer(arr.get(j).income);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        PlanIncomeSchedule_4 planIncomeSchedule = new PlanIncomeSchedule_4();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Plan> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr.add(new Plan(a,b));
            if(b>max) max=b;
        }
        System.out.println(planIncomeSchedule.solution(arr));
    }
}
