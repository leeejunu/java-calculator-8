package calculator;

import java.util.Set;

public class Parser {

    private static final String CUSTOM_REGEX_PATTERN = "^//(.)\\\\n";
    private final Delimiter delimiter = new Delimiter();

    public String[] splitStringNum(final String inputValue) {
        Set<String> delimiters = delimiter.getDelimiter(inputValue);

        String copyInputValue = inputValue;
        if (copyInputValue.startsWith("//")) {
            copyInputValue = copyInputValue.replaceFirst(CUSTOM_REGEX_PATTERN, "");
        }

        return copyInputValue.split(String.join("|", delimiters));
    }



}