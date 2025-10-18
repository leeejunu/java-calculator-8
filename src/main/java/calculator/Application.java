package calculator;

import calculator.controller.CalculatorController;
import calculator.util.Parser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            String input = InputView.input();

            CalculatorController calc = new CalculatorController(new Parser());
            Long result = calc.add(input);

            OutputView.print(result);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            throw e;
        }
    }
}
