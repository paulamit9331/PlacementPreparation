package Stack.ValidParenthesis;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String parenthesis = "([({()([])})])";

        System.out.println(isValid(parenthesis));
    }

    private static boolean isValid(String parenthesis) {
        Stack<Character> stack = new Stack<>();
        for (char ch : parenthesis.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }
}