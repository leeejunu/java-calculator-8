package calculator.controller;

import calculator.util.Parser;

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
            result += Long.parseLong(stringNum);
        }
        return result;
    }
}
