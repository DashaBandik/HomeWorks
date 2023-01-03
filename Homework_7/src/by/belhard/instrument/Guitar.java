package by.belhard.instrument;

public class Guitar implements Instrument {
    private int amountString;

    Guitar() {
    }

    Guitar(int amountString) {
        this.amountString = amountString;
    }

    public int getAmountString() {
        return amountString;
    }

    public void setAmountString(int amountString) {
        this.amountString = amountString;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара c " + getAmountString() + " струнами");

    }
}
