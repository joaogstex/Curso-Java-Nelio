import java.util.ArrayList;
import java.util.List;

public class PrintService {
    static List<Integer> list = new ArrayList<>();

    public static void addValue(int value) {
        list.add(value);
    }

    public static int first() {
        Integer firstValue = list.get(0);
        if (!list.isEmpty()) {
            return firstValue;
        } else {
            throw new IllegalStateException("Lista vazia");
        }
    }

    public static void print() {
        System.out.println(list);
        if (!list.isEmpty()) {
            System.out.println("First: " + first());
        }
    }

}