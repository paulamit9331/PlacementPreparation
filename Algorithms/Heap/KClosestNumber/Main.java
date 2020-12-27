package Heap.KClosestNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {6, 5, 3, 2, 8, 10};
        int k = 3;
        int num = 7;

        System.out.println(kClosestNumber(arr, k, num));
    }

    private static ArrayList<Integer> kClosestNumber(int[] arr, int k, int num) {
        class Pair {
            int num;
            int diff;

            public Pair(int num, int diff) {
                super();

                this.num = num;
                this.diff = diff;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){

            @Override
            public int compare(Pair a, Pair b) {
                return (a.diff > b.diff)? -1: 1;
            }
        });
        for (int x : arr) {
            pq.add(new Pair(x, Math.abs(x - num)));
            if (pq.size() > k)
                pq.poll();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty())
            ans.add(pq.poll().num);
        return ans;
    }
}
