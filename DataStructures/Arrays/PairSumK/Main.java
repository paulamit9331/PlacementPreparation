package DataStructures.Arrays.PairSumK;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {7, 1, 5, 2, 3, 6};
        int k = 11;

        sumPairMethod1(arr, k);
        sumPairMethod2(arr, k);
    }

    private static void sumPairMethod1(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int otherNumPos = Arrays.binarySearch(arr, 0, arr.length - 1, k - arr[i]);
            if (otherNumPos > 0) {
                System.out.printf("(%d, %d)\n", arr[i], arr[otherNumPos]);
                return;
            }
        }
        System.out.println("No sum pair is present");
    }

    private static void sumPairMethod2(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0, j = arr.length - 1;
        while (i != j) {
            int sum = arr[i] + arr[j];
            if (sum < k)
                i++;
            else if (sum > k)
                j--;
            else {
                System.out.printf("(%d, %d)\n", arr[i], arr[j]);
                return;
            }
        }
        System.out.println("No sum pair is present");
    }
}
