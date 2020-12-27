package DataStructures.Sorting;

public class InsertionSort {
    
    public void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int pos = i;
            int min = arr[i];
            while (pos > 0 && arr[pos - 1] > min) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = min;
        }
    }
}
