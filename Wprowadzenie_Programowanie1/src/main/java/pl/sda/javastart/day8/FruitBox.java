package pl.sda.javastart.day8;

public class FruitBox {
    private Fruit fruit;

    public FruitBox(Fruit fruit) { // konstruktor
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

}