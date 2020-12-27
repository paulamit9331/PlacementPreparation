package DataStructures.Sorting;

public class BubbleSort {

    public void sort(int[] arr, int n) {
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}