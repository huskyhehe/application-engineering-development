import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        arrayListExample();

    }

    public static void arrayListExample() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2,-5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);

        list.addAll(list2);
    }

    public static void hashSetExample() {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
    }
}
