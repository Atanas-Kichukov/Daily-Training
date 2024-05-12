import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
///Дадени са две цели числа N и M, където N < M.
//Намерете всички "специални" числа в диапазона от N до М (включително).
//Едно число се нарича "специално" число, ако абсолютната разликата между всеки две съседни цифри е 1.
//Например:
//•	123 е специално, защото разликата между 1 и 2 е 1, и разликата между 2 и 3 също е 1.
//•	421 не е специално, защото разликата между 4 и 2 е 2, което е по-голямо от 1.
//Вход
//•	N – цяло число в диапазона [10…30 000 000]
//•	M – цяло число в диапазона [10…30 000 000]
//Изход
//Да се отпечатат всички специални числа в диапазона N до М в нарастващ ред, всяко на нов ред.
//Source: Softuniada 2024
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        List<Integer> results = new ArrayList<>();
        int count = 1;
        for (int i = a; i <= b; i++) {
           String number = Integer.toString(i);
            for (int j = 0; j < number.length() - 1; j++) {
                int numberA = Character.getNumericValue(number.charAt(j));
                int numberB = Character.getNumericValue(number.charAt(j + 1));
                int diff = Math.abs(numberA - numberB);
                if(diff == 1){
                    count++;
                }
            }
            if(count == number.length()){
                results.add(Integer.valueOf(number));
            }
            count = 1;
        }

        for (Integer result : results) {
            System.out.println(result);
        }

    }
}