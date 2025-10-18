package calculator;

public class OutputView {

    public static void print(Long result) {
        System.out.println("결과 : " + result);
    }

    public static void printErrorMessage(String error) {
        System.out.println("[ERROR] " + error);
    }
}