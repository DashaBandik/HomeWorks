package by.belhard;

public class Task1 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 56;

        StringBuilder text = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ").append(num1+num2);
        StringBuilder text2 = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ").append(num1-num2);
        StringBuilder text3 = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ").append(num1*num2);

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);

        text.replace(7, 8 , "равно");
        text2.replace(7, 8 , "равно");
        text3.replace(7, 8 , "равно");

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);





    }
}