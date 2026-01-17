package DSA;

import java.util.Arrays;

public class Dsa17 {

    public static void main(String[] args) {

        // pivot as last element
        int[] arr = {5, 4, 3, 2, 1};

        quickSort(arr, 0, arr.length - 1); // ❗ call quickSort

        System.out.println(Arrays.toString(arr)); // proper printing
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);

            // Sort left subarray
            quickSort(arr, low, pIndex - 1);

            // Sort right subarray
            quickSort(arr, pIndex + 1, high);
        }
    }

    // Partition using last element as pivot
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

