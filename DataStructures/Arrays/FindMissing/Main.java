package DataStructures.Arrays.FindMissing;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 2, 8, 9, 11, 15, 12, 13};
        
        findSingleMissingElement(arr);
        findMultipleMissingElement(arr);
        findMultipleMissingUnsorted(arr);
    }

    // for sorted array single missing element
    private static void findSingleMissingElement(int[] arr) {
        int diff = arr[0] - 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - i != diff) {
                System.out.println(arr[i - 1] + 1);
                return;
            }
        }
        System.out.println("No element is missing");
    }

    private static void findMultipleMissingElement(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        boolean[] table = new boolean[max + 1];
        Arrays.fill(table, false);

        Arrays.stream(arr).forEach(i-> table[i] = true);

        for (int i = min; i < table.length; i++)
            if (!table[i])
                System.out.print(i + " ");

        System.out.println();
    }

    private static void findMultipleMissingUnsorted(int[] arr) {
    }
}
