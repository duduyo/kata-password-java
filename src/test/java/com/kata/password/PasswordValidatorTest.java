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
    public void should_return_false_when_shorter_than_8() throws Exception {
        assertFalse(passwordValidator.validate("abc"));
    }

    @Test
    public void should_return_true_when_longuer_than_8_and_contains__letter_digit_and_special_char() throws Exception {
        assertTrue(passwordValidator.validate("123456789a&"));
    }

    @Test
    public void should_return_false_when_no_digit() throws Exception {
        assertFalse(passwordValidator.validate("abcdefghi"));
    }

    @Test
    public void should_return_false_when_no_letter() throws Exception {
        assertFalse(passwordValidator.validate("123456789"));
    }

    @Test
    public void should_return_false_when_no_special_character() throws Exception {
        assertFalse(passwordValidator.validate("12345678ab"));
    }

}
