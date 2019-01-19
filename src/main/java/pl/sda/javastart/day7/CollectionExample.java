package pl.sda.javastart.day7;


import pl.sda.javastart.day6.Pensioner;
import pl.sda.javastart.day6.Person;
import pl.sda.javastart.day6.Student;
import pl.sda.javastart.day6.Worker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class CollectionExample {
    public static final Student student1 = new Student("Lukas", "Woj", 565415, 25, 56856, BigDecimal.valueOf(556));
    public static final Student student2 = new Student("Wojtek", "Koj", 564818, 15, 5686, BigDecimal.valueOf(486));
    public static final Worker worker1 = new Worker("Mariusz", "Jarecki", 156458, 45, BigDecimal.valueOf(486));
    public static final Pensioner pensioner1 = new Pensioner("Jurek", "Dupa",5467,85,BigDecimal.valueOf(156));

    public static void main(String[] args) {
        treeSetExample();
        arrayListExample();
    }

    private static void arrayListExample() {
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensioner1);

        System.out.println(personList.contains(pensioner1));
        personList.remove(pensioner1);
        System.out.println(personList.contains(pensioner1));

        System.out.println(personList);
    }

    private static void treeSetExample() {
        TreeSet<Person> tSet = new TreeSet<>(); // to jest treeSet Personów on sam je sobie je sortuje, on nie wie po czym ale my mu to wskazujemy implementując do Persona metode Comparable

        tSet.add(student2);
        tSet.add(student1);
        System.out.println(tSet.toString());

        for (Person x : tSet) {
            System.out.println(x.getFirstName());
        }

        tSet.stream().map(e->e.getFirstName()).forEach(e-> System.out.println(e));
    }




}
