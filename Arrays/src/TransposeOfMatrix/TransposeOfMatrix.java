package TransposeOfMatrix;

public class TransposeOfMatrix {

    public int[][] transposeOfMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        System.out.println(rows);
        System.out.println(columns);

        int[][] transpose = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;

    }
}
