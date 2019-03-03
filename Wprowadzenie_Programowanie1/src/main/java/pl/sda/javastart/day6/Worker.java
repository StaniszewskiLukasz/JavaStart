package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Worker extends Person implements NameHolder {
    private BigDecimal salary;

    public Worker(String firstName, String lastName, Integer identity, Integer age, BigDecimal salary) {
        super(firstName, lastName, identity, age); // dzięki super uzyskujemy dostęp do pól z nadklasy
        /* super(); - jeśli nie napiszemy z super z parametrami w tym miejscu znajdzie się (domyślnie niewidoczny) super() bez parametrów
       /* super.age = 1; */// tak by można zmienić pole age w nadklasie gdyby to pole w nadklasie nie było private. Ale mamy setter więc można to zrobić przez setter
        this.salary = salary; // this to
        /*super.setAge(1);*/ //Ponieważ w nadklasie jest setter(i jest on public) to tak można zmienić wartość pola w nadklasie
    }

    public void introductionInner() {
        super.introduction();
        System.out.println("Poza tym jestem pracownikiem");
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + super.getLastname(); // to jest ciało metody z interface zwraca Stringa sklejonego z imion, nie musi być super bo nie ma innej takiej metody
    }

    @Override//adnotacja pokazująca że ta metoda nadpisuje metodę z nadklasy
    public BigDecimal showIncome() {
        return salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary; // jeśli tu nie będzie this mówi że ta zmiena po kropce jest zmienną z klasy, a ta po znaku "=" jest zmienną z metody
    }

}
