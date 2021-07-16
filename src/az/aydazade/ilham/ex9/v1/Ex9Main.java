package az.aydazade.ilham.ex9.v1;

import java.util.*;

public class Ex9Main {

    public static void main(String[] args) {

        List<MatrixItem> listOfMatrixItems = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                listOfMatrixItems.add(new MatrixItem(i, j, (float) (Math.random() * 100)));
            }
        }

        Matrix aMatrix = new Matrix();
        aMatrix.setMatrix(listOfMatrixItems);

        Scanner scn = new Scanner(System.in);

        int colID = scn.nextInt();
        int rowID = scn.nextInt();

        System.out.println(aMatrix.getContentByID(aMatrix, colID, rowID));

        scn.close();
    }

}
