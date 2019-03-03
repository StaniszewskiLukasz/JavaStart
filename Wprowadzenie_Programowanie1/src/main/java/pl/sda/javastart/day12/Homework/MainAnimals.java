package pl.sda.javastart.day12.Homework;

import javafx.scene.input.Dragboard;
import pl.sda.javastart.day12.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainAnimals {


    private static final Random DRAW = new Random();
    private static List<String> listOfSpecies = new ArrayList<>();
    private static List<String> listOfSurnames = new ArrayList<>();
    private static List<String> listOfAnimalNames = new ArrayList<>();
    private static List<Person> listOfPersons = new ArrayList<>();
    private static List<Animals> listOfAnimals = new ArrayList<>();
    private static List<Feed> listOfFeed = new ArrayList<>();


    public static void main(String[] args) {

        start();
    }

    private static void start() { // zbiór wszystkich metod dla lepszej czytelności

        createSurnames();

        createSpecies();

        createAnimalNames();

        createFeed(50);

        drawFeed(4);

        createPerson(5);

//        setOwner();


//        testy powyższych metod  ================================================================
        System.out.println("NAZWISKA");
        System.out.println();
        testOfSurnames();
        System.out.println();
        System.out.println("GATUNKI");
        System.out.println();
        testOfSpecies();
        System.out.println();
        System.out.println("KARMA");
        System.out.println();
        testOfFeed();
        System.out.println();
        System.out.println("LUDZIE");
        System.out.println();
        testOfPersons();
        System.out.println();
        System.out.println("Zwierzęta");
        System.out.println();
        testOfAnimals();
        System.out.println();

        listOfPersons.forEach(Person::feedingAnimal);//nakarmiliśmy zwierzaki podobno
        listOfPersons.stream()
                .map(Person::listOfHungryAnimals)
                .flatMap(List::stream)//operowaniem streamem na listach jest głupie nieefektywne, dlatego spłaszczamy je
                .map(Animals::getName)
                .forEach(System.out::println);
    }


    private static void createSurnames() { //tworzę listę nazwisk żeby było z czego wybierać
        listOfSurnames.add("Kowalski");
        listOfSurnames.add("Nowak");
        listOfSurnames.add("Psikuta");
        listOfSurnames.add("Mickiewicz");
        listOfSurnames.add("Jeziorański");
        listOfSurnames.add("Krakowski");
    }

    private static void createAnimalNames() { //tworzę listę nazwisk żeby było z czego wybierać
        listOfAnimalNames.add("Tosiek");
        listOfAnimalNames.add("Reks");
        listOfAnimalNames.add("Jaszczur");
        listOfAnimalNames.add("Zoombie");
        listOfAnimalNames.add("Brutus");
        listOfAnimalNames.add("Zyzio");
    }

    private static void createSpecies() { //tworzę listę gatónków zwierząt żeby było z czego wybierać
        listOfSpecies.add("Fish");
        listOfSpecies.add("Cat");
        listOfSpecies.add("Dog");
        listOfSpecies.add("Mouse");
        listOfSpecies.add("Snake");
    }

    private static void createFeed(int amount) { //metoda tworzy ogólną póle dostępnego 'na rynku' jedzenia i jej ilość
        for (int i = 0; i < amount; i++) {
            Feed feed = new Feed("Feed" + i, 15);
            listOfFeed.add(feed);
        }
    }

    private static List<Feed> drawFeed(int amount) { //metoda losuję jedzenie dla zwierząt lub dla ludzi i jej ilość
        int feedKind = DRAW.nextInt(amount);
        List<Feed> feedList = new ArrayList<>();
        for (int i = 0; i < feedKind; i++) {
            int feedAmount = DRAW.nextInt(amount);
            Feed feed = new Feed("Feed" + i, feedAmount);
            feedList.add(feed);
        }
        return feedList;
    }

    private static void createPerson(int amount) { // tworzymy wskazaną liczbę osób, każda ma wylosowane karmy, nazwisko wylosowane
        for (int i = 0; i < amount; i++) {
            String surname = listOfSurnames.get(DRAW.nextInt(listOfSurnames.size()));
            Person person = new Person(surname, drawFeed(5), createAnimal(1));
            for (Animals animal : person.getListOfPets()) {
                animal.setOwner(person);
            }
            listOfPersons.add(person);
        }
    }

    private static List<Animals> createAnimal(int amount) { //metoda tworzy ogólną póle dostępnych 'na rynku' zwierząt domowych
        for (int i = 0; i < amount; i++) {
            String species = listOfSpecies.get(DRAW.nextInt(listOfSpecies.size()));
            String name = listOfAnimalNames.get(DRAW.nextInt(listOfAnimalNames.size()));
            Animals animal = new Animals(species, name, null, drawFeed(5));
            listOfAnimals.add(animal);
        }
        return listOfAnimals;
    }

    private static void setOwner() {
        for (int i = 0; i < listOfPersons.size(); i++) {
            Person owner = listOfPersons.get(i);
            listOfPersons.get(i).getListOfPets().get(i).setOwner(owner);
        }
    }
//    =================================================metody tetsowe==================================================

    private static void testOfSurnames() {
        for (String surname : listOfSurnames) {
            System.out.println(surname);
        }
    }

    private static void testOfSpecies() {
        for (String s : listOfSpecies) {
            System.out.println(s);
        }
    }

    private static void testOfFeed() {
        System.out.println("Lista jest pusta? " + listOfFeed.isEmpty());
        System.out.println("Liczba karm " + listOfFeed.size());
        for (Feed feed : listOfFeed) {
            System.out.print("Nazwa karmy: " + feed.getFeedName() + " " + feed.getKilogramsOfFeed() + "kg, " + " ");
        }
    }

    private static void testOfPersons() {
        System.out.println("Ilu jest ludzi? " + listOfPersons.size());
        for (Person person : listOfPersons) {
            System.out.println("Nazwisko: " + person.getSurname());
            System.out.println("Ile karmy ma dla zwierzaka: " + person.getListOfAvailableFeed().size());
        }
    }

    private static void testOfAnimals() {
        System.out.println("Ile jest zwierząt? " + listOfAnimals.size());
        for (Animals a : listOfAnimals) {
            System.out.println("Gatunek: " + a.getSpecies());
            System.out.println("Imie: " + a.getName());
//            System.out.println("Kto jest właścicielem: " + a.getOwner());
            System.out.println("Ile karmy ma do jedzenia: " + a.getFavouriteFeed().size());
        }
    }





















































  /*  private static void testAnimals() {
        System.out.println("Test animals");
        System.out.println();
        for (Animals animal : listOfAnimals) {
            System.out.println(animal.getName());
            System.out.println(animal.getSpecies());
            System.out.println(animal.getOwner());
            for (Feed feed : animal.getFavouriteFeed()) {
                System.out.println(feed.getFeedName());
                System.out.println(feed.getKilogramsOfFeed());
            }
        }
    }

    private static void testPersons() {
        System.out.println("Test ludzkości!!!");
        System.out.println();
        for (Person person : listOfPersons) {
            System.out.println("Jak się nazywa");
            System.out.println(person.getSurname());
            System.out.println("Co może dać zwierzakowi do jedzenia");
            System.out.println(person.getListOfAvailableFeed());//fixme
            for (Animals person1 : listOfPets) {
                System.out.println(person1.getName());
                System.out.println(person1.getSpecies());
            }
        }
    }
    private static void createAnimal() { //metoda tworzy ogólną póle dostępnych 'na rynku' zwierząt domowych
        for (int i = 0; i < 8; i++) {
            List<Feed> favouriteFeed = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                favouriteFeed.add(listOfFeed.get(DRAW.nextInt(listOfFeed.size())));
            }
            String species = listOfSpecies.get(DRAW.nextInt(listOfSpecies.size()));
            Animals animal = new Animals(species, "Name" + i, null,favouriteFeed);
            listOfAnimals.add(animal);
        }
    }

    private static void createPerson() { // tworzymy 5 osób, każda ma wylosowane 2 dostępne karmy, wylosowane 1 zwierze, nazwisko wylosowane
            for (int i = 0; i < 5; i++) {
                List<Feed>listOfAvailableFeed = new ArrayList<>();
                List<Animals> listOfPets = new ArrayList<>();
                listOfPets.add(listOfAnimals.get(DRAW.nextInt(listOfAnimals.size())));
                for (int j = 0; j < 2; j++) {
                    listOfAvailableFeed.add(listOfFeed.get(DRAW.nextInt(listOfFeed.size())));
                }
                String surname = listOfSurnames.get(DRAW.nextInt(listOfSurnames.size()));
                Person person = new Person(surname, listOfAvailableFeed, listOfPets);
                listOfPersons.add(person);
            }
        }

    protected void introduction(){
        System.out.println("Jestem zwierzęciem");
        for (Animals animal : listOfAnimals.get(animal)) {

        }
    }*/


}