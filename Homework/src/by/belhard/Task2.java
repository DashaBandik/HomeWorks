package by.belhard;
/**
 * Создать программу, в которой проинициализировать переменную типа int, после чего вывести на экран день недели,
 * соответствующий этому числу (1 – понедельник, 3 – среда и тд), если такого дня нет, вывести надпись, что такого дня нет.
 * Сделать реализацию через if-else и через switch
 */

public class Task2 {
    public static void main(String[] args) {
        int date = 3;

        if (date == 1) {
            System.out.println("Понедельник");
        } else if (date == 2) {
            System.out.println("Вторник");
        } else if (date == 3) {
            System.out.println("Среда");
        } else if (date == 4) {
            System.out.println("Четверг");
        } else if (date == 5) {
            System.out.println("Пятница");
        } else if (date == 6) {
            System.out.println("Суббота");
        } else if (date == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели не существует");
        }

        int numberOfWeek = 3;
        switch (numberOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This day of week no exist");
        }
    }
}