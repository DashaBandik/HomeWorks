package by.belhard;

/**
 * Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while
 */

public class Task9 {
    public static void main(String[] args) {
        int num = 1;
        int x = 5;
        while (num <=x){
            System.out.println("Task"+num);
            num++;
        }
    }
}
