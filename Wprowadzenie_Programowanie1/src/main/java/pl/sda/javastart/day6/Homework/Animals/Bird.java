package pl.sda.javastart.day6.Homework.Animals;

public class Bird extends Pet{

    public void singWhenFlying(){
        System.out.println("Jak latam to nie śpiewam, bo łapię lewe powietrze");
    }

    Bird(String name, Double weight, Integer age, Human owner) {
        super(name, weight, age, owner);
    }

    @Override
    public String introduceYourself() {
        return "Jestem ptakiem";
    }

    @Override
    public String toString() {
        return "Bird{" + "owner=" + owner + '}';
    }
}
