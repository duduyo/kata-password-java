package com.kata.password.rules;

public class AtLeastOneSpecialCharacter implements ValidationRule {

    // p{Punct} matches one of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
    //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
    private static final String AT_LEAST_ONE_PUNCTUATION_CHARACTER = ".*\\p{Punct}.*";

    @Override
    public boolean validate(String password) {
        return password.matches(AT_LEAST_ONE_PUNCTUATION_CHARACTER);
    }
}
