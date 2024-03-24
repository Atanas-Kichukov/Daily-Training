import java.util.*;
//Description from hackerrank:
/*
An arcade game player wants to climb to the top of the leaderboard and track their ranking. The game uses Dense Ranking, so its leaderboard works like this:
The player with the highest score is ranked number  on the leaderboard.
Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
Example input and ouput:
100 90 90 80 75 60
50 65 77 90 102
6 5 4 2 1
-----------------------
100 90 90 80
70 80 105

 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> rank = new LinkedHashSet<>();
        
        for (int i : input) {
            rank.add(i);
        }
        int diff = input.length - rank.size();
        int[] playerScore = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] results = new int[playerScore.length];

        int count = 0;
        for (int i = 0; i < playerScore.length; i++) {
            int score = playerScore[i];

            for (Integer toBeat : rank) {
                count++;
                if(score>=toBeat){

                    results[i] = count;
                    break;
                }
            }

            count=0;

        }

        for (int result : results) {
            if(result ==0){
                System.out.print(results.length + diff + " ");
            }else {
                System.out.print(result + " ");
            }
        }
    }
}
