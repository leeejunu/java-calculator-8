package calculator;

import java.util.Arrays;

public class Calculator {


    public long add(final String[] arr) {

        System.out.println(Arrays.toString(arr));
        if (arr.length == 1 && arr[0].isEmpty()) {
            return 0L;
        }

        long result = 0L;
        for (String stringNum : arr) {
            result += Long.parseLong(stringNum);
        }
        return result;
    }
}
