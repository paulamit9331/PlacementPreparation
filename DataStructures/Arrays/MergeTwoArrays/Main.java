package DataStructures.Arrays.MergeTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] arr1 = new int[] {7, 1, 5, 2, 3, 6};
        int[] arr2 = new int[] {3, 8, 6, 20, 7};

        System.out.println(union(arr1, arr2, arr1.length, arr2.length));
        System.out.println(intersection(arr1, arr2, arr1.length, arr2.length));
    }

    private static ArrayList<Integer> union(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                list.add(arr1[i++]);
            else if (arr1[i] > arr2[j])
                list.add(arr2[j++]);
            else {
                list.add(arr1[i]);
                i++; j++;
            }
        }
        while (i < m) {
            list.add(arr1[i++]);
        }
        while (j < n) {
            list.add(arr2[j++]);
        }
        return list;
    }

    private static ArrayList<Integer> intersection(int[] arr1, int[] arr2, int m, int n) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j])
                j++;
            else {
                list.add(arr1[i]);
                i++; j++;
            }
        }
        return list;
    }
}
