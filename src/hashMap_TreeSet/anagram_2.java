package hashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class anagram_2 {

    public String solution (String A, String B){
        String answer="YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char alpha:A.toCharArray()){
            map.put(alpha, map.getOrDefault(alpha,0)+1 );
        }
        for(char alpha:B.toCharArray()){
            if(!map.containsKey(alpha)||map.get(alpha)==0) return "NO";
            map.put(alpha, map.get(alpha)-1 );
        }
        return answer;
    }

    public static void main(String[] args) {
        anagram_2 anagram = new anagram_2();
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        System.out.println(anagram.solution(A,B));
    }
}
