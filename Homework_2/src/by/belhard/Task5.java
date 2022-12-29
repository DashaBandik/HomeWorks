package by.belhard;
/**
 * Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
 * Дан номер действия N (целое число в диапазоне 1–4) и вещественные
 * числа A и B (В не равно 0). Выполнить над числами указанное действие и вывести результат.
 */
public class Task5 {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 5;
        int action = 3;

        if (action == 1) {
            System.out.println(num1 + num2);
        } else if (action == 2) {
            System.out.println(num1 - num2);
        } else if (action == 3) {
            System.out.println(num1 * num2);
        } else if (action==4) {
            System.out.println(num1 / num2);
        }
    }
}