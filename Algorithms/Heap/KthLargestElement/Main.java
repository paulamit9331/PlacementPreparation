package Heap.KthLargestElement;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {12, 19, 45, -3, 5, 7, 10};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
    }

    private static int kthSmallest(int[] arr, int k) {
        // min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) {
            pq.add(x);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}