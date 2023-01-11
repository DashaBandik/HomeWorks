package by.belhard.animals;

public class Polyclinic {


    public static void makeNoise2 (Animal someAnimal){
        //проверка по рекомендации
        someAnimal.makeNoise();
    }
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
        rat.setName("Стерт Литл");
        rat.setAge(1);
        rat.makeNoise();

        makeNoise2(cat);
        makeNoise2(dog);
        makeNoise2(rat);
    }
}