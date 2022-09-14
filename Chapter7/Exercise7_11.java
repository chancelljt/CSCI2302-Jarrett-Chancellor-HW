/*
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard 
deviation of numbers. This exercise uses a different but equivalent formula to 
compute the standard deviation of n numbers.
 To compute the standard deviation with this formula, you have to store the individual 
 numbers using an array, so they can be used after the mean is obtained.
Your program should contain the following methods:
* Compute the deviation of double values */
//public static double deviation(double[] x)
/* Compute the mean of an array of double values */
//public static double mean(double[] x)
 /*Write a test program that prompts the user to enter 10 numbers and displays the 
mean and standard deviation
 */
package Chapter7;
import java.util.*;
public class Exercise7_11 {
    public static void main(String[] args) {
       // std(A) = sqrt(variance(A))  
       Scanner input = new Scanner(System.in);
       System.out.println("Enter 10 integers: ");
       
       double[] array = new double[10];
       for(int i=0; i < array.length; i++){
        array[i] = input.nextDouble();
    }
    System.out.println("The mean is: " + mean(array));
    System.out.println("The standard deviation is: " + deviation(array));
}
    
    public static double deviation(double[] x){
        double mean = mean(x);
        double sum = 0;
        double variance;
        double stddev;

        for(int i=0; i< x.length; i++){
            sum += ((x[i] - mean)*(x[i] - mean));
        }
        
        variance = sum / x.length;
        stddev = Math.sqrt(variance);
        return stddev;
    }

    public static double mean(double[] array){
        double sum = 0;

        for (int i =0; i < array.length; i++){
           sum += array[i];
        }

        return (sum / array.length);
    }
}

