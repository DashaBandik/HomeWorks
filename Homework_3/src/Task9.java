import java.util.Scanner;

/**
 * С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод. Далее с клавиатуры вводятся два символа (a и b),
 * после чего нужно вывести строку, в которой все символы a нужно заменить на символы b. Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку: ");
            String someString = scan.nextLine();

            if (someString.length() > 0) {
                System.out.println("Введите 1-й символ: ");
                char someChar1 = scan.next().charAt(0);

                System.out.println("Введите 2-й символ: ");
                char someChar2 = scan.next().charAt(0);

                char[] array = someString.toCharArray();

                int length = array.length;

                for (int i = 0; i < length; ++i) {

                    if (array[i] == (someChar1)) {
                        array[i] = someChar2;
                    }
                }

                for (int i = 0; i < length; ++i) {
                    System.out.print(array[i]);
                }
                break;
            } else {
                System.out.println("Строка пустая, повторите ввод");
            }
        }
    }
}
