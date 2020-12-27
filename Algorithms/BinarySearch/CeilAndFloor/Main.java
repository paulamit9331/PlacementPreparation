package BinarySearch.CeilAndFloor;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {2, 4, 6, 7, 8, 10, 34, 45};
        int n = arr.length;
        int key = 15;

        String str = "acehk";
        char ch = 'f';

        System.out.println(ceilElement(arr, n, key));
        System.out.println(floorElement(arr, n, key));

        System.out.println(nextAlphabet(str.toCharArray(), str.length(), ch));
        System.out.println(prevAlphabet(str.toCharArray(), str.length(), ch));
    }

    private static int ceilElement(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        int smallestLargerIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid]) {
                smallestLargerIndex = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return smallestLargerIndex;
    }

    private static int floorElement(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        int largestSmallerIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else {
                low = mid + 1;
                largestSmallerIndex = mid;
            }
        }
        return largestSmallerIndex;
    }

    private static int nextAlphabet(char[] charArray, int n, char ch) {
        int low = 0, high = n - 1;
        int smallestLargerIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ch == charArray[mid])
                return (mid == n - 1)? -1: (mid + 1);
            else if (ch < charArray[mid]) {
                smallestLargerIndex = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return smallestLargerIndex;
    }

    private static int prevAlphabet(char[] charArray, int n, char ch) {
        int low = 0, high = n - 1;
        int largestSmallerIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ch == charArray[mid])
                return (mid == 0)? -1: (mid - 1);
            else if (ch < charArray[mid])
                high = mid - 1;
            else {
                largestSmallerIndex = mid;
                low = mid + 1;
            }
        }
        return largestSmallerIndex;
    }
}