package pl.sda.javastart.day8.Homework;


import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyCustomerMain {

    private static MyCustomer[] people = new MyCustomer[]{
            new MyCustomer("Anna", "Nowak   ", 33, "1200"),
            new MyCustomer("Beata", "Kowalska", 22, "1200"),
            new MyCustomer("Marek", " Nowak", 25, "1250"),
            new MyCustomer("Adam", "Twardowski", 33, "1200"),
            new MyCustomer("Monika  ", "Kos", 25, "2500"),
            new MyCustomer("Adam ", "Rudy", 45, "3333"),
            new MyCustomer("Marek", "Rudy", 15, 2210),
            new MyCustomer("Adam", "Madej", 15, 3333)
    };

    public static void main(String[] args) {
        changeTableToMap();
        System.out.println("To jest wydruk metody changeTableToMapWithStream ");
        System.out.println(changeTableToMapWithStream());
        System.out.println("To jest wydruk metody changeTableToMapWithSalary ");
        System.out.println(changeTableToMapWithSalary());
        System.out.println("To jest wydruk metody changeTableToMapWithSalaryWithStream ");
        System.out.println(changeTableToMapWithSalaryWithStream());


    }

    //METODA ZMIENIAJĄCA TABLICE W LISTĘ
    public static List<MyCustomer> changeTableToArray() { // dlaczego w nawiasie co metoda przyjmuje nie wpsiujemy tablicy???
        List<MyCustomer> myCustomers = new ArrayList<>();
        for (MyCustomer singleCustomer : people) {
            myCustomers.add(singleCustomer);
        }
        return myCustomers;
    }

    public static List<MyCustomer> changeTableToArrayWithStream() {
        return Arrays.stream(people).collect(Collectors.toList());
    }

    //METODA ZMIENIAJĄCA TABLICĘ W LISTĘ STRING Z IMIONAMI I NAZWISKAMI
    public static List<String> changeTableToStringList() {
        List<String> myCustomersNames = new ArrayList<>();
        for (MyCustomer singleCustmer : people) {
            myCustomersNames.add(singleCustmer.getFirstName() + " " + singleCustmer.getSurname() + ",");
        }
        System.out.println("Drukujemy listę nazwisk i imion klientów");
        System.out.println(myCustomersNames);
        return myCustomersNames;
    }

    public static List<String> changeTableToStringListWithStream() {
        return changeTableToArray().stream()
                .map(e -> e.getFirstName() + " " + e.getSurname())
                .collect(Collectors.toList());
    }


    // METODA ZMIENIAJĄCA TABLICĘ W MAPĘ Z NUMEREM ID IMIENIEM I NAZWISKIEM, KLUCZEM JEST ID
    public static Map<Integer, List<String>> changeTableToMap() {
        Map<Integer, List<String>> idAndNamesMyCustomers = new HashMap<>();

        for (MyCustomer singleCustomer : people) {
            ArrayList<String> innerList = new ArrayList<>();
            innerList.add("id " + singleCustomer.getId() + ", " + singleCustomer.getFirstName() + " " + singleCustomer.getSurname());
            idAndNamesMyCustomers.put(singleCustomer.getId(), innerList);
        }
        System.out.println(idAndNamesMyCustomers);
        System.out.println(idAndNamesMyCustomers.size());
        return idAndNamesMyCustomers;
    }

    public static Map<Integer, List<String>> changeTableToMapWithStream() {
        return changeTableToArray().stream()
                .collect(Collectors.groupingBy(e -> e.getId(), Collectors.mapping(e -> e.getId()+" id, " + e.getFirstName() + " " + e.getSurname(), Collectors.toList())));
    }


    //METODA ZMIENIAJĄCA TABLICĘ W MAPĘ KWOTA, IMIĘ I NAZWISKO TYCH OSÓB
    public static Map<BigDecimal, List<String>> changeTableToMapWithSalary() {
        Map<BigDecimal, List<String>> salaryMyCustomers = new HashMap<>();
        for (MyCustomer singleCustomer : people) {
            if (salaryMyCustomers.containsKey(singleCustomer.getSalary())) {
                List<String> innerList = salaryMyCustomers.get(singleCustomer.getSalary()); // dlaczego musi powstać ta lista wewnętrzna i dlaczego w else tworzymy listę a tu robimy to jako przypisanie
                innerList.add(singleCustomer.getFirstName() + singleCustomer.getSurname() + singleCustomer.getId());
            } else {
                List<String> innerList = new ArrayList<>();
                innerList.add(singleCustomer.getId() + "," + singleCustomer.getFirstName() + " " + singleCustomer.getSurname());
                salaryMyCustomers.put(singleCustomer.getSalary(), innerList);
            }
        }
        return salaryMyCustomers;
    }

    public static Map<BigDecimal, List<String>> changeTableToMapWithSalaryWithStream() {
        return changeTableToArray().stream()
                .collect(Collectors.groupingBy(e->e.getSalary(), Collectors.mapping(e->e.getId()+ " id, " + e.getFirstName() + " " + e.getSurname(), Collectors.toList())));
    }

    //METODA ZMIENIAJĄCA TABLICĘ W MAPĘ ZAROBKI, LICZBA TAKICH OSÓB
  /*  public static Map<Double, Integer> salaryAndNumberCustomersWithStream() {


        Map<Double, Integer> counts = changeTableToArray().stream().collect(Collectors.groupingBy(e -> e., Collectors.counting()));
    }*/
}
