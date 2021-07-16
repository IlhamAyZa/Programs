package az.aydazade.ilham.ex9.v3;

public class Matrix {

    private int sizeRow;
    private int sizeCol;

    public void setMatrixSize(int sizeRow, int sizeCol) {
        this.sizeCol = sizeCol;
        this.sizeRow = sizeRow;
    }

    public void printMatrixSize(Matrix matrix) {
        System.out.println("Matrix has " + matrix.getSizeRow() + " rows and " + matrix.getSizeCol() + " columns");
    }

    public int[][] createMatrixOfRandomNumbers(Matrix matrix) {

        int[][] aMatrix = new int[matrix.getSizeRow()][matrix.getSizeCol()];

        for (int i = 0; i < matrix.getSizeRow(); i++) {

            for (int j = 0; j < matrix.getSizeCol(); j++) {
                aMatrix[i][j] = (int) (Math.random() * 100);
            }
        }

        return aMatrix;
    }

    public int getContentByID(int[][] aMatrix, Matrix matrix, int sizeRow, int sizeCol) {
        try {
            if ((sizeRow > matrix.getSizeRow() - 1) || (sizeCol > matrix.getSizeCol() - 1)) {
                throw new Exception("Out of bounds. Your row or column is not correct!");
            } else if ((sizeRow <= 0) || (sizeCol <= 0)) {
                throw new Exception("Out of bounds. Your row or column cannot be zero or negative!");
            } else {
                return aMatrix[sizeRow - 1][sizeCol - 1];
            }
        } catch (Exception e) {
            return -10000;
        }
    }

    public void writeMatrix(int[][] aMatrix) {
        for (int i = 0; i < aMatrix.length; i++) {
            System.out.print("  | ");
            for (int j = 0; j < aMatrix[0].length; j++) {
                System.out.print(aMatrix[i][j] + " ");
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

}
