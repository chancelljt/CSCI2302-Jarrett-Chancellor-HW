package Chapter8;

/*Sum the major diagonal in a matrix) Write a method that sum all the 
numbers in the major diagonal in an n * n matrix of double values using the 
following header:
 Write a test program that reads a 4-by-4 matrix and displays the sum of all its 
elements on the major diagonal. 
package Chapter8;
*/
import java.util.*;
public class Exercise8_2 {
    public static void main(String[] args){
        final int rowSize = 4;
        final int columnSize = 4;
        double [][] matrix = new double [rowSize][columnSize];
    
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){
            System.out.println("Enter 4 double numbers for each array: ");
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }

        sumMajorDiagonal(matrix);

        input.close();
    }
    public static double sumMajorDiagonal(double[][] m){
        double sumOfDiagonal = 0;
        for (int i = 0; i < m.length; i++){
                sumOfDiagonal += m[i][i];
        }

        System.out.printf("The sum of the diagonal elements is %f\n ", sumOfDiagonal);
       
        return sumOfDiagonal;

}
}

