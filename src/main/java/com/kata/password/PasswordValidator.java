package com.kata.password;

public class PasswordValidator {

    private static final String AT_LEAST_ONE_DIGIT = ".*\\p{N}.*";

    private static final String AT_LEAST_ONE_LETTER = ".*\\p{L}.*";

    boolean validate(String password) {
        return  password.length()>8 &&
                password.matches(AT_LEAST_ONE_DIGIT) &&
                password.matches(AT_LEAST_ONE_LETTER);
    }
}
