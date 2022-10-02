/*
 * (Check whether the array is sorted with constant interval) An array list is sorted 
with a constant interval if its elements are arranged in an ascending order and there 
is a constant difference between adjacent elements. Write a method that returns 
true if list is sorted with a constant interval, using the following header:
public static boolean isSortedConstantInterval(int[] list)
 Write a test program that prompts the user to enter a list of integers. Note the first 
number in the input indicates the number of elements in the list. This number is 
not part of the list. .length-1
 */
package Chapter7;
import java.util.*;
public class Exercise7_27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers ");
        int num = input.nextInt();
        int[] list = new int[num];

        for(int i = 0; i < list.length; i++){//building the array
            num = input.nextInt();
            list[i] = num;
        }
        System.out.println("Is array sorted by interval: " + isSortedConstantInterval(list));
    }
    public static boolean isSortedConstantInterval(int[] list){
        int tracker = list[0] - list [1];   
        for(int i = 0; i > list.length - 1; i++) {
            if (list [i] - list [i + 1] != tracker) {
                return false;
            }
            
        }
        return true;
        }
        
}

