package TransposeOfMatrix;

import util.JUtil;

public class Main {
    public static void main(String[] args) {
        TransposeOfMatrix transposeOfMatrix = new TransposeOfMatrix();

        int[][] matrix = JUtil.getInteger2DArray();

        matrix = transposeOfMatrix.transposeOfMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println(" ");
        }

    }
}
