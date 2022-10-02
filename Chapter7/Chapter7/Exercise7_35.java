package Chapter7;

import java.util.*;

/*
 * (Game: hangman)
 *      Write a hangman game that randomly generates a word and prompts the user
 *      to guess one letter at a time, as shown in the sample run. Each letter in
 *      the word is displayed as an asterisk. When the user makes a correct guess,
 *      the actual letter is then displayed. When the user finishes a word, display
 *      the number of misses and ask the user whether to continue to play with another
 *      word. Declare an array to store words, as follows:
 *      Add any words you wish in this array
 *      String[] words = {"write", "that", ...};
 */


public class Exercise7_35 {

   public static String[] words = { "programming", "words", "test", "game" };
   static boolean isCorrect;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play = "y";

        while(play.equals("y")){
            String word = getWord();
            String hiddenWord = getHiddenWord(word);
            int misCount = 0;
            while(!word.equals(hiddenWord)){
                System.out.println("Guess a letter in word " + hiddenWord + " > ");
                char ch = input.next().charAt(0);

                if(!isAlreadyInWord(hiddenWord, ch)){
                    hiddenWord = getGuess(word, hiddenWord, ch);
                    if(!isCorrect){
                        System.out.println(ch + " is not in the word.");
                        misCount++;
                    }
                    else{
                        System.out.println(ch + " is already in word.");
                    }
                }
                    System.out.println("The word is in the program. You missed "+ misCount);
                    System.out.println("Do you want to try again? Enter y for yes, n for no ");
                    play = input.next();
                }
            }
        }

    private static String getWord() {
        return words[(int) (Math.random() * words.length)];
    }

    private static String getHiddenWord(String word) {
        String hidden = "";
        for(int i = 0; i < word.length(); i++){
         hidden += "*";
        } 
         return hidden;
     }

     private static String getGuess(String word, String hiddenWord, char ch) {
        isCorrect = false;
        StringBuilder s = new StringBuilder(hiddenWord);
        for(int i = 0; i < word.length(); i++){
            if(ch == word.charAt(i) && s.charAt(i) == '*'){
                isCorrect = true;
                s = s.deleteCharAt(i);
                s = s.insert(i,ch);
            }
        }     
        
        return s.toString();
    }

    public static boolean isAlreadyInWord(String hiddenWord, char ch) {
        for(int i = 0; i < hiddenWord.length(); i++){
            if(ch == hiddenWord.charAt(i)){
                return true;
            }
        }
        return false;
    }
    
}

