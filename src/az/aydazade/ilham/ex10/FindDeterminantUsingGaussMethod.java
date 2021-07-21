package az.aydazade.ilham.ex10;

public class FindDeterminantUsingGaussMethod {

    public static double[] GaussMethod(double[][] matrix, int size) {

        double[][] cloneMatrix = new double[size][size + 1];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; i++) {
                cloneMatrix[i][j] = matrix[i][j];
            }
        }

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size + 1; i++) {
                cloneMatrix[k][i] = cloneMatrix[k][i] / cloneMatrix[k][k];
            }
            for (int i = k + 1; i < size; i++) {

                double K = cloneMatrix[i][k] / cloneMatrix[k][k];

                for (int j = 0; j < size + 1; j++) {
                    cloneMatrix[i][j] = cloneMatrix[i][j] - cloneMatrix[k][j] * K;
                }

            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size + 1; j++) {
                    matrix[i][j] = cloneMatrix[i][j];
                }
            }

        }
        for (int k = size - 1; k > -1; k--) {
            for (int i = size; i > -1; i--) {
                cloneMatrix[k][i] = cloneMatrix[k][i] / matrix[k][k];
            }
            for (int i = k - 1; i > -1; i--) {
                double K = cloneMatrix[i][k] / cloneMatrix[k][k];
                for (int j = size; j > -1; j--) {
                    cloneMatrix[i][j] = cloneMatrix[i][j] - cloneMatrix[k][j] * K;
                }
            }
        }

        double[] Answer = new double[size];
        for (int i = 0; i < size; i++) {
            Answer[i] = cloneMatrix[i][size];
        }

        return Answer;
    }

    public static void main(String[] args) {

        double[][] matrix = new double[][]{     {1, 0, 0, 0, 0},
                                                {0, 1, 0, 0, 0},
                                                {0, 0, 1, 0, 0},
                                                {0, 0, 0, 1, 0}    };
        
        System.out.println(GaussMethod(matrix, 4));
    }
}
