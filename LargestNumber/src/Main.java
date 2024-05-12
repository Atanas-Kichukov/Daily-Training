import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Напишете програма, която получава масив от цели числа, разделени с интервал и цяло число K (брой на най-големите числа). Намерете K на брой от най-големите стойности на масива от цели числа.
//Пример: Нека кажем, че K = 4, това означава, че трябва да намерим четирите най-големи числа от масива.
//Вход
//•	масив от числа, разделени с интервал
//o	Броят на числата в масива ще е [1…100]
//o	Всички числа в масива, ще са цели числа в диапазона [-1 000 000...1 000 000]
//•	К – цяло число в интервала [1….10]
//Изход
//Да се отпечатат най-големите числа във възходящ ред, всяко на нов ред
//Source: Softuniada 2024
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int countBiggestNumbers = Integer.parseInt(scanner.nextLine());
        input.sort(Comparator.naturalOrder());
        for (int i = input.size() - countBiggestNumbers  ; i < input.size(); i++) {
            System.out.println(input.get(i));
        }
    }
}