package by.belhard;

/**
 * Реализовать подсчет факториала используя цикл for. Результат вывести на экран
 */

public class Task11 {
    public static void main(String[] args) {
        int result = 1;
        int factorial = 5;
       for (int i = 1; i <= factorial; i++){
           result = result*i;
       }
        System.out.println(result);

    }
}
