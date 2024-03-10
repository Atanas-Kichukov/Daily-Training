import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        try {
           number = Integer.parseInt(scanner.nextLine());

        }
        catch (NumberFormatException ex){
            System.out.println("The value is too large for int try a lower number");
            return;
        }
        String newNumber;
        if(number< 0){
            newNumber = "-";
            number = Math.abs(number);
        }
        else{
            newNumber = "";
        }

        while (number > 0) {
            int numberToAdd = number % 10;
            newNumber += numberToAdd;

            number = number / 10;
        }
        System.out.println(Integer.valueOf(newNumber));
    }
}