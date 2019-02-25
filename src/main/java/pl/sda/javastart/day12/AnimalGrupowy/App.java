package pl.sda.javastart.day12.AnimalGrupowy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    private final static Random RANDOM = new Random();

    private List<Person> personList = new ArrayList<>();
    private List<Food> createdfood = new ArrayList<>();

  /*  public void start() {
        populateFood(50);

        IntStream.range(0, 5)
                .mapToObj(i -> "123456798" + i)
                .map(this::createPerson)
                .forEach(personList::add);

        personList.forEach(Person::feed);

        personList.stream()
                .map(Person::listOfHungryAnimals)
                .flatMap(List::stream)
                .map(Animal::getName)
                .forEach(System.out::println);
    }*/

    private Person createPerson(String pesel) {
        int length = 5;
        List<Food> availableFoods = returnRandomFoods(length);
        List<Animal> animals = returnAnimals(pesel);
        return new Person(pesel, availableFoods, animals);
    }

    public List<Animal> returnAnimals(String owner) {
        int size = RANDOM.nextInt(5);
        return IntStream.range(0, size)
                .mapToObj(e->"Animal " + e + " " + owner)
                .map(this::createAnimal)
                .collect(Collectors.toList());
    }

    private Animal createAnimal(String name) {
        List<Food> favAnimalFoods = returnRandomFoods(8);
        return new Animal(name, favAnimalFoods);
    }

    public List<Food> returnRandomFoods(int length) {
       int size = RANDOM.nextInt(createdfood.size());
       return IntStream.range(0,size)
                .map(e-> RANDOM.nextInt(createdfood.size()))
                .mapToObj(createdfood::get)
                .collect(Collectors.toList());
    }

  /*  public void populateFood(int size) {
        for (int i = 0; i < size; i++) {
            Food food = new Food("Food " + i);
            f.add(food);
//            f.add(new Food("Food " + i));
        }
    }*/

}

