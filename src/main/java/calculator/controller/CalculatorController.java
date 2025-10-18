package calculator.controller;

import calculator.util.Parser;

import static calculator.validator.Validator.validateNonNegativeInteger;

public class CalculatorController {

    Parser parser;

    public CalculatorController(Parser parser) {
        this.parser = parser;
    }

    public long add(String inputValue) {
        String[] strNumArr = parser.splitInputValue(inputValue);

        long result = 0L;
        for (String stringNum : strNumArr) {
            if (stringNum.isEmpty()) {
                continue;
            }
            validateNonNegativeInteger(stringNum);
            result += Long.parseLong(stringNum);
        }
        return result;
    }
}
