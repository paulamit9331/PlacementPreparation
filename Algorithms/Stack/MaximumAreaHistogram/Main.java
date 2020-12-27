package Stack.MaximumAreaHistogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        int[] arr = new int[] {6, 2, 5, 4, 5, 1, 6};
        int n = arr.length;

        System.out.println(maximumAreaHistogram(arr, n));
    }

    private static int maximumAreaHistogram(int[] arr, int n) {
        ArrayList<Integer> leftMax = NSL(arr, n);
        ArrayList<Integer> rightMax = NSR(arr, n);

        ArrayList<Integer> area = getArea(arr, leftMax, rightMax);
        return Collections.max(area);
    }

    private static ArrayList<Integer> getArea(int[] arr, ArrayList<Integer> leftMax, ArrayList<Integer> rightMax) {
        ArrayList<Integer> area = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            area.add((rightMax.get(i) - leftMax.get(i) - 1) * arr[i]);
        return area;
    }

    private static ArrayList<Integer> NSR(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty())
                ans.add(n);
            else if (arr[stack.peek()] < arr[i])
                ans.add(stack.peek());
            else {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans.add(n);
                else
                    ans.add(stack.peek());
            }
            stack.push(i);
        }
        Collections.reverse(ans);
        return ans;
    }

    private static ArrayList<Integer> NSL(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty())
                ans.add(-1);
            else if (arr[stack.peek()] < arr[i])
                ans.add(stack.peek());
            else {
                while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans.add(-1);
                else
                    ans.add(stack.peek());
            }
            stack.push(i);
        }
        return ans;
    }
}
