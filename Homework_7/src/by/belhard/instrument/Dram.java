package by.belhard.instrument;

public class Dram implements Instrument {
    private int size;

    Dram() {
    }

    Dram(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны с размером " + getSize());
    }
}
