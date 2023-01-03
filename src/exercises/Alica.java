package exercises;
import java.util.Scanner;
public class Alica {
    public static void main (String[] args) {
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";



        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to find within the first sentence of Alice in Wonderland: ");
        String word = input.nextLine();
        Integer index = firstLine.indexOf(word);
        Integer length = word.length();
        String modifiedSentence = firstLine.replace(word, "");


        if(firstLine.toLowerCase().contains(word.toLowerCase())){
            System.out.println("Your word was found within the first sentence of Alice in Wonderland at " + index + ". Your word is " + length + " characters long.");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Your word was not found.");
        }
    }
}
