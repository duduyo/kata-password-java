package com.kata.password;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {

    private static final String AT_LEAST_ONE_LETTER = ".*\\p{L}.*";
    private static final String AT_LEAST_ONE_DIGIT = ".*\\p{N}.*";

    // p{Punct} matches one of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
    //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
    private static final String AT_LEAST_ONE_PUNCTUATION_CHARACTER = ".*\\p{Punct}.*";

    @Test
    public void contains_at_least_one_letter() {
        assertTrue("a".matches(AT_LEAST_ONE_LETTER));
        assertTrue("123B".matches(AT_LEAST_ONE_LETTER));
        assertTrue("é".matches(AT_LEAST_ONE_LETTER));
        assertTrue("ç".matches(AT_LEAST_ONE_LETTER));
        assertFalse("12345".matches(AT_LEAST_ONE_LETTER));
        assertFalse("".matches(AT_LEAST_ONE_LETTER));
        assertFalse("&34".matches(AT_LEAST_ONE_LETTER));
    }

    @Test
    public void contains_at_least_one_number() {
        assertTrue("12".matches(AT_LEAST_ONE_DIGIT));
        assertTrue("9".matches(AT_LEAST_ONE_DIGIT));
        assertFalse("abc#{".matches(AT_LEAST_ONE_DIGIT));
    }

    @Test
    public void contains_at_least_one_special_character()  {
        assertFalse("acè123".matches(AT_LEAST_ONE_PUNCTUATION_CHARACTER));
        assertTrue("&".matches(AT_LEAST_ONE_PUNCTUATION_CHARACTER));
        assertTrue("abc{".matches(AT_LEAST_ONE_PUNCTUATION_CHARACTER));
    }
}
