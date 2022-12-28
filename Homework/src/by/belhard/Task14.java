package by.belhard;

/**
 * Даны положительные числа A, B, C.
 * На прямоугольнике размера A × B размещено максимально возможное количество квадратов со стороной C (без наложений).
 * Найти количество квадратов, размещенных на прямоугольнике.
 */

public class Task14 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 1;

        int amount1 = 0;
        int amount2 = 0;

        for (int i = c; i <= a; i += c) {
            amount1++;
        }

        for (int g = c; g <= b; g += c) {
            amount2++;
        }
        System.out.println(amount1*amount2);
    }
}
