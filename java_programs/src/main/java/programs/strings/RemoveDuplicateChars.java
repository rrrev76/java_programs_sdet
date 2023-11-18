package programs.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static String getUniqueChars(final String value) {
        Set<Character> input = new LinkedHashSet<>();
        String unique = "";
        for (char c : value.toCharArray()) {
            input.add(c);
        }

        for (Character c : input) {
            unique = unique.concat(String.valueOf(c));
        }
        return unique;
    }

}
