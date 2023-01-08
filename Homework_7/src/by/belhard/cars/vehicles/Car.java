package by.belhard.cars.vehicles;

import by.belhard.cars.details.Engine;
import by.belhard.cars.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver someDriver;
    private Engine someEngine;

    public Engine getSomeEngine() {
        return someEngine;
    }

    public void setSomeEngine(Engine someEngine) {
        this.someEngine = someEngine;
    }


    public Driver getSomeDriver() {
        return someDriver;
    }

    public void setSomeDriver(Driver someDriver) {
        this.someDriver = someDriver;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Автомобиль: " + getBrand() + "\n" +
                "Класс: " + getCarClass() + "\n" +
                "Вес автомобиля: " + getWeight() + "\n" + someEngine.toString() + "\n" + someDriver.toString();


    }


}
