package DataStructures.Arrays.SortZeroOneTwo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 1, 1, 0, 0, 2, 0, 1, 1, 0, 2, 0};
        int n = arr.length;

        System.out.println(Arrays.toString(sort(arr, n)));
    }

    private static int[] sort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        // while (mid <= high) {
        //      if (arr[mid] == 1) {
        //          mid++;
        //      } else if (arr[mid] == 0) {
        //          int temp = arr[low];
        //          arr[low] = arr[mid];
        //          arr[mid] = temp;
        //          low++;  mid++;
        //      } else {
        //          int temp = arr[high];
        //          arr[high] = arr[mid];
        //          arr[mid] = temp;
        //          high--;
        //      }
        // }

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;  mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
       }
        return arr;
    }
}