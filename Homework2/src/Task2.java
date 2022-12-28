import java.util.Scanner;

/**
 * Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний диапазон значений и верхний.
 * После чего создать массив размером, который ввел пользователь и заполнить его случайными числами из диапазона, введенного пользователем.
 * Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница диапазона больше верхнего и т.д.)
 * попросить его ввести значение ещё раз и перезаписать старое значение новым. Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array;
        int max;
        int min;


        while (true) {
            System.out.println("Введите размер массива: ");
            int sizeMassive = scan.nextInt();

            if (sizeMassive > 0) {
                array = new int[sizeMassive];
            } else {
                continue;
            }

            System.out.println("Введите верхний диапазон значений:");
            max = scan.nextInt();
            System.out.println("Введите нижний диапазон значений: ");
            min = scan.nextInt();

            if (min >0 && max >0 && min<max) {
                for (int i = 0; i <= array.length - 1; i++) {
                    int randomNumber = (int) ((Math.random() * (max - min)) + min);
                    array[i] = randomNumber;
                    System.out.print(array[i]);
                }
                break;
            } else {
                System.out.println("Введите значение еще раз ");
            }
        }
    }
}