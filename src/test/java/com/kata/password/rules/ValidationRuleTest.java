package com.kata.password.rules;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationRuleTest {


    @Test
    public void should_validate_contains_at_least_one_digit() throws Exception {
        ValidationRule rule = new AtLeastOneDigitRule();
        assertFalse(rule.validate("a"));
        assertFalse(rule.validate("&éç#"));
        assertTrue(rule.validate("1"));
        assertTrue(rule.validate("a1"));
        assertTrue(rule.validate("a&2"));
    }

    @Test
    public void should_validate_contains_at_least_one_letter() {
        ValidationRule rule = new AtLeastOneLetterRule();
        assertTrue(rule.validate("a"));
        assertTrue(rule.validate("1A"));
        assertTrue(rule.validate("23é#"));
        assertFalse(rule.validate("23#"));
        assertFalse(rule.validate(" 8_("));

    }

    @Test
    public void should_validate_is_long_enough() throws Exception {
        ValidationRule rule = new IsLongEnoughRule();
        assertTrue(rule.validate("123456789"));
        assertTrue(rule.validate("12345678az3#"));
        assertFalse(rule.validate("12345678"));
        assertFalse(rule.validate("123456"));
    }

}


