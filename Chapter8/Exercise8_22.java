package Chapter8;
/*
Even number of 1s: Write a program that generates a 6-by-6 two-dimensional 
matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
every column have an even number of 1s.
 */

import java.util.*;

public class Exercise8_22 {
    public static void main(String[] args) {
        final int rowSize = 6;
        final int columnSize = 6;
        int[][] m = new int [rowSize][columnSize];
    
        Scanner input = new Scanner(System.in); 

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 2);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		if (isAllRowsEven1s(m))
			System.out.println("Every row does have an even number of 1s " + (isAllRowsEven1s(m)));
		else{
			System.out.println("Every row does not have an even number of 1s " + (isAllRowsEven1s(m)));
		}
		
		if (isAllColumnsEven1s(m))
			System.out.println("Every column does have an even number of 1s: " + (isAllColumnsEven1s(m)));
		else{
			System.out.println("Every column does not have an even number of 1s: " + (isAllColumnsEven1s(m)));
		}
		
	}
	public static boolean isAllRowsEven1s(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
	}
	public static boolean isAllColumnsEven1s(int[][] m) {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1)
					count++;
			}
			if (count % 2 != 0)
				return false;
		}
		return true;
    }
}
