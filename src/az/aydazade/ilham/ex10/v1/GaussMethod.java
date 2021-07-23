package az.aydazade.ilham.ex10.v1;

public class GaussMethod {

    public static void main(String[] args) {

        float[][] augmentMatrix = new float[][]{{1, 0, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 1, 0}};

        int size = 3, flag = 0;

        flag = GaussMethod(augmentMatrix, size);

        if (flag == 1) {
            flag = CheckConsistency(augmentMatrix, size, flag);
        }

        System.out.println("Final Augumented Matrix is : ");
        PrintMatrix(augmentMatrix, size);
        System.out.println("");

        PrintResult(augmentMatrix, size, flag);
    }

    static void PrintMatrix(float matrix[][], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int GaussMethod(float matrix[][], int size) {
        int idx1, idx2, idx3 = 0, num, flag = 0;
        float pro = 0;

        for (idx1 = 0; idx1 < size; idx1++) {
            if (matrix[idx1][idx1] == 0) {
                num = 1;
                while ((idx1 + num) < size && matrix[idx1 + num][idx1] == 0) {
                    num++;
                }
                if ((idx1 + num) == size) {
                    flag = 1;
                    break;
                }
                for (idx2 = idx1, idx3 = 0; idx3 <= size; idx3++) {
                    float temp = matrix[idx2][idx3];
                    matrix[idx2][idx3] = matrix[idx2 + num][idx3];
                    matrix[idx2 + num][idx3] = temp;
                }
            }

            for (idx2 = 0; idx2 < size; idx2++) {

                // Excluding all i == j
                if (idx1 != idx2) {

                    float p = matrix[idx2][idx1] / matrix[idx1][idx1];

                    for (idx3 = 0; idx3 <= size; idx3++) {
                        matrix[idx2][idx3] = matrix[idx2][idx3] - (matrix[idx1][idx3]) * p;
                    }
                }
            }
        }
        return flag;
    }

    static void PrintResult(float a[][], int size, int flag) {
        System.out.print("Result is : ");

        if (flag == 2) {
            System.out.println("Infinite Solutions Exists");
        } else if (flag == 3) {
            System.out.println("No Solution Exists");
        } // Print solutions by dividing constants by their respective diagonal elements
        else {
            for (int i = 0; i < size; i++) {
                System.out.print(a[i][size] / a[i][i] + " ");
            }
        }
    }

    static int CheckConsistency(float a[][], int n, int flag) {
        int i, j;
        float sum;

        // flag == 2 for infinite solution
        // flag == 3 for No solution
        flag = 3;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = 0; j < n; j++) {
                sum = sum + a[i][j];
            }
            if (sum == a[i][j]) {
                flag = 2;
            }
        }
        return flag;
    }

}
