package BinarySearch.PeakElement;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 5, 9, 2, 0};
        int n = arr.length;

        System.out.println(peakElement(arr, n));
    }

    private static int peakElement(int[] arr, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[mid + 1] > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}