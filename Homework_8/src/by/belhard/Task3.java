package by.belhard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка 'ahb acb aeb aeeb adcb axeb'.
 * Напишите регулярное выражение, которое найдет строки ahb, acb, aeb по шаблону:
 * буква 'a', любой символ, буква 'b'.
 */

public class Task3 {
    public static void main(String[] args) {
        String text = "ahb acb aeb aeeb adcb axeb";
        String regEx = "a{1}.{1}b{1}";

        Pattern pattern = Pattern.compile(regEx);

        String[] array = text.split(" ");
        for (String str : array) {
            Matcher matcher = pattern.matcher(str);
            if(matcher.matches()){
                System.out.println("Эта строчка матчится с патерном " + str);
            }
        }




    }
}
