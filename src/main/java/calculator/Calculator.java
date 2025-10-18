package calculator;

public class Calculator {

    public long add(final String[] arr) {

        long result = 0L;
        for (String stringNum : arr) {
            if (stringNum.isEmpty()) {
                continue;
            }
            result += Long.parseLong(stringNum);
        }
        return result;
    }
}
