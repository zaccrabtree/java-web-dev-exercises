package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;

public class CountingCharacters {
    public static void main (String[] args) {
        String phrase = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> countingCharacters = new HashMap<>();

        for (char i : phrase.toLowerCase().toCharArray()) {
            if (!countingCharacters.containsKey(i)){
                countingCharacters.put(i, 1);
            } else if(countingCharacters.containsKey(i) ) {
                countingCharacters.put(i, countingCharacters.get(i) + 1);
            }
        }
        System.out.println(countingCharacters);
    }
}
