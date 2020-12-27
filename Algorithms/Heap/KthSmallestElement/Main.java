package Heap.KthSmallestElement;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {12, 19, 45, -3, 5, 7, 10};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
    }

    private static int kthSmallest(int[] arr, int k) {
        // max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){

            @Override
            public int compare(Integer a, Integer b) {
                return (a > b)? -1: (a == b)? 0: 1;
            }
        });
        for (int x : arr) {
            pq.add(x);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}