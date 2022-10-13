package cz.acamar.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(new Task1().lengthOfLastWord("Hello World"));
    }

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        Matcher matcher = Pattern.compile("\\S*$").matcher(str.trim());
        return matcher.find() ? matcher.group().length() : 0;
    }
}
