package az.aydazade.ilham.ex9.v3;


public class Method1ForDeterminant {

    public static double determinantOfMatrix(double matrix[][], int size)
    {
        int  index; 
        double num1, num2, determinant = 1, total = 1;
 
        // temporary array for storing row
        double[] temporary = new double[size + 1];
 
        // loop for traversing the diagonal elements
        for (int i = 0; i < size; i++) {
            index = i;  
            // finding the index which has non zero value
            while (matrix[index][i] == 0 && index < size) {
                index++;
            }
            if (index == size){
                // if there is non zero element
                // the determinant of matrix as zero
                continue;
            }
            if (index != i) {
                // loop for swaping the diagonal element row and index row
                for (int j = 0; j < size; j++) {
                    swap(matrix, index, j, i, j);
                }
                // determinant sign changes when we shift rows go through determinant properties
                determinant = (int)(determinant * Math.pow(-1, index - i));
            }
 
            // storing the values of diagonal row elements
            for (int j = 0; j < size; j++) {
                temporary[j] = matrix[i][j];
            }
 
            // traversing every row below the diagonal element
            for (int j = i + 1; j < size; j++) {
                num1 = temporary[i]; // value of diagonal element
                num2 = matrix[j][i]; // value of next row element
 
                // traversing every column of row and multiplying to every row
                for (int k = 0; k < size; k++) {
                    // multiplying to make the diagonal element and next row element equal
                    matrix[j][k] = (num1 * matrix[j][k]) - (num2 * temporary[k]);
                }
                total = total * num1; // Det(kA)=kDet(A);
            }
        }
 
        // mulitplying the diagonal elements to get determinant
        for (int i = 0; i < size; i++) {
            determinant = determinant * matrix[i][i];
        }
        return (determinant / total); // Det(kA)/k=Det(A);
    }
 
    public static double[][] swap(double[][] array, int i1, int j1, int i2, int j2){
        double temp = array[i1][j1];
        array[i1][j1] = array[i2][j2];
        array[i2][j2] = temp;
        return array;
    }
    
    public static void main(String[] args) {
        
        double matrix[][] = {   { 1, 0, 0, 0 },
                                { 0, 1, 1, 1 },
                                { 0, 1, 1, 1 },
                                { 0, 1, 1, 1 }  };
 
        System.out.println("Determinant of the matrix is :" + determinantOfMatrix(matrix, 4));
    }
    
}
