import java.util.Scanner;

/**
 * Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
 * Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком» и выведите уже отсортированный массив
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение А: ");
        int a = scan.nextInt();

        System.out.println("Введите значение B: ");
        int b = scan.nextInt();

        System.out.println("Введите размер массива N: ");
        int sizeArray = scan.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) ((Math.random() * (b - a)) + a);
            array[i] = randomNumber;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxNum = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxNum;
                }
            }
        }

        for (int u : array){
            System.out.print(u + " ");
        }
    }
}
