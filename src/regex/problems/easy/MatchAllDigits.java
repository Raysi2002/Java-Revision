//2.	Match all digits in a string:
//        •	Input: "The year is 2025, and the time is 12:45 PM"
//        •	Output: ["2025", "12", "45"]

package regex.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAllDigits {
    public static void main(String[] args) {
        String str = "The year is 2025, and the time is 12:45 PM";
        System.out.println(matchAllDigits(str));
    }


    static List<String> matchAllDigits(String str){
        List<String> list = new ArrayList<>();
        //to make an array of Strings with the regex
        String[] words = str.split("\\s+|\\p{Punct}+");
        for(String word : words){
            if(isDigit(word))
                list.add(word);
        }
        return list;
    }

    //To match if the word is digit or not
    static boolean isDigit(String str){
        Pattern pattern = Pattern.compile("[0-9]+");
        //GPT suggested: (regex : "\\d+")
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
