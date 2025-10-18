package calculator;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Parser {

    private static final String CUSTOM_REGEX_PATTERN = "^//(.)\\\\n";
    private static final Set<String> DEFAULT_DELIMITERS = Set.of(Pattern.quote(":"), Pattern.quote(","));
    private final Set<String> customDelimiters = new HashSet<>();

    public String[] splitStringNum(final String inputValue) {
        Set<String> delimiter = getDelimiter(inputValue);

        String copyInputValue = inputValue;
        if (copyInputValue.startsWith("//")) {
            copyInputValue = copyInputValue.replaceFirst(CUSTOM_REGEX_PATTERN, "");
        }

        return copyInputValue.split(String.join("|", delimiter));
    }

    private Set<String> getDelimiter(final String inputValue) {
        if (inputValue.startsWith("//")) {
            setCustomDelimiter(inputValue);
            return customDelimiters;
        }
        return DEFAULT_DELIMITERS;
    }

    private void setCustomDelimiter(final String inputValue) {
        if (inputValue.startsWith("//")) {
            String delimiter = inputValue.substring(2, inputValue.indexOf("\\n"));
            String customDelimiter = Pattern.quote(delimiter);
            customDelimiters.add(customDelimiter);
        }
    }

}