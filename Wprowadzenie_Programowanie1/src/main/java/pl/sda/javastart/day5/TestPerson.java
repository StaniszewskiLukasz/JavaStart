package pl.sda.javastart.day5;

import java.util.Objects;

public class TestPerson {
    private String firstName;
    private String surname;
    private int identity; // tu lepiej dać Integera bo lepiej mieć domyślnie nulla niż 0 bo domyślnie Anna Nowak miałaby 0 lat
    static int counter;

    static { // z bloków statycznych się raczej nie korzysta ale może być na jobInterviev
        counter = 1; // to jest blok statyczny to tu ne ma sensu ale jest to dla przykładu, w tym miejscu wartość counter może być podana powyżej
    }

    {
        System.out.println("Blok incjalizujący");
        this.identity = counter++;// blok incjalizujący on się uruchomi przy każdym konsruktorze nawet jeśli konstruktor nie zawiera informacji by zmieniać counter
    }

    public TestPerson() { // konstruktor bezparametrowy, musi być utworzony
        /*this.identity = counter++;*/ //to wymazałem bo powyżej jest to samo w bloku inicjalizującym //this = kiedy wywołamy metodę TestPerson i nadamy nowy identity to counter zostanie mu przypisany a następnie wartośc counter się zwiększy by przygotować się na nowy obiekt
    }

    public TestPerson(String firstName, String surname, int identity) { // to jest konstruktor dlatego kończymy go jak metodę
        this.surname = surname;
        this.firstName = firstName;
        this.identity = identity;
        /* to jest konstruktor parametrowy; */
    }

    public TestPerson(String surname, String firstName) { // kolejny nowy konstruktor który powiela ten powyższy w dwóch polach i to jest bez sensu
        this.surname = surname;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getIdentity() {
        return identity;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(Object o) { // to generujemy z automatu alt+ insert, "o" to jest zmienna w naszym wypadku to jest person2
        if (this == o)
            return true; // this oznacza obiekt na którym wykonujemy metodę w naszym wypadku person2, equals w tym polu sam i takz sprawdza technicznie miejsce w pamięci
        if (o == null || getClass() != o.getClass()) return false;
        TestPerson person = (TestPerson) o;
        return identity == person.identity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
    /*  to generujemy z automatu alt+ insert,
    generujemy te metody tylko dla parametru kluczowego a nie dla wszystkich w naszym wypadku to pesel,
    nie zmieniamy w trakcie już działani programu by dopisać inny atrybut do metodu equals, to wywoła ogromny bałagan */

/* public void notify(){ tutaj będzie błąd próbujemy nadpisać metodę z klasy Object
i tego się nie da zrobić bo ta metoda jest final }*/


}
