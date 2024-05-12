import java.util.Arrays;
import java.util.Scanner;
//Напишете програма, която ще работи с масив от цели числа и трябва да намерите колко е броят на под последователностите с аритметична прогресия в масива.
//Забележка: Празен масив или масив с един елемент също е аритметична прогресия.
//Вход
//	масив от цели числа, разделени с интервал
//	Броят на числата в масива ще е в интервала [1…10]
//	Числaта в масива ще са цели числа в интервала [1…100]
//	Масива няма да съдържа повтарящи се числа
//Изход
//Да се отпечата броят на намерените аритметични прогресии.
//Source: Softuniada 2024

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int count = arr.length + 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                int next = arr[j] + diff;
                count++;
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[k] == next) {
                        count++;
                        next += diff;
                    }
                }
            }
        }
        System.out.println(count);
    }
}