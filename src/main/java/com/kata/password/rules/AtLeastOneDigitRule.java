package com.kata.password.rules;

public class AtLeastOneDigitRule implements ValidationRule {
    static final String AT_LEAST_ONE_DIGIT = ".*\\p{N}.*";
    @Override
    public boolean validate(String password) {
        return password.matches(AT_LEAST_ONE_DIGIT);
    }
}
