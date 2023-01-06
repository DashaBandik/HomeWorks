package by.belhard;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Создайте новое исключение и назовите его IncorrectInfoException, добавьте в него поля для возраста и ФИО.
 * Напишите программу, которая просит пользователя ввести ФИО через пробел и возраст.
 * Если Возраст больше 100 или меньше 0, то «бросать» IncorrectInfoException,
 * записывать в него данные пользователя и сообщение о том, что возраст некорректен.
 * Если ФИО длиннее 200 символов, или использовались символы пунктуации (.,!?& и тд),
 * то тоже бросать исключение и записывать в него сообщение о некорректности данных и сами данные. В обработке исключения выводить на экран трассированный стек
 */

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();

        System.out.println("Введите возраст: ");
        int age = scan.nextInt();

        String regEx = "[A-Za-zа-яА-я ]+";
        try {
            if (age > 100 || age < 0) {
                throw new IncorrectInfoException("Incorrect age", name, age);
            }

            if (name.length() > 200 || !Pattern.matches(regEx, name)) {
                throw new IncorrectInfoException("Incorrect name", name, age);
            }
        } catch (IncorrectInfoException exception) {
            exception.printStackTrace();
        }
    }
}
