import java.util.Random;

public class MatrixExample {
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException(
                    "Number of columns in the first matrix must be equal to the number of rows in the second matrix.");

        }

        // Some more issues here too
        int[][] result = new int[rows1][cols2];

        // Lots of issues with this code, it used to be working perfectly though
        for (int i = 0; i < rows1; i++) { // matrix 1 rows
            for (int j = 0; j < cols1; j++) { // columns
                for (int k = 0; k < cols2; k++) {
                    result[i][k] += matrix1[i][j] * matrix2[j][k];

                }

            }

        }

        return result;

    }

    public static int[][] generateRandomMatrix(int numRows, int numCols) {
        int[][] matrix = new int[numRows][numCols];
        Random random = new Random();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = random.nextInt(100); // Generates random values between 0 and 99

            }

        }

        return matrix;

    }

}
