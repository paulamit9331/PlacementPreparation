package DataStructures.Recursion.Fibonacci;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
        sc.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
