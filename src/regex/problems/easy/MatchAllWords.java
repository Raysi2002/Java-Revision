//1.	Match all words that start with ‘a’:
//        •	Input: "apple banana apricot orange"
//        •	Output: ["apple", "apricot"]


package regex.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchAllWords {
    public static void main(String[] args) {
        String str =  "apple banana apricot orange";
        List<String> matchedWords = new ArrayList<>();
        String[] words = str.split(" ");
        for(String word : words){
            if(matches(word))
                matchedWords.add(word);
        }
        System.out.println(matchedWords);
    }

    public static boolean matches(String str){
        Pattern pattern = Pattern.compile("^a+[a-z]*");

        //Suggested by chatGPT
        //For more robust query
//        --------Works better in this case  str :  "apple Apple banana apricot orange";
//        Pattern pattern = Pattern.compile("(?i)^a+[a-z]*");

        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
