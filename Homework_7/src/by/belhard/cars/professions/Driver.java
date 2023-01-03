package by.belhard.cars.professions;

public class Driver {
    public String fullName;
    public int drivingExperience;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    @Override
    public String toString(){
        return "Водитель " + fullName + "\n"+
                "Опыт вождения " + drivingExperience;
    }


}
