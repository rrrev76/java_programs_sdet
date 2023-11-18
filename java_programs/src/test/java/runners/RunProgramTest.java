package runners;

import org.junit.Test;
import programs.strings.RemoveDuplicateChars;
import programs.strings.ReverseString;

public class RunProgramTest {

    @Test
    public void removeDuplicate() {
        String actual = RemoveDuplicateChars.getUniqueChars("aabb");
        System.out.println(actual);
    }

    @Test
    public void reverseString () {
        System.out.println(ReverseString.reversedString("abcd"));
        System.out.println(ReverseString.reversedStringUsingStringBuffer("Atos"));
        System.out.println(ReverseString.reversedStringUsingLoop("dbo"));
    }
}
