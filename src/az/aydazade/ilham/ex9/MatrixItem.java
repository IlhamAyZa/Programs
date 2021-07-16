package az.aydazade.ilham.ex9;

public class MatrixItem {
    private int columnID;
    private int rowID;
    private float content;

    public MatrixItem(int columnID, int rowID, float content) {
        this.columnID = columnID;
        this.rowID = rowID;
        this.content = content;
    }
    
    public float getContentByID(MatrixItem matrixItem, int columnID, int rowID) {
        if ( columnID == matrixItem.getColumnID() && rowID == matrixItem.getRowID()){
            return matrixItem.getContent();
        }
        else{
            return Integer.MAX_VALUE;
        }        
    }
    
    // Get and Set

    public int getColumnID() {
        return columnID;
    }

    public void setColumnID(int columnID) {
        this.columnID = columnID;
    }

    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public float getContent() {
        return content;
    }

    public void setContent(float content) {
        this.content = content;
    }
    
}
