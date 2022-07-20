import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<10;i++){
            q.offer(i);
        }
        System.out.println(q.poll());
    }
}
