import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int a = array[0];
        int b = array[1];
        int c = array[2];


        if (a + b + c == 13){
            System.out.println("Yes");
        }else if(Math.abs(a) + Math.abs(b) + Math.abs(c) == 13){
            System.out.println("Yes");
        }else if((a*-1) + b +c == 13){
            System.out.println("Yes");
        }else if(a + (b*-1) + c == 13){
            System.out.println("Yes");
        }else if (a + b + (c*-1) == 13){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}