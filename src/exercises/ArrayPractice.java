package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                System.out.println(numberArray[i]);
            } else {
                continue;
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String[] sentences = phrase.split( "\\.");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
