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

    public void printMatrixSize(Matrix matrix) {
        System.out.println("Matrix has " + matrix.getSizeRow() + " rows and " + matrix.getSizeCol() + " columns");
    }

    public void createMatqrixOfRandomNumbers(Matrix matrix) {

        int[][] aMatrix = matrix.getMatrix();

        for (int i = 0; i < matrix.getSizeRow(); i++) {

            for (int j = 0; j < matrix.getSizeCol(); j++) {
                aMatrix[i][j] = (int) (Math.random() * 100);
            }
        }

        matrix.setMatrix(aMatrix);

    }

    public int getContentByID(int sizeRow, int sizeCol) throws Exception {
        try {
            if ((sizeRow > this.sizeRow ) || (sizeCol > this.sizeCol)) {
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
