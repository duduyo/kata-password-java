package com.kata.password.rules;

public class AtLeastOneLetterRule implements ValidationRule {

    private static final String AT_LEAST_ONE_LETTER_REGEXP = ".*\\p{L}.*";
    public String validate(String password) {
        return contaisLetter(password)?"":"Password should contain at least one letter";
    }

    private boolean contaisLetter(String password) {
        return password.matches(AT_LEAST_ONE_LETTER_REGEXP);
    }
}
