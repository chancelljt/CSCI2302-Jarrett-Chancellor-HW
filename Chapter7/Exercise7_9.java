/*
 * (Find the largest element) Write a method that finds the largest element in an array 
of double values using the following header:
public static double max(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this 
method to return the maximum value, and displays the maximum value.
 */
package Chapter7;
import java.util.*;
public class Exercise7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array double numbers (10): ");
        double[] findLargest = new double [10];
        input.nextDouble();

        for(int i=0; i < findLargest.length; i++){
            findLargest [i] = input.nextDouble();
        }
        double largestValue = max(findLargest);

        System.out.println("The largest value is: " + largestValue);
    }
    
    public static double max(double[] findLargest){
        double largest = 0;
        
        for(int i = 0; i < findLargest.length; i++){
            if (findLargest[i] > largest){
                largest = findLargest[i];
            }
        }
    
        return largest;
    }

}
