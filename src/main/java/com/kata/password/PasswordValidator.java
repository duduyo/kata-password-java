package com.kata.password;

import com.kata.password.rules.AtLeastOneDigitRule;
import com.kata.password.rules.AtLeastOneLetterRule;
import com.kata.password.rules.IsLongEnoughRule;

public class PasswordValidator {

    private final AtLeastOneDigitRule atLeastOneDigitRule;
    private final AtLeastOneLetterRule atLeastOneLetterRule;
    private final IsLongEnoughRule isLongEnoughRule;

    PasswordValidator() {
        atLeastOneDigitRule = new AtLeastOneDigitRule();
        atLeastOneLetterRule = new AtLeastOneLetterRule();
        isLongEnoughRule = new IsLongEnoughRule();
    }

    boolean validate(String password) {
        return isLongEnoughRule.validate(password) &&
                atLeastOneDigitRule.validate(password) &&
                atLeastOneLetterRule.validate(password);
    }
}

