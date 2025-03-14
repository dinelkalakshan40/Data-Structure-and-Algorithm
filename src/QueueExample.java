import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        //add data
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        System.out.println("Front element: " +queue.peek()); //peck element

        System.out.println("Size :" +queue.size());

        System.out.println(queue.poll());//remove first element

        System.out.println(queue);

        System.out.println(queue.contains(10));//search element
    }
}
