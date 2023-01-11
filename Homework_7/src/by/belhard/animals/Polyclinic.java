package by.belhard.animals;

public class Polyclinic {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мяусон");
        cat.setAge(5);
        cat.makeNoise();

        Dog dog = new Dog();
        dog.setName("Рекс");
        dog.setAge(10);
        dog.makeNoise();

        Rat rat = new Rat();
        rat.setName("Ева");
        rat.setAge(1);
        rat.makeNoise();
    }
}