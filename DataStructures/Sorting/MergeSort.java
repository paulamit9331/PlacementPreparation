package DataStructures.Sorting;

public class MergeSort {
    
    public void sort(int[] arr, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] leftArr = new int[mid];
        for (int i = 0; i < mid; i++)
            leftArr[i] = arr[i];
        
        int[] rightArr = new int[n - mid];
        for (int i = mid; i < n; i++)
            rightArr[i] = arr[i];

        sort(leftArr, mid);
        sort(rightArr, n - mid);
        mergeSort(arr, leftArr, rightArr, mid, n - mid);
    }

    private void mergeSort(int[] arr, int[] leftArr, int[] rightArr, int leftLen, int rightLen) {
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }
        while (i < leftLen)
            arr[k++] = leftArr[i++];

        while (j < rightLen)
            arr[k++] = rightArr[j++];
    }
}
