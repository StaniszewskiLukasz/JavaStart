package pl.sda.javastart.day12;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private String name;
    private List<Animal> listOfAnimals = new ArrayList<>();
    private List<Food> listOfAvailableFood = new ArrayList<>();

    public Person(String name, List<Animal> listOfAnimals, List<Food> listOfAvailableFood) {
        this.name = name;
        this.listOfAnimals = listOfAnimals;
        this.listOfAvailableFood = listOfAvailableFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(List<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public List<Food> getListOfAvailableFood() {
        return listOfAvailableFood;
    }

    public void setListOfAvailableFood(List<Food> listOfAvailableFood) {
        this.listOfAvailableFood = listOfAvailableFood;
    }
}
