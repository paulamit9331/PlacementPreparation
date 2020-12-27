package BinarySearch.SearchInfiniteSortedArray;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;

        int high = getUpperBound(arr, key);

        System.out.println(searchElement(arr, 0, high, key));
    }

    private static int getUpperBound(int[] arr, int key) {
        int high = 1;
        while (arr[high] < key) {
            high *= 2;
        }
        return high;
    }

    private static int searchElement(int[] arr, int low, int high, int key) {
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
