package by.belhard.animals;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Вы ввели некорректный возраст");
        }

    }

    public void makeNoise() {
    }


}
