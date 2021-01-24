package ua.com.foxminded;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class AnagramsEngineTest {

    public static final String NULL_INPUT = null;
    public static final String EMPTY_SENTENCE = "";
    public static final String ONLY_LETTERS = "abcde efghi";
    public static final String ONLY_LETTERS_REVERSED = "edcba ihgfe";
    public static final String ONLY_SYMBOLS = "!@#$%^ &*()_";
    public static final String ONLY_SYMBOLS_REVERSED = "!@#$%^ &*()_";
    public static final String ONLY_DIGITS = "12345 67890";
    public static final String ONLY_DIGITS_REVERSED = "12345 67890";
    public static final String LETTERS_AND_DIGITS = "a1bcd efg!h";
    public static final String LETTERS_AND_DIGITS_REVERSED = "d1cba hgf!e";
    public static final String DIGITS_AND_SYMBOLS = "1@3$5 ^7*9)";
    public static final String DIGITS_AND_SYMBOLS_REVERSED = "1@3$5 ^7*9)";
    public static final String SYMBOLS_AND_LETTERS = "a!c#d% e&f(g";
    public static final String SYMBOLS_AND_LETTERS_REVERSED  = "d!c#a% g&f(e";
    public static final String SYMBOLS_AND_LETTERS_AND_DIGITS  = "a2#d5 ^g8(h";
    public static final String SYMBOLS_AND_LETTERS_AND_DIGITS_REVERSED  = "d2#a5 ^h8(g";

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNullIsPassed() {
        assertThrows(IllegalArgumentException.class, 
                ()-> AnagramsEngine.reverseWords(NULL_INPUT), AnagramsEngine.NULL_EXCEPT_MSG);
    }

    @Test
    void reverseWordsTestEmptyWord() {
        assertEquals(EMPTY_SENTENCE, AnagramsEngine.reverseWords(EMPTY_SENTENCE));
    }

    @Test
    void reverseWordsTestOnlyLettersSentence() {
        assertEquals(ONLY_LETTERS_REVERSED, AnagramsEngine.reverseWords(ONLY_LETTERS));
    }

    @Test
    void reverseWordsTestOnlySymbolsSentence() {
        assertEquals(ONLY_SYMBOLS_REVERSED, AnagramsEngine.reverseWords(ONLY_SYMBOLS));
    }

    @Test
    void reverseWordsTestOnlyDigitsSentence() {
        assertEquals(ONLY_DIGITS_REVERSED, AnagramsEngine.reverseWords(ONLY_DIGITS));
    }

    @Test
    void reverseWordsTestLettersAndDigitsSentence() {
        assertEquals(LETTERS_AND_DIGITS_REVERSED, AnagramsEngine.reverseWords(LETTERS_AND_DIGITS));
    }

    @Test
    void reverseWordsTestSymbolsAndLettersSentence() {
        assertEquals(SYMBOLS_AND_LETTERS_REVERSED, AnagramsEngine.reverseWords(SYMBOLS_AND_LETTERS));
    }

    @Test
    void reverseWordsTestDigitsAndSymbolsSentence() {
        assertEquals(DIGITS_AND_SYMBOLS_REVERSED, AnagramsEngine.reverseWords(DIGITS_AND_SYMBOLS));
    }

    @Test
    void reverseWordsTestSymbolsAndLettersAndDigitsSentence() {
        assertEquals(SYMBOLS_AND_LETTERS_AND_DIGITS_REVERSED, AnagramsEngine.reverseWords(SYMBOLS_AND_LETTERS_AND_DIGITS));
    }
}
