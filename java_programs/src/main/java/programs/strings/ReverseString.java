package programs.strings;

public class ReverseString {

    public static String reversedString(final String input) {
        return new StringBuilder(input)
                .reverse().toString();
    }

    public static String reversedStringUsingStringBuffer(final String input) {
        return new StringBuffer(input)
                .reverse().toString();
    }

    public static String reversedStringUsingLoop(final String input) {
        String reversed = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reversed += String.valueOf(input.charAt(i));
        }
        return reversed;
    }

}
