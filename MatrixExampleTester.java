public class MatrixExampleTester {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5, 6 },
                { 4, 5, 6, 3, 7, 2 },
                { 27, 8, 9, 5, 3, 21 },
                { 73, 2, 19, 5, 1, 8 },
                { 47, 9, 9, 5, 0, 22 },
                { 78, 86, 1, 4, 1, 21 },
                { 73, 18, 2, 2, 5, 11 }
        };

        int[][] test1 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int[][] test2 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        // GenerateRandomMatrix
        System.out.println("==generateRandomMatrix()==");
        int numRows = 6;
        int numCols = 7;

        int[][] matrix2 = MatrixExample.generateRandomMatrix(numRows, numCols);
        System.out.println(matrix2);

        // print it out
        System.out.println("result length: " + matrix2.length + " x " + matrix2[0].length);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("");

        // multiplyMatricies
        System.out.println("==multiplyMatricies()==");
        int[][] result1 = MatrixExample.multiplyMatrices(matrix, matrix2);
        int[][] result2 = MatrixExample.multiplyMatrices(test1, test2);

        // result 1
        System.out.println("result length: " + result1.length + " x " + result1[0].length);
        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                System.out.print(result1[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

        // result 2
        System.out.println("result length: " + result2.length + " x " + result2[0].length);
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.print(result2[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println();

    }

}
