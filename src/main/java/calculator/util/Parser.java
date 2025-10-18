package calculator.util;

import calculator.validator.Validator;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Parser {

    private static final String CUSTOM_REGEX_PATTERN = "^//(.)\\\\n";
    private final Delimiter delimiter = new Delimiter();

    public String[] splitInputValue(final String inputValue) {

        String copyInputValue = inputValue;
        if (copyInputValue.startsWith("//")) {
            copyInputValue = copyInputValue.replaceFirst(CUSTOM_REGEX_PATTERN, "");
        }

        Set<String> delimiters = delimiter.getDelimiter(inputValue);

        Validator.validateInputValue(copyInputValue, delimiters);

        String regex = delimiters.stream()
                .map(Pattern::quote)
                .collect(Collectors.joining("|"));

        return copyInputValue.split(regex);
    }



}