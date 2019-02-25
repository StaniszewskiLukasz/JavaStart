package pl.sda.javastart.day6.Homework.Animals;

public class Dog extends Pet {
    public Dog(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    @Override
    public String getOwnerName() {
        return super.getOwnerName();
    }

    public void biteBone(){
        System.out.println("Gryzę kość");
    }

    @Override
    public String introduceYourself() {
        return "Jestem psem";
    }

    @Override
    public String toString() {
        return "Dog{" + "owner=" + owner + '}';
    }
}
