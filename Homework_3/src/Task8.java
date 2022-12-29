import java.util.Scanner;

/**
 * Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
 * После чего в консоль выводится количество вхождений символа в строку. Например, строка «Java 11», символ «a», результат: 2
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String someString = scan.nextLine();

        System.out.println("Введите символ: ");
        char someChar = scan.next().charAt(0);

        char[] array = someString.toCharArray();

        int amountChar = 0;
        int index = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == someChar) {
                amountChar++;
            }
        }

        System.out.println(amountChar);
    }
}
