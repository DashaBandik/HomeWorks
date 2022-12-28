package by.belhard;

/**
 * Дано целое число, лежащее в диапазоне 0–999.
 * Вывести строку-описание этого числа. Строку-описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.
 */

public class Task6 {
    public static void main(String[] args) {
        long number = 28;

        if (number > 0 && number < 10) {
            if (number % 2 == 0) {
                System.out.println("Однозначное четное число");
            } else {
                System.out.println("Однозначное нечетное число");
            }
        }
        if (number >= 10 && number < 100) {
            if (number % 2 == 0) {
                System.out.println("Двузначное четное число");
            } else {
                System.out.println("Двузначное нечетное число");
            }
        }
        if (number >= 100 && number < 1000) {
            if (number % 2 == 0) {
                System.out.println("Трехзначное четное число");
            } else {
                System.out.println("Трехзначное нечетное число");
            }
        }
    }
}


