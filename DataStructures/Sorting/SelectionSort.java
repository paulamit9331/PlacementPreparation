package DataStructures.Sorting;

public class SelectionSort {
    
    public void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; i < n; i++) {
                if (arr[j] < arr[minPos])
                    minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[0];
            arr[0] = temp;
        }
    }
}