
import java.util.*;
import java.util.stream.Collectors;
//Напишете програма, която получава поредица от цели числа, разделени с интервал. Намерете "върховия елемент" в дадената поредица. "Върхов елемент" е този, който е по-голям от съседите си.
//Пример: Поредицата от цели числа 3 6 9 2 4, върховият елемент е 9, защото е по-голям от съседите си 6 и 2.
//Забележка 1: Ако в една поредица намерите два или повече върхови елемента, отпечатайте този, който е с най-голяма стойност.
//Забележка 2: Няма да има случай, в който да не може да се намери върхов елемент или той да не е наличен.
//Source: Софтуниада 2024
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> peakValues = new ArrayList<>();
        //1 4 3 5 6
        for (int i = 1; i < input.size() - 1; i++) {
            int valueToCheck = input.get(i);
            if(valueToCheck > input.get(i - 1) && valueToCheck > input.get(i + 1)){
                peakValues.add(valueToCheck);
            }
        }
       peakValues.sort((v1,v2) -> v2.compareTo(v1));
        System.out.println(peakValues.get(0));
    }

}