package com.kata.password.rules;

public class AtLeastOneDigitRule implements ValidationRule {
    static final String AT_LEAST_ONE_DIGIT = ".*\\p{N}.*";
    @Override
    public String validate(String password) {
        return containsDigit(password)?"":"Password should contain at least one digit";
    }

    private boolean containsDigit(String password) {
        return password.matches(AT_LEAST_ONE_DIGIT);
    }
}
