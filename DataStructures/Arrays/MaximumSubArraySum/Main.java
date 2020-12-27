package DataStructures.Arrays.MaximumSubArraySum;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
        
        System.out.println(maximumSubArraySum(arr, arr.length));
    }

    private static int maximumSubArraySum(int[] arr, int n) {
        int maxSoFar = arr[0];
        int currMax = arr[0];
        for (int i = 0; i < n; i++) {
            currMax = Math.max(arr[i], arr[i] + currMax);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}