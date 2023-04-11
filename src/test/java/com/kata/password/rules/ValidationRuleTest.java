package com.kata.password.rules;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidationRuleTest {

    @Test
    public void should_validate_contains_at_least_one_digit() {
        ValidationRule rule = new AtLeastOneDigitRule();
        assertThat(rule.validate("a")).isEqualTo("Password should contain at least one digit");
        assertThat(rule.validate("&éç#")).isEqualTo("Password should contain at least one digit");
        assertThat(rule.validate("1")).isEmpty();
        assertThat(rule.validate("a1")).isEmpty();
        assertThat(rule.validate("a&2")).isEmpty();
    }

    @Test
    public void should_validate_contains_at_least_one_letter() {
        ValidationRule rule = new AtLeastOneLetterRule();
        assertThat(rule.validate("a")).isEmpty();
        assertThat(rule.validate("1A")).isEmpty();
        assertThat(rule.validate("23é#")).isEmpty();
        assertThat(rule.validate("23#")).isEqualTo("Password should contain at least one letter");
        assertThat(rule.validate("8_")).isEqualTo("Password should contain at least one letter");
    }

    @Test
    public void should_validate_is_long_enough() {
        ValidationRule rule = new IsLongEnoughRule();
        assertThat(rule.validate("123456789")).isEmpty();
        assertThat(rule.validate("12345678az3#")).isEmpty();
        assertThat(rule.validate("12345678")).isEqualTo("Password should contain more than 8 characters");
        assertThat(rule.validate("123456")).isEqualTo("Password should contain more than 8 characters");
    }

    @Test
    public void should_validate_contains_at_least_one_special_character() {
        ValidationRule rule = new AtLeastOneSpecialCharacter();
        assertThat(rule.validate("#")).isEmpty();
        assertThat(rule.validate("abdc}a")).isEmpty();
        assertThat(rule.validate("123")).isEqualTo("Password should contain at least one special character");
        assertThat(rule.validate("abCD")).isEqualTo("Password should contain at least one special character");
        assertThat(rule.validate("ab CD")).isEqualTo("Password should contain at least one special character");

    }

}


