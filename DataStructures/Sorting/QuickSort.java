package DataStructures.Sorting;

public class QuickSort {
    
    public void sort(int[] arr, int lb, int rb) {
        if (lb < rb) {
            int pos = partition(arr, lb, rb);
            sort(arr, lb, pos - 1);
            sort(arr, pos + 1, rb);
        }
    }

    private int partition(int[] arr, int lb, int rb) {
        int pivot = arr[lb];
        int j = lb;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > pivot) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[lb];
        arr[lb] = arr[j];
        arr[j] = temp;
        return j;
    }
}
