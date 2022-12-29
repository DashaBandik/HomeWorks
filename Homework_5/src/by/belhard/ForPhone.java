package by.belhard;

import java.util.Scanner;

public class ForPhone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phone[] phones = new Phone[3];

        for (int i = 0; i < phones.length; i++) {
            if (phones[i] == null) {
                System.out.println("Создайте экземпляр " + (i + 1) + " телефона: ");
                Phone phone = new Phone();
                System.out.print("Номер: ");
                phone.number = scan.nextLine();
                System.out.print("Модель: ");
                phone.model = scan.nextLine();
                System.out.print("Вес: ");
                phone.weight = scan.nextDouble();
                scan.nextLine();
                phones[i] = phone;
            }
        }
        for (Phone phone : phones) {
            System.out.println(phone.getPhone());
            phone.receiveCall("Наташа");
            System.out.println(phone.getNumber());
            phone.receiveCall("Даша", "9429929");
            phone.sendMessage(1, 4444444, 454563);


        }

    }
}