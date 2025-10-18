package calculator;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            String input = InputView.input();
            String[] stringNumArr = Parser.splitStringNum(input);

            Calculator calc = new Calculator();
            Long result = calc.add(stringNumArr);

            OutputView.print(result);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
        }
    }
}
