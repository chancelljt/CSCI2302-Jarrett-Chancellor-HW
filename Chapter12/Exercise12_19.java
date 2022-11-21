package Chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) {
        System.out.println("Connecting to https://liveexample.pearsoncmg.com/data/Lincoln.txt");
        URL url = null;
        try{
            url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");
        }
        catch(MalformedURLException ex){
            System.out.println("Invalid url: " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        }

        int wordCount = 0;
        String s = "";
        try(Scanner input = new Scanner(url.openStream())){
            while (input.hasNextLine()){
                s += input.nextLine();
            }
        }

        catch (IOException ex){
            ex.printStackTrace();
        }

        String[] words = s.split("[ ,.]", 0);
        words = removeEmptyStrings(words);
        System.out.println("Total word count = " + words.length);
    }

    private static String[] removeEmptyStrings(String[] words){
        ArrayList <String> modifiedWords = new ArrayList <> ();
        for(int i = 0; i < words.length; i++){
            if (words[i].length() != 0){
                modifiedWords.add(words[i]);
            }
        }

        return modifiedWords.toArray(new String[modifiedWords.size()]);
    }
}
