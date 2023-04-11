package com.kata.password;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PasswordValidatorTest {

    private PasswordValidator passwordValidator;

    @BeforeEach
    public void setUp() throws Exception {
        passwordValidator = new PasswordValidator();
    }
    @Test
    public void should_return_error_message_when_no_digit_and_no_letter_and_no_long_enough() {
        assertThat(passwordValidator.validate("####")).containsExactlyInAnyOrder(
                "Password should contain at least one digit",
                        "Password should contain at least one letter",
                        "Password should contain more than 8 characters");
    }

    @Test
    public void should_return_error_message_when_no_digit_and_no_special_character() {
        assertThat(passwordValidator.validate("abcdefghijk")).
                containsExactlyInAnyOrder("Password should contain at least one digit",
                        "Password should contain at least one special character");
    }

    @Test
    public void should_return_empty_when_password_satisfies_all_rules() {
        assertThat(passwordValidator.validate("abcdefghijk##4")).
                isEmpty();
    }
}
