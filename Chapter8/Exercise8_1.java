/*(Sum elements row by row) Write a method that returns the sum of all the
elements in a specified row in a matrix using the following header:
*/ 

package Chapter8;

public class Exercise8_1 {
    public static void main(String[] args) {
        final int rowSize = 3;
        final int columnSize = 4;
        double [][] matrix = new double [rowSize] [columnSize];
        
        for(int j = 0; j < matrix.length; j++){ 
            for (int i = 0; i < matrix[j].length; i++){
                //System.out.println((double) (j + i));
                matrix[j][i] = (double)(j + i);
            }
        }

        for(int k = 0; k < columnSize; k++){
            System.out.println(sumColumn(matrix, k));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumOfColumn = 0;
            for (int i = 0; i < m.length; i++){
                sumOfColumn += m[i][columnIndex];
            }
            System.out.printf("The sum of Column %d is %f \n", columnIndex, sumOfColumn);
        return sumOfColumn;
    }
}
