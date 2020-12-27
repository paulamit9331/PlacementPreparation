package DataStructures.Recursion.PowerCalculate;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

        System.out.println(calculatePower(num, power));
        sc.close();
    }

    private static int calculatePower(int num, int power) {
        if (num == 0)
            return 0;
        else if (power == 0)
            return 1;
        
        int temp = calculatePower(num, power / 2);
        if (power % 2 == 0)
            return temp * temp;
        else
            return num * temp * temp;
    }
}
