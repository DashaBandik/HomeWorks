package by.belhard;
/**
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число, записанное в переменную n, чётным либо нечётным
 */

public class Task1 {
    public static void main(String[] args) {
        int n = 112;
        if (n % 2 == 0) {
            System.out.println("Число четное.");
        }
        else{
            System.out.println("Число нечетное.");
        }

    }
}