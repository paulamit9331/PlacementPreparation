package BinarySearch.NumberOfTimeRotated;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {12, 19, 45, -3, -1, -1, -1, 5, 7, 10};
        int n = arr.length;

        System.out.println(noOfTimeRotated(arr, n));
    }

    private static int noOfTimeRotated(int[] arr, int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int left = (mid == 0)? (n - 1): (mid - 1);
            int right = (mid == n - 1)? 0: (mid + 1);

            if ((arr[mid] < arr[left]) && (arr[mid] < arr[right]))
                return mid;
            else if (arr[low] <= arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return (arr[0] < arr[n - 1])? 0: n - 1;
    }
}
