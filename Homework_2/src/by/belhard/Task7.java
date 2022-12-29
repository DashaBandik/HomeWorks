package by.belhard;

/**
 * Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
 * Вывести знак Зодиака, соответствующий этой дате:
 * «Водолей» (20.1–18.2),
 * «Рыбы» (19.2–20.3),
 * «Овен» (21.3–19.4),
 * «Телец» (20.4–20.5),
 * «Близнецы» (21.5–21.6),
 * «Рак»(22.6-22.7),
 * «Лев» (23.7–22.8),
 * «Дева» (23.8–22.9),
 * «Весы» (23.9–22.10),
 * «Скорпион» (23.10–22.11),
 * «Стрелец» (23.11–21.12),
 * «Козерог» (22.12–19.1).
 */

public class Task7 {
    public static void main(String[] args) {
        int day = 12;
        int month = 9;

        if (day >= 20 && month == 1 || day <= 18 && month == 2) {
            System.out.println("Водолей");
        }
        if (day >= 19 && month == 2 || day <= 20 && month == 3) {
            System.out.println("Рыбы");
        }
        if (day >= 21 && month == 3 || day <= 19 && month == 4) {
            System.out.println("Овен");
        }
        if (day >= 20 && month == 4 || day <= 20 && month == 5) {
            System.out.println("Телец");
        }
        if (day >= 21 && month == 5 || day <= 21 && month == 6) {
            System.out.println("Близнецы");
        }
        if (day >= 22 && month == 6 || day <= 22 && month == 7) {
            System.out.println("Рак");
        }
        if (day >= 23 && month == 7 || day <= 22 && month == 8) {
            System.out.println("Лев");
        }
        if (day >= 23 && month == 8 || day <= 22 && month == 9) {
            System.out.println("Дева");
        }
        if (day >= 23 && month == 9 || day <= 22 && month == 10) {
            System.out.println("Весы");
        }
        if (day >= 23 && month == 10 || day <= 22 && month == 11) {
            System.out.println("Скорпион");
        }
        if (day >= 23 && month == 11 || day <= 21 && month == 12) {
            System.out.println("Стрелец");
        }
        if (day >= 22 && month == 12 || day <= 19 && month == 1) {
            System.out.println("Козерог");
        }

    }
}
