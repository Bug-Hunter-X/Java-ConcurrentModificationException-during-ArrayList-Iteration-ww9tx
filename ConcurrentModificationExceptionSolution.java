import java.util.*;
public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println(list); // Output: [apple, cherry]
    }
}