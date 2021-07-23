package az.aydazade.ilham.ex10.v2;

public class GaussMethod {

    
        /// <summary>
        /// Метод Гаусса (Решение СЛАУ)
        /// </summary>
        /// <param name="Matrix">Начальная матрица</param>
        /// <returns></returns>
    public static double[] Gauss(double[][] Matrix) {
        int size = Matrix[0].length; //Размерность начальной матрицы (строки)
        double[][] Matrix_Clone = new double[size][size + 1]; //Матрица-дублер
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size + 1; j++) {
                Matrix_Clone[i][j] = Matrix[i][j];
            }
        }
        //Прямой ход (Зануление нижнего левого угла)
        for (int k = 0; k < size; k++) //k-номер строки
        {
            for (int i = 0; i < size + 1; i++) //i-номер столбца
            {
                Matrix_Clone[k][i] = Matrix_Clone[k][i] / Matrix[k][k]; //Деление k-строки на первый член !=0 для преобразования его в единицу
            }
            for (int i = k + 1; i < size; i++) //i-номер следующей строки после k
            {
                double K = Matrix_Clone[i][k] / Matrix_Clone[k][k]; //Коэффициент
                
                for (int j = 0; j < size + 1; j++) //j-номер столбца следующей строки после k
                {
                    Matrix_Clone[i][j] = Matrix_Clone[i][j] - Matrix_Clone[k][j] * K; //Зануление элементов матрицы ниже первого члена, преобразованного в единицу
                }
            }
            for (int i = 0; i < size; i++) //Обновление, внесение изменений в начальную матрицу
            {
                for (int j = 0; j < size + 1; j++) {
                    Matrix[i][j] = Matrix_Clone[i][j];
                }
            }
        }

        //Обратный ход (Зануление верхнего правого угла)
        for (int k = size - 1; k > -1; k--) //k-номер строки
        {
            for (int i = size; i > -1; i--) //i-номер столбца
            {
                Matrix_Clone[k][i] = Matrix_Clone[k][i] / Matrix[k][k];
            }
            for (int i = k - 1; i > -1; i--) //i-номер следующей строки после k
            {
                double K = Matrix_Clone[i][k] / Matrix_Clone[k][k];
                
                for (int j = size; j > -1; j--) //j-номер столбца следующей строки после k
                {
                    Matrix_Clone[i][j] = Matrix_Clone[i][j] - Matrix_Clone[k][j] * K;
                }
            }
        }

        //Отделяем от общей матрицы ответы
        double[] Answer = new double[size];
        
        for (int i = 0; i < size; i++) {
            Answer[i] = Matrix_Clone[i][size];
        }

        return Answer;
    }
    
    public static void main(String[] args) {
        double[][] augmentMatrix = new double[][]{{1, 0, 0, 0, 0},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 1, 0}};
        
        System.out.println(Gauss(augmentMatrix));
    }
}
