package BinarySearch.ForwardSortedSearch;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {-3, -1, 0, 5, 12, 19, 45};
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
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}