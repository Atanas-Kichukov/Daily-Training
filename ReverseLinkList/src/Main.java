
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Reverse the list from a given index to another given index.
// The array may contain not only numbers. (Description is from interviewBit).
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split("\\s+");
        List<String> input = Arrays.asList(elements);
        int startIndex = Integer.parseInt(scanner.nextLine()) - 1;
        int endIndex = Integer.parseInt(scanner.nextLine()) - 1;

        while (startIndex < endIndex) {
            String temp = input.get(startIndex);
            input.set(startIndex,input.get(endIndex));
            input.set(endIndex,temp);

            startIndex++;
            endIndex--;
        }

        for (String s : input) {
            System.out.print(s + " ");
        }
    }
}