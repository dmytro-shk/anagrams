package ua.com.foxminded;

import java.util.StringJoiner;

public final class AnagramsEngine {
    public static final String DELIMITER = " ";
    public static final String NULL_EXCEPT_MSG = "Invalid input: String should not be a null";

    private AnagramsEngine() {}

    public static String reverseWords(String input) {
        if (input == null) {
            throw new IllegalArgumentException(NULL_EXCEPT_MSG);
        }
        String[] words = input.split(DELIMITER);
        StringJoiner result = new StringJoiner(DELIMITER);
        for (int i = 0; i < words.length; i++) {
            result.add(reverseWord(words[i]));
        }
        return result.toString();
    }

    private static String reverseWord(String input) {
        StringBuilder word = new StringBuilder(input);
        int rightIndex = word.length() - 1;
        int leftIndex = 0;
        while (leftIndex < rightIndex) {
            if (Character.isLetter(word.charAt(leftIndex)) == false)
                leftIndex++;
            else if (Character.isLetter(word.charAt(rightIndex)) == false)
                rightIndex--;
            else {
                swapSymbols(leftIndex, rightIndex, word);
                leftIndex++;
                rightIndex--;
            }
        }
        return word.toString();
    }

    private static String swapSymbols(int leftIndex, int rightIndex, StringBuilder input) {
        char tempSymbol;
        tempSymbol = input.charAt(rightIndex);
        input.setCharAt(rightIndex, input.charAt(leftIndex));
        input.setCharAt(leftIndex, tempSymbol);
        return input.toString();
    }
}
