package by.belhard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        String text = "ab abab abab abababab abea";
        String regEx = "ab{1,}";
        Pattern pattern = Pattern.compile(regEx);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
