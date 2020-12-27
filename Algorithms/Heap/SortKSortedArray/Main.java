package Heap.SortKSortedArray;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        System.out.println(Arrays.toString(sort(arr, k)));
    }

    private static int[] sort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;
        for (int x : arr) {
            pq.add(x);
            if (pq.size() > k)
                arr[index++] = pq.poll();
        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
        return arr;
    }
}
