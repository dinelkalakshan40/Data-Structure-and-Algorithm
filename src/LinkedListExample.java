import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10); //[10]

        System.out.println(list);
        list.addAll(List.of(20,30,40));

        System.out.println(list); //[10,20,30,40]

        list.add(0,5);
        System.out.println(list); //[5, 10, 20, 30, 40]

        System.out.println(list.get(1));
        System.out.println("get last element : " + list.getLast()); //40

        System.out.println("Removes the first element :" + list.remove());

        System.out.println(list); //[10, 20, 30, 40]

        System.out.println(list.remove(3)); //40

        System.out.println(list); //[10, 20, 30]
    }
}
