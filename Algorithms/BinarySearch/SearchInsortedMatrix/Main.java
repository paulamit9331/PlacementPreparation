package BinarySearch.SearchInsortedMatrix;

public class Main {

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            super();

            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }
    
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1, 2, 3, 4},
                                    {5, 6, 7, 8},
                                    {9, 10, 11, 12},
                                    {13, 14, 15, 16}};
        int row = mat.length;
        int col = mat[0].length;
        int key = 11;

        System.out.println(searchElement(mat, row, col, key));
    }

    private static Pair searchElement(int[][] mat, int m, int n, int key) {
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (key == mat[row][col])
                return new Pair(row, col);
            else if (key < mat[row][col])
                col--;
            else
                row++;
        }
        return new Pair(-1, -1);
    }
}
