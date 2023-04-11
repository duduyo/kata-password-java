package com.kata.password.rules;

public class AtLeastOneLetterRule implements ValidationRule {

    private static final String AT_LEAST_ONE_LETTER_REGEXP = ".*\\p{L}.*";

    public boolean validate(String password) {
        return password.matches(AT_LEAST_ONE_LETTER_REGEXP);
    }
}
