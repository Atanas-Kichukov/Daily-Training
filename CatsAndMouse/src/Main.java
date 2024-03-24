import java.util.Arrays;
import java.util.Scanner;
//Description from hackerrank.
//Two cats and a mouse are at various positions on a line. You will be given their starting positions.
// Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel
// at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
//You are given a querie in the form of x,y and  z representing the respective positions for cats X and Y , and for mouse  Z. Complete the function  to return the appropriate answer to each query, which will be printed on a new line.
//
//If cat  catches the mouse first, print Cat A.
//If cat  catches the mouse first, print Cat B.
//If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] catsAndMouse = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int catA = catsAndMouse[0];
        int catB = catsAndMouse[1];
        int mouse = catsAndMouse[2];


        int fCatDistance = Math.abs(catA - mouse);
        int sCatDistance = Math.abs(catB - mouse);
        if(fCatDistance>sCatDistance){
            System.out.println("Second cat is going to eat the mouse");
        } else if (fCatDistance<sCatDistance) {
            System.out.println("First cat is going to eat the mouse");
        }
        else{
            System.out.println("The mouse is alive");
        }
    }
}