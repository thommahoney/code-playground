import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(4, 3, 5, 1, 2);

        // yuck
        Collections.sort(integers, (Integer i1, Integer i2) -> i1.compareTo(i2));

        System.out.println(integers);
    }
}
