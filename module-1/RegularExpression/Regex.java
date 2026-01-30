/* 
Regular Expression:
A regular expression (regex or regexp) is a sequence of characters that forms a search pattern.
It can be used for string searching and manipulation.
Common regex components:
. : Matches any single character except newline.
* : Matches zero or more occurrences of the preceding element.
+ : Matches one or more occurrences of the preceding element.

group() : Returns the matched subsequence.
start() : Returns the starting index of the matched subsequence.
end() : Returns the ending index of the matched subsequence.

*/


import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String text = "The rain in Spain stays mainly in the plain.";
        Pattern pattern = Pattern.compile("ain");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }
}
