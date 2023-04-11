package com.kata.password.rules;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationRuleTest {

    private ValidationRule atLeastOneDigitRule;

    @BeforeEach
    public void setUp() throws Exception {
        atLeastOneDigitRule = new AtLeastOneDigitRule();
    }

    @Test
    public void should_return_false_when_no_digit() throws Exception {
        assertFalse(atLeastOneDigitRule.validate("a"));
        assertFalse(atLeastOneDigitRule.validate("&éç#"));
    }

    @Test
    public void should_true_when_at_least_one_digit() throws Exception {
        assertTrue(atLeastOneDigitRule.validate("1"));
        assertTrue(atLeastOneDigitRule.validate("a1"));
        assertTrue(atLeastOneDigitRule.validate("a&2"));
    }
}


