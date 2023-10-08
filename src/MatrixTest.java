public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3); // Создаем матрицу 3x3

        // Заполняем матрицу данными
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix.setElement(i, j, i * 3 + j + 1);
            }
        }

        // Выводим всю матрицу
        System.out.println("Matrix:");
        matrix.printMatrix();

        // Выводим подматрицу 2x2, начиная с элемента (1, 1)
        System.out.println("Submatrix (1, 1, 2, 2):");
        matrix.printSubmatrix(1, 1, 2, 2);

        // Меняем местами строки с минимальным и максимальным элементами в столбце 1
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        for (int[] row : data) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        Matrix.swapRowsWithMinMax(data, 1);
    }
}
