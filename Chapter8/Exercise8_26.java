package Chapter8;

import java.util.*;

/*
Row sorting: Implement the following method to sort the rows in a two dimensional array. 
A new array is returned and the original array is intact. Write a test program that prompts 
the user to enter a 3 * 3 matrix of double values and displays a new row-sorted matrix. Here is a sample run:
 */
public class Exercise8_26 {
    public static void main(String[] args) {
        final int rowSize = 3;
        final int columnSize = 3;
        double [][] m = new double [rowSize][columnSize];
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        }
        double[][] sorted = sortRows(m);
        displayMatrix(sorted);
    }

    public static void displayMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2.3f ", m[i][j]);
            }
            System.out.println();
        }
    }
   
    public static double[][] sortRows(double[][] m) {
        double[][] rowsSorted = new double[m.length][m[0].length];
            for (int i = 0; i < m.length; i++){
                for (int j = 0; j < m[0].length; j++){
                rowsSorted[i][j] = m[i][j];
                }
            }

        for (int i = 0; i < rowsSorted.length; i++) {
            for (int j = 0; j < rowsSorted[0].length - 1; j++) {
                double currentMin = rowsSorted[i][j];
                int minIndex = j;
                for (int column = j + 1; column < rowsSorted[0].length; column++) {
                    if (currentMin > rowsSorted[i][column]) {
                        currentMin = rowsSorted[i][column];
                        minIndex = column;
                    }
                }
                
                if (minIndex != j) {
                    rowsSorted[i][minIndex] = rowsSorted[i][j];
                    rowsSorted[i][j] = currentMin;
                }
            }
        }

        return rowsSorted;
    }

}