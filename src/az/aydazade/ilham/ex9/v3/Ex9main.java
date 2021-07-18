package az.aydazade.ilham.ex9.v3;

import java.util.*;

public class Ex9main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        matrix.setMatrixSize(row, col);

        matrix.printMatrixSize(matrix);
        //matrix.writeMatrix(matrix);

        createMatrixOfRandomNumbers(matrix);

        System.out.println("Enter row, column:");

        int rowFind = scn.nextInt();
        int colFind = scn.nextInt();

        int content = matrix.getContentByID(matrix, rowFind, colFind);

        System.out.println(content);
    }

}
