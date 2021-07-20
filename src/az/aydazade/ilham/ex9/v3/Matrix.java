package az.aydazade.ilham.ex9.v3;

public class Matrix {

    private int sizeRow;
    private int sizeCol;
    private double[][] matrix;

    public void setMatrixSize(int sizeRow, int sizeCol) {
        this.sizeCol = sizeCol;
        this.sizeRow = sizeRow;
        double[][] matrix = new double[sizeCol][sizeRow];
    }

    public void printMatrixSize() {
        System.out.println("Matrix has " + matrix + " rows and " + sizeCol + " columns");
    }

    public void createMatqrixOfRandomNumbers() {

        double[][] aMatrix = matrix;

        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol; j++) {
                aMatrix[i][j] = (double) (Math.random() * 100);
            }
        }

        matrix = aMatrix;

    }

    // Recursively
    public float findDeterminent1(int size) {

        if (sizeRow != sizeCol) {
            System.out.println("Your matrix is not square type (Number of Rows = Number of Colunms)");
        } else {
            float determinant = 0, sign = 1;
            float[][] mtrx = new float[size][size];
            int idx1, idx2, idx3;
            int num1, num2;

            if (size == 1) {
                return (float) (matrix[0][0]);
            } else {
                determinant = 0;

                for (idx1 = 0; idx1 < size; idx1++) {
                    num1 = 0;
                    num2 = 0;

                    for (idx2 = 0; idx2 < size; idx2++) {

                        for (idx3 = 0; idx3 < size; idx3++) {

                            mtrx[idx2][idx3] = 0;

                            if (idx2 != 0 && idx3 != idx1) {

                                mtrx[num1][num2] = (float) matrix[idx2][idx3];

                                if (num2 < (sizeRow - 2)) {
                                    num2++;
                                } else {
                                    num2 = 0;
                                    num1++;
                                }
                            }
                        }
                    }
                    determinant = (float) (determinant + sign * (matrix[0][idx1] * findDeterminent1(size - 1)));
                    sign = -1 * sign;
                }
            }
            return (determinant);
        }
        return 0; // this return is unreachable
    }

    // Without recursion
    public double[][] swapping(double[][] matrix, int idx1row, int idx1col, int idx2row, int idx2col) {
        double temp = matrix[idx1row][idx1col];
        matrix[idx1row][idx1col] = matrix[idx2row][idx2col];
        matrix[idx2row][idx2col] = temp;
        return matrix;
    }
    
    public double determinantOfMatrix(double[][] matrix) {
        double determinant = 1, total = 1, diagonalValue, value;
        int index;

        double[] temporaryRow = new double[sizeRow + 1];

        for (int i = 0; i < sizeRow; i++) {
            index = i;

            while (matrix[index][i] == 0 && index < sizeRow) {
                index++;
            }
            if (index == sizeRow) {
                continue;
            }
            if (index != i) {
                // loop for swaping the diagonal element row and index row
                for (int j = 0; j < sizeRow; j++) {
                    swapping(matrix, index, j, i, j);
                }

                determinant = (determinant * Math.pow(-1, index - i));
            }

            // saving values of row elements
            for (int j = 0; j < sizeRow; j++) {
                temporaryRow[j] = matrix[i][j];
            }

            for (int j = i + 1; j < sizeRow; j++) {
                diagonalValue = temporaryRow[i]; 
                value = matrix[j][i]; 

                for (int k = 0; k < sizeRow; k++) {
                    // make the diagonal element and next row element equal
                    matrix[j][k] = (diagonalValue * matrix[j][k]) - (value * temporaryRow[k]);
                }
                total = total * diagonalValue; // Det(kA)=kDet(A);
            }
        }
        for (int i = 0; i < sizeRow; i++) {
            determinant = determinant * matrix[i][i];
        }
        return (determinant / total); // Det(kA)/k=Det(A);
    }


    public double getContentByID(int sizeRow, int sizeCol) throws Exception {
        try {
            if ((sizeRow > this.sizeRow) || (sizeCol > this.sizeCol)) {
                throw new Exception("Out of bounds. Your row or column is not correct!");
            } else if ((sizeRow <= 0) || (sizeCol <= 0)) {
                throw new Exception("Out of bounds. Your row or column cannot be zero or negative!");
            } else {
                return this.matrix[sizeRow - 1][sizeCol - 1];
            }
        } catch (Exception e) {
            throw new Exception("Out of bounds");
        }
    }

    public void writeMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            System.out.print("  | ");
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.print(" | \n");
        }
    }

    // get and set
    public int getSizeRow() {
        return sizeRow;
    }

    public void setSizeRow(int sizeRow) {
        this.sizeRow = sizeRow;
    }

    public int getSizeCol() {
        return sizeCol;
    }

    public void setSizeCol(int sizeCol) {
        this.sizeCol = sizeCol;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

}
