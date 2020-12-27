package BinarySearch.FirstAndLastOccurance;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {-3, -1, -1, -1, 5, 7, 10, 12, 19, 45};
        int n = arr.length;
        int key = -1;

        int frirst = -1, last = -1;
        System.out.println(frirst = firstOccurance(arr, n, key));
        System.out.println(last = lastOccurance(arr, n, key));

        System.out.println("No of times " + key + " has occured: " + (last - frirst + 1));
    }

    private static int firstOccurance(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        if (key == arr[low])
            return low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                if (key == arr[mid - 1])    
                    high = mid - 1;
                else
                    return mid;
            } else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    private static int lastOccurance(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        if (key == arr[high])
            return high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid]) {
                if (key == arr[mid + 1])    
                    low = mid + 1;
                else
                    return mid;
            } else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
