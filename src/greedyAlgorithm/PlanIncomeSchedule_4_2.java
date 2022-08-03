package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

class Plan2 implements Comparable<Plan2> {
    int income;
    int term;
    public Plan2(int income, int term){
        this.income = income;
        this.term = term;
    }

    @Override
    public int compareTo(Plan2 o) {
        if(this.term==o.term){return o.income-this.income;}
        else{return o.term-this.term;}
    }
}

public class PlanIncomeSchedule_4_2 {
    static int n;
    static int answer;
    boolean flag = false;
    static int max;
    public void DFS(int L, ArrayList<Plan2> arr){

        if(flag) return;
        if(L==0){
            flag=true;
        }else{
            for(int i=0; i<arr.size(); i++){
               int Num = L;
               int tmp=Integer.MIN_VALUE;
               if(arr.get(i).term==Num){
                   tmp=Math.max(tmp,arr.get(i).income);
                   answer+=tmp;
                   DFS(L-1,arr);

               }
            }
        }

    }


    public static void main(String[] args) {
        PlanIncomeSchedule_4_2 planIncomeSchedule = new PlanIncomeSchedule_4_2();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        max=Integer.MIN_VALUE;
        ArrayList<Plan2> arr = new ArrayList<>();



        for(int i=0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr.add(new Plan2(a,b));
        }

        for(int i=0; i<n; i++ ){
            max=Math.max(max,arr.get(i).term);
        }

        planIncomeSchedule.DFS(max, arr);
        System.out.println(answer);
    }
}
