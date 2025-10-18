package calculator.controller;

import calculator.util.Parser;

import java.util.Arrays;

import static calculator.validator.Validator.validateNonNegativeInteger;

public class CalculatorController {

    Parser parser;

    public CalculatorController(Parser parser) {
        this.parser = parser;
    }

    public long add(String inputValue) {
        String[] strNumArr = parser.splitInputValue(inputValue);

        if (inputValue.isEmpty()) {
            return 0L;
        }

        long result = 0L;
        for (String stringNum : strNumArr) {

            validateNonNegativeInteger(stringNum);
            result += Long.parseLong(stringNum);
        }
        return result;
    }
}
