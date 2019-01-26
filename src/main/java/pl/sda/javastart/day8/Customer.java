package pl.sda.javastart.day8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Customer {

    private Integer id; // w konstruktorze nia ma id ale jest w bloku incjalizujący a on domyślnie zadziała we wszystkich konstruktorach
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;
    private static Integer counter = 1; // w bloku incjalizującym lub w konstruktorze musi się on znaleźć by był powiększany za każdym odpaleniem programu

    {                     //bloki incjalizujące muszę być nad konstruktorami pod polami, później publiczne później prywatne metody
        id = counter++;  // przy każdym utworzeniu obiektu nadamy obiektowi id a potem go zwiększymy o jeden
        System.out.println("Blok inicjalizujący");
    }

    public Customer(String firstName, String surname, Integer age, String salary) { //tu konstruktor gdzie salary są Stringiem bo raz je dostajemy jako String a raz jako Integer
//        this.firstName = firstName;
//        this.surname = surname;
//        this.age = age;
//        this.salary = BigDecimal.valueOf(Integer.valueOf(salary));//string do BigDecimal // zamieniamy ze Stringa na Integera i za Integera na BigDecimal nie można ze Stringa na BigDecimlala od razu
        this(firstName, surname, age, Integer.valueOf(salary));//wywołanie drugiego konstruktora, zamiast powielania kodu. //ten this umożliwia nie dublowanie konstruktorów z tymi samymi polami, tu doastajemy Stringa w salary zmieniamy go na Integera i całość z resztą danych przekazujemy do poniższego Konstruktora
    }

    public Customer(String firstName, String surname, Integer age, Integer salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
        System.out.println("konstruktor");
    }

    public Integer getId() { // same gettery by nie zmieniać wartoci
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public static Integer getCounter() {
        return counter;
    }
}





