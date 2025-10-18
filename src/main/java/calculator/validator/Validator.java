package calculator.validator;

import java.util.Set;
import java.util.regex.Pattern;

public class Validator {

    public static void validateNonNegativeInteger(String strNum) {
        if (Long.parseLong(strNum) < 0) {
            throw new IllegalArgumentException("음수는 입력하실 수 없습니다.");
        }
    }

    public static void validateInput(String inputValue, Set<String> delimiters) {
        for (char c : inputValue.toCharArray()) {
            String regex = Pattern.quote(String.valueOf(c));
            if (Character.isDigit(c) && Long.parseLong(String.valueOf(c)) == 0) {
                throw new IllegalArgumentException("0은 입력할 수 없습니다.");
            }

            if (!Character.isDigit(c) && !delimiters.contains(regex)) {
                throw new IllegalArgumentException("구분자와 양수만 입력할 수 있습니다. 잘못된 문자 = " + c);
            }
        }
    }

    public static void validateCustomDelimiter(String delimiter) {
        if (delimiter.length() != 1) {
            throw new IllegalArgumentException("구분자는 한 글자만 입력할 수 있습니다.");
        }

        if (Pattern.matches("[0-9]", delimiter)) {
            throw new IllegalArgumentException("숫자를 구분자로 할 수 없습니다.");
        }
    }
}
