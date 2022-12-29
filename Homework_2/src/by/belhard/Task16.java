package by.belhard;

/**
 * Начальный вклад в банке равен 1000 руб.
 * Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0<P< 25). По данному P определить,
 * через сколько месяцев размер вклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
 */

public class Task16 {
    public static void main(String[] args) {
        double deposit = 1000;
        int month = 5;
        double p = 3.1;
        int k = 0;


        for (int i = 1; i <= month; i++) {
            double percent = deposit * (p / 100);
            deposit = deposit + percent;
            if (deposit <= 1100) {
                k++;
            }
        }
        System.out.println("Итоговый размер вклада " + deposit);
        System.out.println("Размер вклада превысит 1100 руб через " + k + " мес.");

    }
}
