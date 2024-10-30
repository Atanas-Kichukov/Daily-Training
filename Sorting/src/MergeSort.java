import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[11];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] inputArray) {

        int inputLength = inputArray.length;
        //check if the array is only one element
        if (inputLength < 2) {
            return;
        }
    // find the middle of the array and give it as a size for one half
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        //the other halfs length should be like this for odd number count
        int[] rightHalf = new int[inputLength - midIndex];


        //populating the two halfs
        for (int l = 0; l < midIndex; l++) {
            leftHalf[l] = inputArray[l];
        }
        for (int r = midIndex; r < inputLength; r++) {
            rightHalf[r - midIndex] = inputArray[r];
        }

        //recursivly split each  half
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int l = 0;
        int r = 0;
        int s = 0;

        // check every mini array with other one and populate the regular input array
        while (l < leftSize && r < rightSize) {
            if (leftHalf[l] <= rightHalf[r]) {
                array[s] = leftHalf[l];
                l++;
            } else {
                array[s] = rightHalf[r];
                r++;
            }
            //s for sorted
            s++;
        }
        //check if the left array was bigger and add the number
        while (l < leftSize) {
            array[s] = leftHalf[l];
            l++;
            s++;
        }
        //check if the right array was bigger and add the number
        while (r < rightSize) {
            array[s] = rightHalf[r];
            r++;
            s++;
        }
    }
}
