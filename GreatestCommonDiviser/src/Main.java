import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int divisor = 0;
        if (firstNum == 0) {
            divisor = secondNum;
        } else if (secondNum == 0) {
            divisor = firstNum;
        }
        for (int i = 1; i <= firstNum && i <= secondNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                divisor = i;
            }

        }
        System.out.println(divisor);

    }

}