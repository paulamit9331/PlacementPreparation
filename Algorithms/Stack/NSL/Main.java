package Stack.NSL;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 2, 4};
        int n = arr.length;

        System.out.println(nearestSmallerToLeft(arr, n));
    }

    private static ArrayList<Integer> nearestSmallerToLeft(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty())
                ans.add(-1);
            else if (stack.peek() < arr[i])
                ans.add(stack.peek());
            else {
                while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans.add(-1);
                else
                    ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
