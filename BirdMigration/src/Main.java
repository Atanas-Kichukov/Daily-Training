import java.util.*;
//Description from hackerrank
//Given an array of bird sightings where every element represents a bird type id,
// determine the id of the most frequently sighted type. If more than 1 type has
// been spotted that maximum amount, return the smallest of their ids.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] birds = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> birdCount = new HashMap<>();
        int bird = 0;
        int maxValue = 0;

        int smallerIndex = Integer.MAX_VALUE;
        for (int i = 0; i < birds.length; i++) {
            bird = birds[i];
            if (birdCount.containsKey(bird)) {
                birdCount.put(bird, birdCount.get(bird)+1);
            } else {
                birdCount.putIfAbsent(bird, 1);
            }

        }
        maxValue = Collections.max(birdCount.values());
        for (Map.Entry<Integer, Integer> entry : birdCount.entrySet()) {
            if (entry.getValue() == maxValue) {
                smallerIndex = Math.min(smallerIndex, entry.getKey());

            }



        }
        System.out.println(smallerIndex);
    }
}