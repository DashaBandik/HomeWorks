package by.belhard;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Выбрать существующие даты между 1000 и 2012 годом. Секунды могут быть опущены.
 * В каждом месяце 30 дней.
 * То есть дата в определённом формате вводится с клавиатуры, после чего, с помощью регулярного выражения,
 * определяется, существует такая дата, или нет. Пример:
 * 2012/09/18 12:10 – существует
 * 2012/24/18 12:10 – не существует
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время и дату: ");
        String date = scan.nextLine();

        String dateRegEx = "(1[0-9]{3}|20[01][012])/(0[1-9]|1[0-2])/([0-2][1-9]|30)\s([01][0-9]|2[0-3]):([0-5][0-9])";
        Matcher matcher = Pattern.compile(dateRegEx).matcher(date);

        if(matcher.matches()){
            System.out.print("Дата существует ");
        }else {
            System.out.print("Даты не существует ");
        }

    }
}
