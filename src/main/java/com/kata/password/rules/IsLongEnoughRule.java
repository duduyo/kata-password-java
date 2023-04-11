package com.kata.password.rules;

public class IsLongEnoughRule implements ValidationRule {
    @Override
    public boolean validate(String password) {
        return password.length()>8;
    }
}
