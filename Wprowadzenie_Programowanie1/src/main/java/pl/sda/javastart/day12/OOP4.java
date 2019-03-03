package pl.sda.javastart.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream; // jeśli tu na końcu damy gwiazdkę to podobno importujemy tutaj cały pakiet i wszystkie metody z java.util

public class OOP4 {

    private final static Random RANDOM = new Random();
    private List<Person> p = new ArrayList<>();
    private List<Food> f = new ArrayList<>();




public static void main(String[] args) {



    }



    public void start() {
        foodCreate();
        animalCreate();
        personCreate();
    }

    private void personCreate() {
        for (int i = 0; i < 5; i++) {
            List<Food> personMenu = new ArrayList<>(); // tworzymy listę do której wrzucimy menu każdego człowieka
            for (int j = 0; j <5 ; j++) {
                personMenu.add(f.get(RANDOM.nextInt(f.size()))); // f. size określa żebyśmy randoomowo losowali z listy f iżebyśmy nie przekoczyli jej zakresu
            }
            Person person = new Person("Person"+1, null,personMenu);
            p.add(person);
        }
    }

    private void foodCreate() {
        for (int i = 0; i < 50; i++) {
            Food food = new Food("Food" + 1);
            f.add(food);
        }
    }

    private void animalCreate() {
        for (int i = 0; i <7 ; i++) {
           List<Food> animalFavouriteFood = new ArrayList<>();
            for (int j = 0; j <5 ; j++) {
                animalFavouriteFood.add(f.get(RANDOM.nextInt(f.size())));
            }
            Animal animal = new Animal("Animal" +i, animalFavouriteFood);
        }
    }

    public List<Food> returnRandomFood(int length){
        int size = RANDOM.nextInt(length);
        IntStream.range(0,size)
                .map(i -> RANDOM.nextInt(f.size()))
                .mapToObj(f::get)
                .collect(Collectors.toList());


return null; //fixme
    }


}
