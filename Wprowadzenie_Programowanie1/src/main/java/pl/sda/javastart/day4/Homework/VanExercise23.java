package pl.sda.javastart.day4.Homework;

public class VanExercise23 {
    private int weight;
    private String vanClass;
    private int numbersOfPassangers;
    private boolean meals;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setNumbersOfPassangers(int numbersOfPassangers) {
        this.numbersOfPassangers = numbersOfPassangers;
    }
    public int getNumbersOfPassangers() {
        return numbersOfPassangers;
    }

    public boolean isMeals() {
        return meals;
    }
    public void setMeals(boolean meals) {
        this.meals = meals;
    }

    public String getVanClass() {return vanClass; }

    public void setVanClass(String vanClass) { this.vanClass = vanClass;}

    @Override
    public String toString() {
        return super.toString();
    }
}
