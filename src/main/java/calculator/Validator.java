package calculator;

public class Validator {

    public static void validateNonNegativeInteger(String strNum) {
        if (Long.parseLong(strNum) < 0) {
            throw new IllegalArgumentException("음수는 입력하실 수 없습니다.");
        }
    }

}
