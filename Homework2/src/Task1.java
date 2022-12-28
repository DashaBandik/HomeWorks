/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99],
 * выведите его на экран в строку. Определить и вывести на экран сообщение о том,
 * является ли массив строго возрастающей последовательностью
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int min = 10;
        int max = 99;

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) ((Math.random() * (max - min)) + min);
            System.out.print(randomNumber + " ");
            array[i] = randomNumber;
        }
        System.out.println(" ");
        boolean isArrayUpper = false;

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                isArrayUpper = false;
                break;
            } else {
                isArrayUpper = true;
            }
        }
        if (isArrayUpper == false) {
            System.out.println("Не является строго возрастающей последовательностю");
        }else {
            System.out.println("Является");
        }


    }
}