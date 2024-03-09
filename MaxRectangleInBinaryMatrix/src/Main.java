
import java.util.Scanner;
import java.util.Stack;

// Find the largest rectangle in a 2D binary matrix filled ONLY with 1 and 0.
// The rectangles are build only from 1s, find the largest and return its area.
// There will always be a rectangle.(Description from InterviewBit)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        if(rows<2){
            System.out.println("You cannot build a matrix with value less than 2");
            return;
        }

        int[][] matrix = new int[rows][];
        int sides = 0;
        int finalSides = Integer.MAX_VALUE;
        int heights = 0;
        for (int row = 0; row < rows; row++) {
            String [] rowValues = scanner.nextLine().split("\\s+");
            matrix[row] = new int[rowValues.length];

            for (int col = 0; col < rowValues.length; col++) {
                matrix[row][col] = Integer.parseInt(rowValues[col]);
            }


        }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 1) {
                    sides++;

                }
            }
            if(finalSides>sides && sides>= 2){
                finalSides = sides;
            }

            if(finalSides <= sides){
                heights++;
            }
            sides = 0;
        }
        if(finalSides == Integer.MAX_VALUE){
            System.out.println("No rectangles found");
            return;
        }
        int rectangleArea = finalSides * heights;
        System.out.println(rectangleArea);

    }
}