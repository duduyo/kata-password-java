package com.kata.password.rules;

public class IsLongEnoughRule implements ValidationRule {
    @Override
    public String validate(String password) {
        return isLongEnough(password)?"":"Password should contain more than 8 characters";
    }

    private boolean isLongEnough(String password) {
        return password.length()>8;
    }
}
