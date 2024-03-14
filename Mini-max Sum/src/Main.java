import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Description from hackerrank: Given five positive integers,
// find the minimum and maximum values that can be calculated
// by summing exactly four of the five integers. Then print the respective
// minimum and maximum values as a single line of two space-separated long integers.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();


        long sum = 0;
        long resultMin = Integer.MAX_VALUE;
        long resultMax = Integer.MIN_VALUE;
        if(arr.size() == 1){
            resultMax = arr.get(0);
            resultMin = arr.get(0);
            System.out.print(resultMin + " " + resultMax);
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            if(resultMin>sum - arr.get(i)){
                resultMin = sum - arr.get(i);
            }
            if(resultMax<sum - arr.get(i)){
                resultMax = sum - arr.get(i);
            }
        }
        System.out.print(resultMin + " " + resultMax);
    }

}
