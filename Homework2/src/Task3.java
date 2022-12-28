import java.util.Scanner;

/**
 * Создайте массив из N случайных целых чисел из отрезка [A;B],
 * числа N, A и B вводятся с клавиатуры.
 * Определите какой элемент является в этом массиве максимальным и сообщите его индекс
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите значение А: ");
        int a = scan.nextInt();

        System.out.println("Введите значение B: ");
        int b = scan.nextInt();

        System.out.println("Введите размер массива N: ");
        int sizeArray = scan.nextInt();
        int[] array = new int[sizeArray];

        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) ((Math.random() * (b - a)) + a);
            array[i] = randomNumber;

            System.out.print(array[i]+ " ");

            if (array[i] > array[maxNum]) {
                maxNum =  i;
            }
        }

        System.out.println("\nИндекс максимального элемента в массиве = " + maxNum);
        System.out.println("Максимального элемент в массиве = " + array[maxNum]);
    }
}
