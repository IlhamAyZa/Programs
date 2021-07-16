package az.aydazade.ilham.ex9.v2;

import java.util.*;

public class Ex9Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please write size of matrix (first row, then column): ");
        int rowSize = scn.nextInt();
        int columnSize = scn.nextInt();

        int[][] aMatrix = new int[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {

            for (int j = 0; j < columnSize; j++) {
                aMatrix[i][j] = (int) (Math.random() * 100);
            }
        }
        
        System.out.println("This is full matrix: ");
        for (int i = 0; i < rowSize; i++) {
            System.out.print("  | ");
            for (int j = 0; j < columnSize; j++) {
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.print(" | \n");
        }

        System.out.println("Please write id of space: ");

        System.out.print("Please write the row: ");
        int row = scn.nextInt();

        System.out.print("Please write the column: ");
        int column = scn.nextInt();
        System.out.println("");

        System.out.println("Content in this place is following: " + aMatrix[row-1][column-1]);

    }
}

/*
        Map<Integer, Integer> coordinates = new LinkedHashMap<>();
        Map < Map<Integer,Integer> , List<Float> > aMatrix = new HashMap<>();
        
        int n = 3; // size of matrix
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                coordinates.put(i, j);
            }
        }

        Scanner scn = new Scanner(System.in);
        int spaceLeft = n*n;
        
        boolean work = true;
        List<Float> aList = new ArrayList<>();
        int i = 0;
        
        while (work) {
            System.out.println("Print number to enter: (" + (spaceLeft - i) + " space left)");
            i++;
            
            float ans = scn.nextFloat();
            aList.add(ans);
            
            if (spaceLeft == i){
                work = false;
            }
        }
        
        aMatrix.put(coordinates, aList);
        
        System.out.println(aMatrix);
        
 */
