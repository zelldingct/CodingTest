package hashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class countAnagram_4 {

    public int solution(String S, String T){
        int answer=0;
        int lt=0;

        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        for(char x: T.toCharArray()){
            mapT.put(x, mapT.getOrDefault(x,0)+1);
        }
        int L=T.length()-1;

        for(int i=0; i<L; i++){
            mapS.put(S.charAt(i), mapS.getOrDefault(S.charAt(i),0)+1);
        }

        for(int rt=L; rt<S.length(); rt++){
            mapS.put(S.charAt(rt),mapS.getOrDefault(S.charAt(rt),0)+1);
            if(mapS.equals(mapT)){
                answer++;
            }
            mapS.put(S.charAt(lt),mapS.get(S.charAt(lt))-1);
            if(mapS.get(S.charAt(lt))==0){
                mapS.remove(S.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        countAnagram_4 countAnagram = new countAnagram_4();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        System.out.println(countAnagram.solution(S,T));

    }
}
