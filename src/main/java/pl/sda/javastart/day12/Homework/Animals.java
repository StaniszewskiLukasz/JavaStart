package pl.sda.javastart.day12.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animals {
    private String species;
    private String name;
    private Person owner;
    private Feed feed;
    private List<Feed> favouriteFeed = new ArrayList<>();
    private List<Person> listOfOwners = new ArrayList<>();

    public Animals(String species, String name, Person owner, List<Feed> favouriteFeed) {
        this.species = species;
        this.name = name;
        this.owner = owner;
        this.favouriteFeed = favouriteFeed;

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Feed> getFavouriteFeed() {
        return favouriteFeed;
    }

    public void setFavouriteFeed(List<Feed> favouriteFeed) {
        this.favouriteFeed = favouriteFeed;
    }


    public void feedAnimal(Feed feed){ // metoda która powie co zwierzak chce zjeść z tego co ma właściciel
        this.feed = feed;
    }

    public boolean isHungry(){
        return feed == null; //zamisat if i else to jest lepsze
    }

    public boolean isMyFavouriteFeed(Feed feed){
      //  return favouriteFeed.contains(feed); tak jak tu lub streamem poniżej
       return favouriteFeed.stream()
                .anyMatch(feed::equals);
//                .anyMatch(e->e.equals(feed) // tak i tak jak powyżej jest ok ale powyże krócej

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(species, animals.species) &&
                Objects.equals(name, animals.name) &&
                Objects.equals(owner, animals.owner) &&
                Objects.equals(favouriteFeed, animals.favouriteFeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, name, owner, favouriteFeed);
    }
}
