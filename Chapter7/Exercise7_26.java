/*
 * (Check whether array is sorted) An array list is required to be sorted in ascending 
order. Write a method that returns true if list is sorted, using the following header:
public static Bboolean isSorted(int[] list)
 Write a test program that prompts the user to enter a list of integers. Note the first 
number in the input indicates the number of elements in the list. This number is 
not part of the list
 */
package Chapter7;
import java.util.*;
public class Exercise7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter size for array ");
        int array_length = input.nextInt();
        int[] list = new int[array_length];
        
        for(int i = 0; i < array_length; i++){//building the array
          int num = input.nextInt();
          list[i] = num;

        }
        
        System.out.println("Is array sorted: " + isSorted(list));
    }
    public static boolean isSorted(int[] list){
        int number = 0;
        ArrayList <Integer> arrayList= new ArrayList <Integer> ();//turning array into arrayList
        
        for(int i = 0; i < list.length; i++) { //turned array into arraylist
            number = list[i];
            arrayList.add(number);
        }

        for(int i = 0; i < list.length - 1; i++){//check if its sorted
            if (list[i] > list [i + 1]){
                return false;
            }
        }
        return true;
        
    }
}
