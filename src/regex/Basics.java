package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {
    public static void main(String[] args) {
        // Pattern 1: Matches a string with:
        // 'a' occurring one or more times, followed by
        // 'b' occurring one or more times, followed by
        // 'c' occurring zero or more times, and
        // 'd' occurring zero or more times.
        Pattern pattern = Pattern.compile("a+b+c*d*");

        // Pattern 2: Matches a string with:
        // One or more uppercase letters [A-Z]+, followed by
        // zero or more lowercase letters [a-z]*, followed by
        // at least one punctuation character \\p{Punct}+, followed by
        // one or more digits \\d+.
        Pattern pattern1 = Pattern.compile("[A-Z]+[a-z]*\\p{Punct}+\\d+");

        // Matcher for Pattern 1: Tests if "abcd" matches the regex "a+b+c*d*".
        Matcher matcher = pattern.matcher("abcd");

        // Matcher for Pattern 2: Tests if "Raysi@2002" matches the regex "[A-Z]+[a-z]*\\p{Punct}+\\d+".
        Matcher matcher1 = pattern1.matcher("Raysi@2002");

        // Check if the entire string matches Pattern 1.
        boolean b = matcher.matches();

        // Check if the entire string matches Pattern 2.
        boolean c = matcher1.matches();

        // Print the results.
        // Output: true for "abcd" as it satisfies "a+b+c*d*".
        System.out.println(b);

        // Output: true for "Raysi@2002" as it satisfies "[A-Z]+[a-z]*\\p{Punct}+\\d+".
        System.out.println(c);
    }
}