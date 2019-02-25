package pl.sda.javastart.day12;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String species;
    private List<Food> favouriteFood = new ArrayList<>();

    public Animal(String species, String owner, List<Food> favouriteFood) {
        this.species = species;
        this.favouriteFood = favouriteFood;
    }

    public Animal(String s, List<Food> animalFavouriteFood) {

    }

    public Animal(String name) {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<Food> getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(List<Food> favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
}
