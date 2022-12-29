package by.belhard;

/**
 * Мастям игральных карт присвоены порядковые номера:
 * 1 — пики,
 * 2 — трефы,
 * 3 — бубны,
 * 4 — червы.
 * Достоинству карт, старших десятки, присвоены номера:
 * 11 — валет,
 * 12 — дама,
 * 13 — король,
 * 14 — туз.
 * Даны два целых числа:
 * N — достоинство (6 ≤ N ≤ 14)
 * и M — масть карты (1 ≤ M ≤ 4).
 * <p>
 * Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
 */

public class Task8 {
    public static void main(String[] args) {
        int m = 8;
        int n = 8;


            switch (m) {
                case 6:
                    System.out.print("Шестерка");
                    break;
                case 7:
                    System.out.print("Семерка");
                    break;
                case 8:
                    System.out.print("Восьмерка");
                    break;
                case 9:
                    System.out.print("Девятка");
                    break;
                case 10:
                    System.out.print("Десятка");
                    break;
                case 11:
                    System.out.print("Валет");
                    break;
                case 12:
                    System.out.print("Дама");
                    break;
                case 13:
                    System.out.print("Король");
                    break;
                case 14:
                    System.out.print("Туз");
                    break;
                default:
                    System.out.println("Такой катры нет");

        }
        if (n <= 4) {
            if (n == 1) {
                System.out.println(" пик");
            } else if (n == 2) {
                System.out.println(" треф");
            } else if (n == 3) {
                System.out.println(" бубен");
            } else if (n == 4) {
                System.out.println(" червей");
            }
            }else {
            System.out.println(" Такой масти не существует");
        }
    }
}
