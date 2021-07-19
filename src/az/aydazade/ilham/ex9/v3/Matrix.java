package az.aydazade.ilham.ex9.v3;

public class Matrix {

    private int sizeRow;
    private int sizeCol;
    private int[][] matrix;

    public void setMatrixSize(int sizeRow, int sizeCol) {
        this.sizeCol = sizeCol;
        this.sizeRow = sizeRow;
        int[][] matrix = new int[sizeCol][sizeRow];
    }

    public void printMatrixSize() {
        System.out.println("Matrix has " + matrix + " rows and " + sizeCol + " columns");
    }

    public void createMatqrixOfRandomNumbers() {

        int[][] aMatrix = matrix;

        for (int i = 0; i < sizeRow; i++) {

            for (int j = 0; j < sizeCol; j++) {
                aMatrix[i][j] = (int) (Math.random() * 100);
            }
        }

        matrix = aMatrix;

    }

    public float findDeterminent(int size) {

        if (sizeRow != sizeCol) {
            System.out.println("Your matrix is not square type (Number of Rows = Number of Colunms)");
        } else {

            int c;

            float determinant = 0, s = 1;

            float[][] mtrx = new float[size][size];

            int i, j;

            int m, n;

            if (size == 1) {

                return (matrix[0][0]);

            } else {

                determinant = 0;

                for (c = 0; c < size; c++) {

                    m = 0;

                    n = 0;

                    for (i = 0; i < size; i++) {

                        for (j = 0; j < size; j++) {

                            mtrx[i][j] = 0;

                            if (i != 0 && j != c) {

                                mtrx[m][n] = matrix[i][j];

                                if (n < (sizeRow - 2)) {

                                    n++;

                                } else {

                                    n = 0;

                                    m++;
                                }
                            }
                        }
                    }
                    determinant = determinant + s * (matrix[0][c] * findDeterminent(size - 1));

                    s = -1 * s;
                }

            }

            return (determinant);
        }
        
        return 0;
    }

    public int getContentByID(int sizeRow, int sizeCol) throws Exception {
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

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}
