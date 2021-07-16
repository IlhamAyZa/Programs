package az.aydazade.ilham.ex9.v1;

import java.util.*;

public class Matrix {
    
    List<MatrixItem> matrix = new ArrayList<>();

    public Matrix() {
        
    }

    public void setMatrix(List<MatrixItem> matrix) {
        this.matrix = matrix;
    }
    
    public List<MatrixItem> getMatrix() {
        return matrix;
    }

    public float getContentByID(Matrix matrix, int columnId, int rowID){
       float number = 0;
       for ( MatrixItem matrixItem : matrix.getMatrix()){
           number =  matrixItem.getContentByID(matrixItem, columnId, rowID);
           
           if (number != Integer.MAX_VALUE){
               break;
           }
       }
       
       return number;
    }
    
}
