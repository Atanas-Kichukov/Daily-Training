import java.util.*;
import java.util.stream.Collectors;

///Given an array of size N, find the majority
//element. The majority element is the element
//that appears more than floor(N/2) times.
//You may assume that the array is non-empty
//and the majority element always exist in the array.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbersInArray = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toArray(Integer[]::new);
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        List<Integer>asf = new ArrayList<>();

        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for (int i = 0; i < numbersInArray.length; i++) {
            if (!numbers.containsKey(numbersInArray[i])) {
                numbers.put(numbersInArray[i], 1);
            } else {
                int currentValue = numbers.get(numbersInArray[i]);
                numbers.put(numbersInArray[i], currentValue + 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);
    }
}