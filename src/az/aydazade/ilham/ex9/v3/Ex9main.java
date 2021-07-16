package az.aydazade.ilham.ex9.v3;

import java.util.*;

public class Ex9main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        matrix.setMatrixSize(row, col);

        int[][] aMatrix = matrix.createMatrixOfRandomNumbers(matrix);
        
        matrix.printMatrixSize(matrix);
        matrix.writeMatrix(aMatrix);


        System.out.println("Enter row, column:");

        int rowFind = scn.nextInt();
        int colFind = scn.nextInt();

        int content = matrix.getContentByID(aMatrix, matrix, rowFind, colFind);

        System.out.println(content);
    }

}
