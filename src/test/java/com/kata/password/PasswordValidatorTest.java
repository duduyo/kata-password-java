package com.kata.password;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @BeforeEach
    public void setUp() throws Exception {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void should_return_false_when_no_shorter_than_8() throws Exception {
        assertFalse(passwordValidator.validate("abc"));
    }

    @Test
    public void should_return_true_when_longuer_than_8() throws Exception {
        assertTrue(passwordValidator.validate("123456789a"));
    }

    @Test
    public void should_return_false_when_no_digit() throws Exception {
        assertFalse(passwordValidator.validate("abcdefghi"));
    }

    @Test
    public void should_return_true_when_contains_a_digit() throws Exception {
        assertTrue(passwordValidator.validate("abcdefghi6"));
    }

    @Test
    public void should_return_false_when_no_letter() throws Exception {
        assertFalse(passwordValidator.validate("123456789"));
    }
}
