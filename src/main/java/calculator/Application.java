package calculator;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input = InputView.input();
        String[] stringNumArr = Parser.splitStringNum(input);

        Calculator calc = new Calculator();
        Long result = calc.add(stringNumArr);

        OutputView.print(result);


    }
}
