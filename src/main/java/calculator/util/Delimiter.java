package calculator.util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static calculator.validator.Validator.validateCustomDelimiter;

public class Delimiter {
    private static final Set<String> DEFAULT_DELIMITERS = Set.of(Pattern.quote(":"), Pattern.quote(","));
    private final Set<String> customDelimiters;

    public Delimiter() {
        customDelimiters = new HashSet<>();
    }

    public Set<String> getDelimiter(String inputValue) {
        if (inputValue.startsWith("//")) {
            setCustomDelimiter(inputValue);
            return customDelimiters;
        }
        return DEFAULT_DELIMITERS;
    }

    private void setCustomDelimiter(String inputValue) {
        if (inputValue.startsWith("//")) {
            String customDelimiter = inputValue.substring(2, inputValue.indexOf("\\n"));
            validateCustomDelimiter(customDelimiter);
            customDelimiters.add(Pattern.quote(customDelimiter));
        }
    }
}
