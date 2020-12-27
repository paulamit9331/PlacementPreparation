package BinarySearch.ReverseSortedSearch;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {45, 19, 12, 5, 0, -1, -3};
        int n = arr.length;
        int key = 12;

        System.out.println(binarySearch(arr, n, key));
    }

    private static int binarySearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
}
