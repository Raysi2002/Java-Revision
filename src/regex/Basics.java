package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+b+c*d*");
        Pattern pattern1 = Pattern.compile("[A-Z]+[a-z]*\\p{Punct}+\\d+");
        Matcher matcher = pattern.matcher("abcd");
        Matcher matcher1 = pattern1.matcher("Raysi@2002");
        boolean b = matcher.matches();
        boolean c = matcher1.matches();
        System.out.println(b);
        System.out.println(c);
    }
}
