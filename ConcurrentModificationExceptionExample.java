public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        for (String fruit : list) {
            if (fruit.equals("banana")) {
                list.remove(fruit); // ConcurrentModificationException
            }
        }
    }
}