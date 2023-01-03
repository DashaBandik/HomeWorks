package by.belhard.cars.details;

public class Engine {
    private double power;
    private String manufacturer;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Мощность двигателя: "+ power + "\n"+
                "Производитель: " + manufacturer;
    }
}
