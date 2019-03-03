package pl.sda.javastart.day6.Homework.Animals;

public class Pet extends Animal implements OwnerHolder {

    Human owner;

    @Override
    public String introduceYourself() {
        return null;
    }

    public Pet(  String name, Double weight, Integer age, Human owner) {
        super( name,weight, age);
        this.owner = owner;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public String getOwnerName() {
        return null;
    }
}
