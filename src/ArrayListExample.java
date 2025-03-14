import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer>arrayList =new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList); //[10, 20, 30]

        System.out.println(arrayList.get(1)); //20

        arrayList.set(0,5);
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(20));

        System.out.println(arrayList.isEmpty());
    }
}
