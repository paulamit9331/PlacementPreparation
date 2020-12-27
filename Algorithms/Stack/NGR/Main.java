package Stack.NGR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 2, 4};
        int n = arr.length;

        System.out.println(nearestGreaterToRight(arr, n));
    }

    private static ArrayList<Integer> nearestGreaterToRight(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty())
                ans.add(-1);
            else if (stack.peek() > arr[i])
                ans.add(stack.peek());
            else {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans.add(-1);
                else
                    ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}
