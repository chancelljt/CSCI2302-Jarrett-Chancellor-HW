/*
 * 1. Exercise 7.1
(Assign grades) Write a program that reads student scores, gets the best score, and 
then assigns grades based on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
 */
package Chapter7;
import java.util.*;
public class Exercise7_1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        double[] numberGrades = new double[input.nextInt()];
        double max = -1;
        System.out.println();
        System.out.println("Enter the Number Grades: ");
        for(int i=0; i <= numberGrades.length -1; i++){
            numberGrades[i] = input.nextDouble();
            if (numberGrades[i] > max){
                max = numberGrades[i];
            }
        } 
        char [] letterGrades = new char [numberGrades.length];
        for(int i=0; i <= numberGrades.length -1; i++){
            if(numberGrades[i] >= max -5){
                letterGrades[i] = 'A';
            }
            else if(numberGrades[i] >= max -10){
                letterGrades[i] = 'B';
            }
            else if(numberGrades[i] >= max -15){
                letterGrades[i] = 'C';
            }
            else if(numberGrades[i] >= max -20){
                letterGrades[i] = 'D';
            }
            else{
                letterGrades[i] = 'F';
            }
        }
        System.out.println("The grades are: ");
        for (int i = 0; i<letterGrades.length; i++){
            System.out.print(letterGrades[i]);
            System.out.print(", ");
        }
        input.close();

    }
}    

    
        
