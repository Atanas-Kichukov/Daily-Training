import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        System.out.println(Arrays.toString(array));

        quickSort(array,0, array.length - 1);
        System.out.println("sorted");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] numbers,int lowIndex,int highIndex) {
        if(lowIndex>=highIndex){
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex + 1) + lowIndex;
        int pivot = numbers[pivotIndex];
        //places the pivot at the end
        swap(numbers, pivotIndex, highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            //leftpointer moves the left site of the array and rightpointer of the right
            while (numbers[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (numbers[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(numbers,leftPointer,rightPointer);
        }
        //returns the pivot from where it started
        swap(numbers,leftPointer,highIndex);

        quickSort(numbers,lowIndex,leftPointer - 1);
        quickSort(numbers,leftPointer + 1, highIndex);
    }

    public static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }
}
