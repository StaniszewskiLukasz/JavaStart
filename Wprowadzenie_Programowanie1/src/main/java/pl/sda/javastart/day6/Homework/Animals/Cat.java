package pl.sda.javastart.day6.Homework.Animals;

public class Cat extends Pet {
    public Cat(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    public void drinkMilk(){
        System.out.println("Pije mleko. Dawaj więcej.");
    }

    @Override
    public String introduceYourself() {
        return "Jestem kotem";
    }

    @Override
    public String toString() {
        return "Cat{" + "owner=" + owner + '}';
    }
}
