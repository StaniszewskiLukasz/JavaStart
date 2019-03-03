package pl.sda.javastart.day8;

public class GenericFruitBox<T extends Fruit> {//przykład generyczności, zwyczajowo jedna literka T lub R lub E // to extendes Fruit oznacza że nasze T( ta zmienna dziedziczy po klasie Fruit) to tylko te zmienne które są w owocu
    private T fruit; //

    public GenericFruitBox(T fruit) {//konstruktor
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }
}
