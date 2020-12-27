package DataStructures.Arrays.FindDuplicates;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 1, 4, 7, 0, 1, 6, 3, 5, 0};

        findDuplicates(arr);
    }

    private static void findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr).forEach(i-> map.put(i, map.getOrDefault(i, 0) + 1));

        for (int key : map.keySet())
            if (map.get(key) > 1)
                System.out.println("Duplicate found: " + key);
    }
}