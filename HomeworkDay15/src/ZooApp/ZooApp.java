package ZooApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooApp {

    private static List<Animal> animalList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greeting();
    }

    private static void greeting(){
        System.out.println("Witamy w fabryce zwierząt. Stworzymy ci nowe jeśli dotychczasowe zamęczyłeś na śmierć(wersja beta dla Ministra Szyszko).");
        System.out.println("Wybierz jedną z opcji:");
        System.out.println("1. Stwórz zwierze");
        System.out.println("2. Pokaż dostępne zwierzęta");
        System.out.println("3. Usuń zwierze, jeśli masz na nie uczulenie");
        System.out.println("4. Zakończ");
        Integer choice = scanner.nextInt();
        switch (choice){
            case 1:
                createAnimals();
                break;
            case 2:
                showAvailableAnimals();
                break;
            case 3:
                removeAnimal();
                break;

        }
    }

    private static void createAnimals(){
        System.out.println("Wybierz gatunek: \n1. Pies\n2. Kot\n3. Chomik");
        Integer choice = scanner.nextInt();
        switch (choice){
            case 1:
                givingName(choice);
                break;
            case 2:
                givingName(choice);
                break;
            case 3:
                givingName(choice);
                break;
            case 4:
                System.exit(0);
                default:
                System.out.println("Nie mamy takiego gatunku. Wybierz ponownie.");
        }
        greeting();
    }

    private static void givingName(int value){
        System.out.println("Jak ma mieć na imię?");
        String name = scanner.next();
        System.out.println("Ile mam mieć lat");
        Integer age = scanner.nextInt();
        switch (value){
            case 1:
                animalList.add(new Dog(name,age));
                break;
            case 2:
                animalList.add(new Cat(name,age));
                break;
            case 3:
                animalList.add(new Hamster(name,age));
                break;
        }
        greeting();
    }

    private static void showAvailableAnimals(){
        if(animalList.isEmpty()){
            System.out.println("Nie mamy zwierząt od ręki, musisz zapłacić to stworzymy. Dawaj hajs!!!");
        }else{
            for (Animal animal : animalList) {
                System.out.println(animal.presentAnimal());
            }
        }
        greeting();
    }

    private static void removeAnimal() {
        System.out.println("Jakie zwierze chcesz usunąć? Podaj jego imię.");
        String animalToRemove = scanner.next();
        boolean isExist = animalList.stream()
                .anyMatch(e -> e.getName().equals(animalToRemove));
        if (isExist) {
            animalList.removeIf(animal -> animal.getName().equals(animalToRemove));
        } else {
            System.out.println("Nie mamy zwierzęcia o takim imieniu. Przepraszamy.");
        }
        greeting();
    }
}





