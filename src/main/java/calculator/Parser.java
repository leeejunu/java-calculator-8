package calculator;

import java.util.*;

public class Parser {

    private static final List<String> DEFAULT_DELIMITER = List.of(":", ",");

    public static String[] splitStringNum(final String inputValue) {
        String regex = "[" + String.join("", DEFAULT_DELIMITER) + "]";
        return inputValue.split(regex);
    }
}