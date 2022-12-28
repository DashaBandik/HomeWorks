package by.belhard;
/**
 * Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них
 */

public class Task3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        int num3 = 2;

        if (num1 > num3 && num2 > num3) {
            System.out.println(num1 + num2);
        } else if (num2 > num1 && num3 > num1) {
            System.out.println(num2 + num3);
        } else {
            System.out.println(num1 + num3);
        }
    }
}
