package calculator;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Delimiter {
    private static final Set<String> DEFAULT_DELIMITERS = Set.of(Pattern.quote(":"), Pattern.quote(","));
    private final Set<String> customDelimiters;

    public Delimiter() {
        customDelimiters = new HashSet<>();
    }

    public Set<String> getDelimiter(final String inputValue) {
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
