package DataStructures.Arrays.PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(nthPrime(n));
        sc.close();
    }

    private static int nthPrime(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean[] isPrime = new boolean[Integer.MAX_VALUE];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= Integer.MAX_VALUE; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= Integer.MAX_VALUE; j+= i)
                    isPrime[j] = false;
            }
        }
        for (int i = 0; i <= n; i++)
            if (isPrime[i])
                primeList.add(i);
        System.out.println(primeList);
        return primeList.get(primeList.size() - 1);
    }
}
