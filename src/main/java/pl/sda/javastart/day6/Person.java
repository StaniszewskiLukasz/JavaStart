package pl.sda.javastart.day6;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Person implements Comparable<Person> { // tu dopisaliśmy abstract bo jedna z metod jest abstrakcyjna przez to nie możemy tworzyć obiektów tej klasy, ale możemy tworzyć metody abstrakcyjne i wszystkie podklasy muszą je wtedy implementować
    private String firstName;
    private String lastName;
    private Integer identity; // najważniejsze jest to że domyślnie nie będziemy mieli 0, a tak będzie null, dodatkowa korzyść to metody, ale metody możemy uzyskać zmieniając małego na dużego
    private Integer age;

    public Person() {

    }


    protected void introduction(){
        System.out.println("Jestem człowiekiem");
    }

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }

    public abstract BigDecimal showIncome();//ta klasa jest abstrakcyjna minus jest taki że nie można twrzyć obiektów tej klasy, plus jest taki



    public String getFirstName() {
        return firstName;
    }

    public String getLastname() { return lastName; }

    public Integer getIdentity() {
        return identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identity=" + identity +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Person o){
        return this.identity.compareTo(o.getIdentity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(identity, person.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
}
