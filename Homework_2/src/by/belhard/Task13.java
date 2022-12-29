package by.belhard;
/**
 *Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
 * Не используя операции умножения и деления, найти длину незанятой части отрезка A.
 */
public class Task13 {
    public static void main(String[] args) {
        int a = 21;
        int b = 5;
        int amount = 0;

        for (int i = b; i<=a;i+=b){
            amount = amount + b;
        }
        System.out.println ("Длина незанятой части отрезка А: "+ (a-amount));
    }
}
