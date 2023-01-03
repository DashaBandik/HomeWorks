package by.belhard.instrument;

public class Main {
    public static void main(String[] args) {
        Instrument[] array = new Instrument[3];
        array[0] = new Guitar(5);
        array[1] = new Dram(10);
        array[2] = new Tuba(6);

        for (int i = 0; i < array.length; i++){
            array[i].play();
        }

    }
}
