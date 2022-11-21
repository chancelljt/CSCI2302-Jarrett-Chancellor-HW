package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

public class Exercise12_15 {
    public static void main(String[] args) {
        File filename = new File("Exercise12_15.txt");
        if(!filename.exists()){
            System.out.println(filename + " already exists.....");
        }

        try{
            PrintWriter out = new PrintWriter(filename);
            out.print(randomNumbers(100));
            out.close();
            System.out.println("Wrote to file....");
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println("Reading from file....");
        ArrayList <Integer> list = new ArrayList<>();

        try{
            Scanner input = new Scanner(filename);
            while (input.hasNextInt()){
                list.add(input.nextInt());
            }
        }

        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }

        sort(list);
        System.out.println(list);
    }

    public static String randomNumbers(int size){
        String s = "";
        for(int i = 0; i < size; i++){
            s += " " + (int)(Math.random() * 100);
        }

        return s;
    }

    public static void sort(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int currentMin = list.get(i);
            int currentIndex = i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) < currentMin){
                    currentIndex = j;
                    currentMin = list.get(j);
                }
            }

            if(currentIndex != i){
                list.set(currentIndex, list.get(i));
                list.set(i,currentMin);
            }
        }
    }
}