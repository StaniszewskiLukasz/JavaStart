package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOP3 {

    public static void main(String[] args) {

        Worker firstWorker = new Worker("Adam", "Nowak", 123, 50, BigDecimal.valueOf(1500));
        Student firstStudent = new Student("Kasia", "Kowalska", 126, 25, 1456, BigDecimal.valueOf(500));
        Pensioner firstPensioner = new Pensioner("Janusz", "Kwiatkowski", 126, 85, BigDecimal.valueOf(900));
        /*Person secondWorker = new Worker();*/  //tak tez można stwrzyć obiekt wskazując klasę nadrzędną, tylko wtedy utracimy w możliwość wywołania metody z klasy Worker pozostaną nam metody z Person
        //ctrl + P możemy na powyższych obiektach podglądać jakie musimy wpisać wartości w każdym obiekcie

        Person[] people = new Person[]{firstPensioner, firstStudent, firstWorker}; // można tak stworzylismy tablicę
        Object[] objects = new Object[]{firstPensioner, firstStudent, firstWorker}; // można tak stworzylismy tablicę poprzez klasę Object
        List<Person> peopleList = new ArrayList<>(); // ta lista jest pusta ale nas tonie martwi bo mozemy ją rozszerzyć

        peopleList.add(firstPensioner); // są do tego biblioteki by zrobić to w jednej lini
        peopleList.add(firstStudent);
        peopleList.add(firstWorker);
        PrintDataLegacyMode(firstWorker, firstStudent, firstPensioner);
        printData(peopleList);

         List<NameHolder> nameHolders = new ArrayList<>();
         nameHolders.add(firstWorker);
//         nameHolders.add(firstPensioner); - nie implementuje tego interface więc nie można dodać pensionera do tej listy
         nameHolders.add(firstStudent);
        printNames(nameHolders);
    }

    private static void printNames(List<NameHolder> nameHolders) { // ta metoda drukuje nam imiona z listy NameHolders
        for (NameHolder value: nameHolders){
            System.out.println(value.showYourName());
        }
    }

    private static void PrintDataLegacyMode(Worker firstWorker, Student firstStudent, Pensioner firstPensioner) {
        //to jest po staremu
        System.out.println(firstWorker.showIncome());
        System.out.println(firstPensioner.showIncome());
        System.out.println(firstStudent.showIncome());
        firstWorker.introductionInner();
        firstPensioner.introductionInner();
        firstStudent.introductionInner();

    }

    private static void printData(List<Person> peopleInfo) {
        System.out.println("Tutaj nie robimy kilka razy SOUT jak wyżej tylko robimy pętle");
        for (Person value : peopleInfo) {
            System.out.println(value.showIncome()); // ta metoda nie wymaga instanceof bo ta metoda jest w personie i ale sięga do podklas
            if (value instanceof Worker) { // instanceof pyta kim jesteś z jakiej podklasy pochodzisz warunek mówi że jeśli obiekt z listy jest Workerem to:
                ((Worker) value).introductionInner(); // przypisujemy ten obiekt ukryty pod value klasie Worker czyli potwierdzamy warunek powyższy
            }else if(value instanceof Student){
                ((Student)value).introductionInner();
            }else if(value instanceof Pensioner){
                ((Pensioner)value).introductionInner();
            }
        }


    }
}
