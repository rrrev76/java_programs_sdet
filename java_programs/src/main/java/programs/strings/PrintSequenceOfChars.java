package programs.strings;

public class PrintSequenceOfChars {

    public static void printChars(final String input) {

        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(input.charAt(i));
            }
            count++;
        }
    }
}
