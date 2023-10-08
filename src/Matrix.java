public class Matrix {
    private int[][] data;

    public Matrix(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Matrix size must be greater than zero.");
        }
        data = new int[n][n];
    }

    public void setElement(int row, int col, int value) {
        if (row < 0 || row >= data.length || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid row or column index.");
        }
        data[row][col] = value;
    }

    public int getElement(int row, int col) {
        if (row < 0 || row >= data.length || col < 0 || col >= data[0].length) {
            throw new IllegalArgumentException("Invalid row or column index.");
        }
        return data[row][col];
    }

    public void printMatrix() {
        for (int[] row : data) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public void printSubmatrix(int startRow, int startCol, int numRows, int numCols) {
        if (startRow < 0 || startRow >= data.length || startCol < 0 || startCol >= data[0].length ||
                numRows <= 0 || numCols <= 0) {
            throw new IllegalArgumentException("Invalid submatrix parameters.");
        }

        for (int i = startRow; i < startRow + numRows; i++) {
            for (int j = startCol; j < startCol + numCols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapRowsWithMinMax(int[][] matrix, int k) {
        if (k < 0 || k >= matrix[0].length) {
            throw new IllegalArgumentException("Invalid column index.");
        }

        int minRowIndex = 0;
        int maxRowIndex = 0;
        int minValue = matrix[0][k];
        int maxValue = matrix[0][k];

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][k] < minValue) {
                minValue = matrix[i][k];
                minRowIndex = i;
            }
            if (matrix[i][k] > maxValue) {
                maxValue = matrix[i][k];
                maxRowIndex = i;
            }
        }

        int[] temp = matrix[minRowIndex];
        matrix[minRowIndex] = matrix[maxRowIndex];
        matrix[maxRowIndex] = temp;

        System.out.println("Matrix after swapping rows with min and max elements in column " + k + ":");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Min row index: " + minRowIndex);
        System.out.println("Max row index: " + maxRowIndex);
    }
}