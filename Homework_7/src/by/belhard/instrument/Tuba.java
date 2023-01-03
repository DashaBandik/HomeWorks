package by.belhard.instrument;

public class Tuba implements Instrument {
    private int diameter;

    Tuba() {
    }

    Tuba(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет туба диаметром " + getDiameter());
    }
}
