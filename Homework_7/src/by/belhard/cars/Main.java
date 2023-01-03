package by.belhard.cars;

import by.belhard.cars.details.Engine;
import by.belhard.cars.professions.Driver;
import by.belhard.cars.vehicles.Car;
import by.belhard.cars.vehicles.Lorry;


public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setFullName("Даша");
        driver.setDrivingExperience(0);

        Driver driverSport = new Driver();
        driverSport.setFullName("Никита");
        driverSport.setDrivingExperience(1);

        Driver driverLorry = new Driver();
        driverLorry.setFullName("Валера");
        driverLorry.setDrivingExperience(10);

        Engine engine = new Engine();
        engine.setManufacturer("BMW");
        engine.setPower(122);

        Engine engineLorry = new Engine();
        engineLorry.setManufacturer("BMW");
        engineLorry.setPower(205);


        Car car = new Car();
        car.setCarClass("A-class");
        car.setBrand("Mini");
        car.setSomeDriver(driver);
        car.setWeight(617);
        car.setSomeEngine(engine);

        Lorry lorry = new Lorry();
        lorry.setLoadCapacity(100);
        lorry.setCarClass("N1");
        lorry.setBrand("Mersedec");
        lorry.setSomeDriver(driverLorry);
        lorry.setWeight(1000);
        lorry.setSomeEngine(engine);

        System.out.println(car);
        System.out.println(lorry);


    }

}
