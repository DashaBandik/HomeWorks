package by.belhard;

/**
 * Дано целое число N (> 0).
 * С помощью операций деления нацело и взятия остатка от деления:
 * определить имеется ли в записи числа N цифра «2»; найти число,полученное при прочтении числа N справа налево; н
 * айти количество и сумму его цифр. Использовать можно любое количество циклов, но чем меньше, тем лучше
 */

public class Task15 {
    public static void main(String[] args) {
        int num = 1234;
        String a = "Цифра 2 в введенном числе ЕСТЬ";
        String b = "Цифры 2 в введенном числе НЕТ";
        boolean have2 = false;
        int amount = 0;
        int sum = 0 ;

        for (int i = num; i != 0; i/=10) {
            int x = i%10;
            System.out.print(x);
            amount++;
            sum=sum+x;

            if (x == 2){
                have2 = true;
            }

        }

        System.out.println();
        System.out.println("Количество цифр: "+amount);
        System.out.println("Сумма цифр равна: "+sum);

        if (have2 == true){
            System.out.println(a);
        }else {
            System.out.println(b);
        }


    }
}
