//3.	Match valid email addresses:
//        •	Input: "user@example.com, invalid@.com, test@domain.org"
//        •	Output: ["user@example.com", "test@domain.org"]


package regex.problems.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    public static void main(String[] args) {
        String str = "user@example.com";
        System.out.println(isValidEmail(str));
    }

    public static boolean isValidEmail(String str){
        Pattern pattern = Pattern.compile("[a-zA-Z]+.*_*[a-zA-Z]@{1}[a-zA-Z]+.{1}[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
