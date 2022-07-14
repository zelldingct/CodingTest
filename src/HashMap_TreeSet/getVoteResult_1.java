package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class getVoteResult_1 {
    public char solution(int n, String s){
        char answer='a';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        getVoteResult_1 getVoteResult = new getVoteResult_1();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
        System.out.println(getVoteResult.solution(n,str));
    }
}
