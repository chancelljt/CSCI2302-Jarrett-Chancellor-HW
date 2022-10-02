/*
 * (Find the index of the largest element) Write a method that returns the index of the 
largest element in an array of integers. If there is more than one element, return 
the largest index. Use the following header:
public static int indexOfLargestElement(double[] array)
 Write a test program that prompts the user to enter 10 numbers, invokes this 
method to return the index of the largest element, and displays the index and the 
element itself
 */

package Chapter7;
import java.util.*;
public class Exercise7_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double [10];
        System.out.println("Enter 10 numbers: ");
        
        for(int i=0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        System.out.println("The maximum element is at index: " + indexOfLargestElement(array));
    }

    public static int indexOfLargestElement(double[] array){
        int largestIndex = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] > array[largestIndex] ){
                largestIndex = i;
            }
        }

        return largestIndex;
        }
    }
