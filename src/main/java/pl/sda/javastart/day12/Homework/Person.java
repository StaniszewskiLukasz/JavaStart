package pl.sda.javastart.day12.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    private String surname;
    private List<Feed>listOfAvailableFeed = new ArrayList<>();
    public List<Animals> listOfPets = new ArrayList<>();


    public void feedingAnimal(){
        for (Animals pet : listOfPets) {//ta metoda wyszukuje na liście jedzenia właściciela jedzenie jakie lubi zwierze
            listOfAvailableFeed.stream()
                    .filter(pet::isMyFavouriteFeed)//
                    .findAny()
                    .ifPresent(pet::feedAnimal);//jeśli coś znajdzie ta metody to wykona zadanie jak nic nie znajdzie pominię się
                    //ta linia powyżej jest już Optionalem a nie streamem

        }
    }

    public List<Animals> listOfHungryAnimals(){ // metoda która zwraca listę głodnych zwierząt
        return listOfPets.stream()
                .filter(Animals::isHungry)
                .collect(Collectors.toList());
    }

    public Person(String surname, List<Feed> listOfAvailableFeed, List<Animals> listOfAnimals) {
        this.surname = surname;
        this.listOfAvailableFeed = listOfAvailableFeed;
        this.listOfPets = listOfAnimals;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Feed> getListOfAvailableFeed() {
        return listOfAvailableFeed;
    }

    public void setListOfAvailableFeed(List<Feed> listOfAvailableFeed) {
        this.listOfAvailableFeed = listOfAvailableFeed;
    }

    public List<Animals> getListOfPets() {
        return listOfPets;
    }

    public void setListOfPets(List<Animals> listOfPets) {
        this.listOfPets = listOfPets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) &&
                Objects.equals(listOfAvailableFeed, person.listOfAvailableFeed) &&
                Objects.equals(listOfPets, person.listOfPets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, listOfAvailableFeed, listOfPets);
    }
}
