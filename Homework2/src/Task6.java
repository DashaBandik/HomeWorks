import java.util.Scanner;

/**
 * Создайте массив из N случайных целых чисел из отрезка [A;B],
 * числа N, A и B вводятся с клавиатуры. Выведите массив на экран, после чего инвертируйте его и выведите уже инвертрованный массив
 */
public class Task6 {
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
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int j = 0; j<array.length/2; j++){
            int num = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1]=num;
        }// 57 47 40 8 46

        for (int i : array){
            System.out.print(i + " ");
        }
    }
}
