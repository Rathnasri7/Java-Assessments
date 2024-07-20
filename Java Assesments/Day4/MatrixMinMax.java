public class MatrixMinMax {

    public static void findMinMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Smallest value in the matrix: " + min);
        System.out.println("Largest value in the matrix: " + max);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        findMinMax(matrix);
    }
}

