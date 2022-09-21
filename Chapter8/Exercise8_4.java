package Chapter8;

import java.util.*;

/*
(Compute the weekly hours for each employee) Suppose the weekly hours 
for all employees are stored in a two-dimensional array. Each row records an 
employee’s seven-day work hours with seven columns. For example, the following array 
stores the work hours for eight employees. Write a program that 
displays employees and their total hours in increasing order of the total hours.
 */
public class Exercise8_4 {
    static final int numEmployee = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] totalHoursChart={
            {7,9,5,8,8,9,10},
            {8,9,5,8,9,4,7},
            {8,7,9,6,7,3,8},
            {8,6,3,9,10,8,9},
            {7,8,4,9,6,4,2},
            {3,9,5,7,8,10,10},
            {2,9,4,8,6,9,3},
            {5,7,3,2,8,9,5}};
            int[] bruh = calcTotalHours(totalHoursChart);
            for(int i = 0; i < 8; i++){//go through employee
        
                System.out.println(bruh[i]);
                
                
            }
        }

    public static int[] calcTotalHours(int[][] m) {
       // int[] totalHoursChart = new int[m.length];
        int[] totalHours = new int [8];
        int total=0;
            for(int i = 0; i < 8; i++){//go through employee
                for(int j = 0; j < 7 ; j++){//each day
                    total= m[i][j] + total ;
                }
                totalHours[i]=total;
                total=0;
            }

        /*for (int i = 0; i < m.length; i++) {
            totalHoursChart[i] = getRowTotalHour(m, i);
            
        }*/
        return totalHours;
    }
/* 
    public static int getRowTotalHour(int[][] m, int row) {

        int total = 0;
        for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
        }
        return total;
    }*/
}