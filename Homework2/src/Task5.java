import java.util.Scanner;

/**
 * Создать и проинициализировать массив из 20 элементов.
 * Ввести с клавиатуры число n и найти, есть ли оно в массиве, и, если есть, вывести его индекс на экран. Использовать линейный поиск
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = new int [20];
        array[0] = 3;
        array[1] = 6;
        array[2] = 87;
        array[3] = 45;
        array[4] = 76;
        array[5] = 23;
        array[6] = 11;
        array[7] = 1;
        array[8] = 8;
        array[9] = 900;
        array[10] = 34;
        array[11] = 123;
        array[12] = 32;
        array[13] = 9;
        array[14] = 7;
        array[15] = 61;
        array[16] = 86;
        array[17] = 79;
        array[18] = 40;
        array[19] = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите число: ");
        int num = scan.nextInt();

        int index = -1;

        for (int i = 0; i<array.length;i++){
            if (array[i] == num){
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Число в массиве есть, под индексом " + index);
        }else {
            System.out.println("Числа в массиве нет");
        }
    }
}
