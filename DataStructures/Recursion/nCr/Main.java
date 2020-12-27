package DataStructures.Recursion.nCr;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
        sc.close();
    }

    private static int nCr(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        else
            return nCr(n - 1, r) + nCr(n - 1, r - 1);
    }
}
