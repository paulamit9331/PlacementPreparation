package DataStructures.Arrays.BleakNumber;

public class Main {
    
    public static void main(String[] args) {
        int n = 4;

        System.out.println(isBleak(n));
    }

    private static boolean isBleak(int n) {
        for (int i = 1; i < n; i++) 
            if (countSetBits(i) + i == n)
                return false;
        return true;
    }

    private static int countSetBits(int i) {
        int count = 0;
        while (i != 0) {
            i &= (i - 1);
            count++;
        }
        return count;
    }
}
