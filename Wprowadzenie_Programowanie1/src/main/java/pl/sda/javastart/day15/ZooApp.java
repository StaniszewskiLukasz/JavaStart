package pl.sda.javastart.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooApp {
    public static List<Animal> animalList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMenu();
    }

    private static void welcomeMenu() {
        System.out.println("welcome to the jungle! we've got fun and games");
        System.out.println("1. show animals");
        System.out.println("2. add animals");
        System.out.println("3. remove animal");
        int choice = scanner.nextInt();
        if (choice == 1) {
            showAnimals();
            welcomeMenu();
        } else if (choice == 2) {
            populateAnimalList();
            welcomeMenu();
        } else if (choice == 3) {
            removeAnimal();
            welcomeMenu();
        } else {
            System.out.println("wrong choice");
        }
    }

    private static void showAnimals() {
        if (animalList.isEmpty()) {
            System.out.println("list is still empty! add something first");
        } else {
            for (Animal animal : animalList) {
                System.out.println(animal.introduceYourself());
            }
        }
    }

    public static void populateAnimalList() {
        Animal animal = null;
        System.out.println("which species?\n1. hamster\n2. dog\n3. cat");
        int choice = scanner.nextInt();
        if (choice == 1) {
            createAnimal(choice);
        } else if (choice == 2) {
            createAnimal(choice);
        } else if (choice == 3) {
            createAnimal(choice);
        } else {
            System.out.println("wrong choice");
        }


    }

    private static void createAnimal(int input) {
        Animal animal;
        System.out.println("give name: ");
        String name = scanner.next();
        System.out.println("give age: ");
        Integer age = scanner.nextInt();
        if (input == 1) {
            animal = new Hamster(name, age);
            animalList.add(animal);

        } else if (input == 2) {
            animal = new Dog(name, age);
            animalList.add(animal);

        } else if (input == 3) {
            animal = new Cat(name, age);
            animalList.add(animal);

        }
    }

    private static void removeAnimal() {
        System.out.println("Which animal you want to remove? Give a name.");
        String animalToRemove = scanner.next();
        boolean isExist = animalList.stream()
                .anyMatch(e -> e.getName().equals(animalToRemove));


        if (isExist) {
            animalList.removeIf(animal -> animal.getName().equals(animalToRemove));
        } else {
            System.out.println("We don't have this animal. Sorry");
        }
    }
}


