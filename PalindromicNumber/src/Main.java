import java.util.*;
//Напишете програма, която получава много голямо цяло число N и отпечатва най-голямото число - палиндром,
// което се получава чрез пермутация (разместване) на цифрите на даденото число N. Ако не е възможно да
// се получи число-палиндром, отпечатайте "No palindromic number available."
//Вход
//•	N – цяло число в диапазона [1…1 000 000 000 000 000]
//Source: Softuniada 2024
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : number.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        }

        List<Character> half = new ArrayList<>();
        for (Character key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count % 2 != 0) {
                System.out.println("No palindromic number available.");
                return;
            }
            for (int i = 0; i < count / 2; i++) {
                half.add(key);
            }
        }

        StringBuilder palindromicNumber = new StringBuilder();
        half.sort(Comparator.reverseOrder());
        for (Character character : half) {
            palindromicNumber.append(character);
        }
        for (int j = half.size() - 1; j >= 0; j--) {
            palindromicNumber.append(half.get(j));
        }
        System.out.println(palindromicNumber.toString());
    }
}
