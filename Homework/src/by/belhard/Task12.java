package by.belhard;

/**
 * Даны два целых числа A и B (A < B).
 * Вывести в порядке убывания все целые числа, расположенные между A и B (не включая числа A и B), а также количество N этих чисел.
 */
public class Task12 {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = 0;

        for (int i =b-1; i >a && i<=b ; i--){
            System.out.println(i);
            c++;
        }
        System.out.println("Количество чисел " + c); //второй вариант (a - b)-1
    }

}
