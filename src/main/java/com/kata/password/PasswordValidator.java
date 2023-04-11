package com.kata.password;

import com.kata.password.rules.AtLeastOneDigitRule;
import com.kata.password.rules.AtLeastOneLetterRule;
import com.kata.password.rules.IsLongEnoughRule;
import com.kata.password.rules.ValidationRule;
import com.kata.password.rules.AtLeastOneSpecialCharacter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PasswordValidator {

    private List<ValidationRule> validationRules;

    PasswordValidator() {

        validationRules = new ArrayList<>();
        validationRules.add(new AtLeastOneDigitRule());
        validationRules.add(new AtLeastOneLetterRule());
        validationRules.add(new IsLongEnoughRule());
        validationRules.add(new AtLeastOneSpecialCharacter());
    }

    List<String > validate(String password) {
        ArrayList<String> messageList = new ArrayList<>();
        for (ValidationRule rule : validationRules) {
            String message = rule.validate(password);
            if (!message.isEmpty()) {
                messageList.add(message);
            }
        }
        return messageList;
    }
}

