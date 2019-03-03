package pl.sda.javastart.day8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomersExample {

    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)
    }; // zamykamy to średnikiem bo to jest jedno długie pole

    public static void main(String[] args) { // ctrl + shift + enter uzupełnia braki w lini typu nawiasy
        System.out.println("Wydruk metody salariesMap");
        System.out.println(salariesMap());
        System.out.println();
        System.out.println(customerNamesList());
        System.out.println("Wydruk metody salariesMapWithMergedInfosWithStream");
        System.out.println(salariesMapWithMergedInfosWithStream());
    }

    public static List<Customer> customerList() { // tworzymy metodę tworzącą listę na podstawie pola powyżej
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer); // do listy nowo utworzonej powyżej, wrzucamy każdbdy pojedynczy element(nazwany roboczo customer) z pola people
        }
        return customers;
    }

    public List<Customer> customerListWithStream() { // to samo co wyżej ale w wykonaniu streama
        return Arrays.stream(people) // ta linijka zbiera dane z pola people
                .collect(Collectors.toList()); // tutaj ta linijka wrzuca dane do listy
    }

    public List<Customer> customerListWithArrays() {
        return Arrays.asList(people);
    }

    public static List<String> customerNamesList() { // tutaj tworzy tylko liste z imieniem i nazwiskiem
        List<String> resultList = new ArrayList<>();
        for (Customer customer : people) {
            resultList.add(customer.getFirstName() + " " + customer.getSurname());
        }
        System.out.println("Drukujemy Array List z imionami i nazwiskami");
        System.out.println(resultList);
        return resultList;
    }

    public List<String> customerNamesListWithStream() { // to co wyżej ale w stream
        return customerList().stream()
                .map(e -> e.getFirstName() + " " + e.getSurname())
                .collect(Collectors.toList());
    }

    //Napisz metodę, która zwróci mapę
    // osób według zarobków <zarobki,osoby_z_zarobkami>

    public static Map<BigDecimal, List<String>> salariesMap() {
        Map<BigDecimal, List<String>> resultMap = new HashMap<>(); // tworzymy mapę
        for (Customer customer : people) {                         // przeszukujemy pierwotną bazę
            if (resultMap.containsKey(customer.getSalary())) {     // przypadek gdy nasz klucz już istnieje to do wewnętrznej listy dodajemy pole
                List<String> innerList = resultMap.get(customer.getSalary());    //tworzymy zmienną w postaci listy by ją dodać
                innerList.add(customer.getId() + ", " + customer.getFirstName() + " " + customer.getSurname());  // tu dodajemy zmienną do listy
            } else {                                       // tworzymy listę by do niego wrzucić posklejane elementy klienta imie nazwisko i id
                List<String> innerList = new ArrayList<>();//zasieg zmiennej tylko w tym bloku
                innerList.add(customer.getId() + ", " + customer.getFirstName() + " " + customer.getSurname());
                resultMap.put(customer.getSalary(), innerList);
            }
        }
        System.out.println("Drukujemy HashMapę z tabelą kto zarabia daną kwotę i wypisaniem ich nazwisk oraz id");
        return resultMap;
    }

    private static Map<BigDecimal, List<Customer>> salariesMapWithStream() { // ta metoda robi to co ta ponizej tylko zamiast nazwisk rzuca miejscami w pamięci
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary()));
    }

    private static Map<BigDecimal, List<String>> salariesMapWithMergedInfosWithStream() { //ta metoda robi to samo co ta długa powyżej "salariesMap" tylko streamem
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.mapping(e -> e.getId() + ", " + e.getFirstName() + " " + e.getSurname(), Collectors.toList())));
    }
}



