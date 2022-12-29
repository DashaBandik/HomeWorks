package by.belhard;

public class Phone {
    String number;
    String model;
    double weight;

    Phone() {

    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;

    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    String getPhone() {
        String getPhone = "Номер " + number + ", модель - " + model + ", вес телефона - " + weight;
        return getPhone;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(int... numbers) {
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
