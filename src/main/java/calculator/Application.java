package calculator;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            String input = InputView.input();

            Calculator calc = new Calculator(new Parser());
            Long result = calc.add(input);

            OutputView.print(result);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
        }
    }
}
