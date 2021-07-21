package az.aydazade.ilham.ex9.v3;

public class Method2ForDeterminant {

    static final int size = 4;

    public static void getCofactor(double matrix[][], double temporary[][], int rowIdx, int colIdx, int size) {
        int i = 0, j = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                if (row != rowIdx && col != colIdx) {
                    temporary[i][j++] = matrix[row][col];

                    if (j == size - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

// Recursive function for finding determinant of matrix. n is dimention of matrix
    public static double determinantOfMatrix(double mat[][], int detSize) {
        double D = 0; 
        
        if (detSize == 1) {
            return mat[0][0];
        }

        // To store cofactors and sign
        double temp[][] = new double[size][size];
        int sign = 1;
        
        for (int f = 0; f < detSize; f++) {
            // Getting Cofactor of mat[0][f]
            getCofactor(mat, temp, 0, f, detSize);
            D += sign * mat[0][f]
                    * determinantOfMatrix(temp, detSize - 1);

            sign = -sign;
        }

        return D;
    }

    /* function for displaying the matrix */
    public static void display(double mat[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        double matrix[][] = {  { 1, 0, 0, 0 },
                            { 0, 1, 1, 1 },
                            { 0, 1, 1, 1 },
                            { 0, 1, 1, 1 }  };
        System.out.print("Determinant " + "of the matrix is : " + determinantOfMatrix(matrix, size) + " ");
    }
}
