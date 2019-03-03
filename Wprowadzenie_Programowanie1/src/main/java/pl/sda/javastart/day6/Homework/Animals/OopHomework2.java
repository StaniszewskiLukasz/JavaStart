package pl.sda.javastart.day6.Homework.Animals;

import java.util.ArrayList;
import java.util.List;

public class OopHomework2 {
    public static void main(String[] args) {

        Human human1 = new Human("Władek Kowalski", (double) 90, 45);
        Human human2 = new Human("Katarzyna Krowa", (double) 55, 32);
        Human human3 = new Human("Marzena Nowak", (double) 45, 62);
        Dog dog = new Dog("Azor", (double) 10, 5, human1);
        Cat cat = new Cat("Bolek", (double) 5, 9, human2);
        Bird bird = new Bird("Frunia", 0.2, 2, human3);

        animals();
        animalsInTable();
        secondAnimalsArray();

        List<OwnerHolder> nameHolders = new ArrayList<>();
        nameHolders.add(human3);
        nameHolders.add(human1);
        printNames(nameHolders);
        objectsOwners();


    }

    private static void animals() {

        Human human1 = new Human("Władek Kowalski", (double) 90, 45);
        Human human2 = new Human("Katarzyna Krowa", (double) 55, 32);
        Human human3 = new Human("Marzena Nowak", (double) 45, 62);
        Dog dog = new Dog("Azor", (double) 10, 5, human1);
        Cat cat = new Cat("Bolek", (double) 5, 9, human2);
        Bird bird = new Bird("Frunia", 0.2, 2, human3);

        System.out.println(dog.toString());
        System.out.println();
        System.out.println(bird.toString());
        System.out.println();
        System.out.println(cat.toString());
    }

    private static void animalsInTable() {
        Animal homo2_0 = new Human("Tomasz Broda", 85.6, 38);
        Animal dog = new Dog("Foks", (double) 15, 5, (Human) homo2_0);
        Animal cat = new Cat("Kicia", 7.5, 6, (Human) homo2_0);
        Animal bird = new Bird("Dżetek", 0.6, 1, (Human) homo2_0);

        List<Animal> tableOfAnimals = new ArrayList<>();
        tableOfAnimals.add(homo2_0);
        tableOfAnimals.add(dog);
        tableOfAnimals.add(cat);
        tableOfAnimals.add(bird);

        for (Animal oneAnimal : tableOfAnimals) {
            System.out.println(oneAnimal.introduceYourself());
        }
    }

    private static void secondAnimalsArray() {
        Animal homo2_0 = new Human("Tomasz Broda", 85.6, 38);
        Animal dog = new Dog("Foks", (double) 15, 5, (Human) homo2_0);
        Animal cat = new Cat("Kicia", 7.5, 6, (Human) homo2_0);
        Animal bird = new Bird("Dżetek", 0.6, 1, (Human) homo2_0);

        List<Animal> tableOfAnimals = new ArrayList<>();
        tableOfAnimals.add(homo2_0);
        tableOfAnimals.add(dog);
        tableOfAnimals.add(cat);
        tableOfAnimals.add(bird);

        for (Animal oneAnimal : tableOfAnimals) {
            if (oneAnimal instanceof Cat) {
                ((Cat) oneAnimal).drinkMilk();
            } else if (oneAnimal instanceof Dog) {
                ((Dog) oneAnimal).biteBone();
            } else if (oneAnimal instanceof Bird) {
                ((Bird) oneAnimal).singWhenFlying();
            } else if (oneAnimal instanceof Human) {
                ((Human) oneAnimal).cogitoErgoSum();
            }
        }
    }

    private static void printNames(List<OwnerHolder> nameHolders) { // ta metoda drukuje nam imiona z listy NameHolders
        for (OwnerHolder value : nameHolders) {
            System.out.println(value.getOwnerName());
        }
    }

    private static void objectsOwners() {
        Human human14 = new Human("Janusz Dupa", (double) 88, 41);
        OwnerHolder dogOwner = new Dog("Burek", 12.6, 16, human14);

        List<OwnerHolder> tableOfOwners = new ArrayList<>();
        tableOfOwners.add(dogOwner);
        for (Object o : tableOfOwners) {
            if (o instanceof Dog) {
                ((Dog) o).getOwnerName();
            }
        }
    }
}
