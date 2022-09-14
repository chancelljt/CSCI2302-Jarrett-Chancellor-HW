/*
 *  (The number of even numbers and odd numbers) Write a program that reads ten 
integers, and then display the number of even numbers and odd numbers. Assume 
that the input ends with 0. Here is the sample run of the program.
 */
package Chapter7;
import java.util.*;;
public class Exercise7_5{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integers ending with 0: ");
        int[] givenNumbers = new int [10];
        
        for(int i=0; i <= givenNumbers.length -1; i++){
            givenNumbers[i] = input.nextInt();
        } 

        int evens = 0;
        int odds = 0;
        for(int i=0; i <= givenNumbers.length -1; i++){
            if (givenNumbers[i]%2 == 0){
                evens++;
            }
            else{
                odds++;
            }
        }
        System.out.println("The even numbers are: " + evens);
        System.out.println("The odd numbers are: " + odds);

        input.close();
    }
}
