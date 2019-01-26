package pl.sda.javastart.day7;


import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CollectionExample {
    public static final Student student1 = new Student("Lukas", "Woj", 565415, 25, 56856, BigDecimal.valueOf(556));
    public static final Student student2 = new Student("Wojtek", null, 564818, 15, 5686, BigDecimal.valueOf(486));
    public static final Worker worker1 = new Worker("Mariusz", "Jarecki", 156458, 45, BigDecimal.valueOf(486));
    public static final Pensioner pensioner1 = new Pensioner("Jurek", "Dupa ", 5467, 85, BigDecimal.valueOf(156));
    public static final Pensioner pensioner2 = new Pensioner("Grzegorz", "Dupa", 5467, 85, BigDecimal.valueOf(156));

    public static void main(String[] args) {


        treeSetExample();

        arrayListExample();

        hashSetExample();

        hashMapExample();

        namesStatisticMaps();

        //ten kod poniżej robi to samo co ta cała metoda poniżej namesStatisticMaps
        List<Person> personListForStream = populatePeopleList(); // odnaleźć skrót po którym wyciąga się zmienną
        Map<String,Long> resultMap = personListForStream.stream()
                .filter(e->e.getLastname()!=null)
                .map(e->e.getLastname().trim())//tu pobieramy nazwiska i sprawdza czy któreś jest nullem i trimuje ewentualnie
                .collect(groupingBy(e->e, counting()));// tu grupujemy po nazwiskach i zliczamy
        System.out.println(resultMap);

    }

    private static void namesStatisticMaps() {
        List<Person> personList = populatePeopleList(); // z metody która ma w sobie naszą listę tworzymy inną kolekcję
        Map<String, Integer> lastNameMap = new HashMap<>(); // stworzyliśmy mapę by umieszczać w niej wyniki
        for (Person x : personList) { // robimy pętle by dopisać nazwiska z naszej listy populate...do persno List i sprawdzić czy nazwiska się powtarzają
            String lastNameWithoutWhite;
            if(x.getLastname() == null) {
//                continue;to jest podejście nie biznesowe
                lastNameWithoutWhite = null;
            }else{
                lastNameWithoutWhite = x.getLastname().trim(); // to robimy by usunąć białe znaki
            }
            if (lastNameMap.containsKey(lastNameWithoutWhite)) { // tu sprawdzamy najpeirw czy mapa zawiera już nasze nazwisko w mapie
                int counter = lastNameMap.get(lastNameWithoutWhite);
                lastNameMap.replace(lastNameWithoutWhite, counter + 1);
            } else {
                lastNameMap.put(lastNameWithoutWhite, 1);
            }
        }
        System.out.println(lastNameMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personsMap = new HashMap<>();//put zawsze zamieni i ustawi wartość, replace zamieni tylko jesli coś tam będzie
        personsMap.put(student1.getIdentity(), student1);
        personsMap.put(student2.getIdentity(), student2);
        personsMap.put(worker1.getIdentity(), worker1);
        personsMap.put(pensioner1.getIdentity(), pensioner1);
        personsMap.put(pensioner2.getIdentity(), pensioner2);

        System.out.println(personsMap);
    }

    private static void hashSetExample() { // on też sam sortuje ale po hashCode a tam mamy ustawione sprawdzanie po peselu
//      Set<Person> setOfPersons = new LinkedHashSet<>(); // tutaj zostanie zachowana kolejność dodawania elementów do listy
        Set<Person> setOfPersons = new HashSet<>(); // tutaj ten set doda tylko to co nie istenieje jeszcze w set sprawdza biznesowo poprzez equals
        System.out.println(setOfPersons.add(student1));
        System.out.println(setOfPersons.add(worker1));
        System.out.println(setOfPersons.add(pensioner1));
        System.out.println(setOfPersons.add(pensioner2));
        System.out.println(setOfPersons.add(student2));
        System.out.println(setOfPersons.size());
        System.out.println(setOfPersons);
    }

    private static void arrayListExample() {
        List<Person> personList = populatePeopleList();

        System.out.println(personList.contains(pensioner1));
        personList.remove(pensioner1);
        System.out.println(personList.contains(pensioner1));

        System.out.println(personList);
    }

    private static List<Person> populatePeopleList() {
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner1);
        personList.add(pensioner2);
        return personList;
    }

    private static void treeSetExample() {
        Set<Person> tSet = new TreeSet<>(); // to jest treeSet Personów on sam je sobie je sortuje, on nie wie po czym ale my mu to wskazujemy implementując do Persona metode Comparable

        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet.toString());

        for (Person x : tSet) {
            System.out.println(x.getFirstName());
        }

        tSet.stream().map(e -> e.getFirstName()).forEach(e -> System.out.println(e));
    }


}
