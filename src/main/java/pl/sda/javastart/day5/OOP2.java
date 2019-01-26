package pl.sda.javastart.day5;

public class OOP2 {
    public static void main(String[] args) {
        equalsExample();
        referenceExample();
        staticFinal();

        TestPerson person1 = new TestPerson("Kowalski", "Janusz");
        System.out.println(person1.getIdentity());
    }

    private static void staticFinal() {
        TestPerson person1 = new TestPerson(); // w metodzie equalsPerson tworzyliśmy już obiekt z tą nazwą ale było to w innej meodzie więc tak jakz wykle się to nam nie kłuci
        TestPerson person2 = new TestPerson();
        System.out.println();
        System.out.println(person1.getIdentity());
        System.out.println(person2.getIdentity());
        System.out.println("Ludzi na świecie jest: " + (TestPerson.counter - 1)); // tu daliśmy roboczo minus 1 bo źle zainicjowaliśmy countera ze złą wartością początkowo

        CalculatorUtils utils = new CalculatorUtils(); // tak byśmy robili gdyby nie istniał STATIC
        System.out.println(utils.add(15, 5));
        System.out.println(CalculatorUtils.adding(15, 5)); // dzięki static możemy zrobć tak i nie musimy tworzyć obiektu tej klasy by wywołać metodę
        person1.setFirstName("Ola"); // tu nadaliśmy imie person1 by poniżej stworzyć obiekt ExperimentalObject
        ExperimentalObject eo = new ExperimentalObject(1, 2, person1); // najpierw prawa strona wartości się tworzą jako obiekty bo to są Integery, później tworzy się obiekt ExperimentaObject dopisujemy do niego te wcześniej utworzone wartości/obiekty a na końcu tworzymy referencję przypisanie nazwy do obiektu
        Integer mutableValue = eo.getNotFinalImmutable();
        eo.setNotFinalImmutable(6);  // to jest zmiana referencji, nie możemy zmienić wartości bo zabrania klasa Integer
        TestPerson personFromEo = eo.getFinalMutable();
        System.out.println(eo.getFinalMutable().getFirstName());

        personFromEo.setFirstName("Anna"); // tu właśnie zmieniliśmy wartość dla trzeciej zmiennej w ExperimentalObject, nie można zmienić referencji a wartość można
    }


    private static void referenceExample() {
        System.out.println();
        System.out.println("Wydruk metody equals VS == przy obiektach typu String i obiektach Long");
        String s1 = "napis";
        String s2 = "napis";
        String s3 = new String("napis");
        System.out.println("Porównanie Stringów s1 do s2 poprzez ==");
        System.out.println(s1 == s2); //true poruwnuje miejsce w pamięci
        System.out.println("Porównanie Stringów s1 do s3 poprzez == w obu wartość ta sama ale jeden to nowy obiekt");
        System.out.println(s1 == s3); // false miejsce inne bo s3 jest nowym obiektem
        System.out.println("Porównanie Stringów s1 do s2 poprzez eqals");
        System.out.println(s1.equals(s2)); //true bo to to samo w każdym przypadku
        System.out.println("Porównanie Stringów s1 do s3 poprzez eqals");
        System.out.println(s1.equals(s3)); //true bo porównuje wartości a nie miejsce

        Long firstNumber = 127L;
        Long secondNumber = 127L;
        System.out.println(firstNumber == secondNumber); // do 127 to porównanie zwróci jeszcze true powyżej 127 jest false
        System.out.println(firstNumber.equals(secondNumber));

        Long thirdNumber = 128L;
        Long fourthNumber = 128L;
        System.out.println(thirdNumber == fourthNumber); // tu jest false bo już powyżej 127 a to jest inny obiekt to nie liczba bo Long jest z dużej litery
        System.out.println(thirdNumber.equals(fourthNumber));
    }

//    metoda poniżej drukuje się najpierw bo jest zgłoszona w psvm jako pierwsza
    public static void equalsExample() { // by stworzyć metodę dla czegoś z automatu musimy zaznaczyć alt + ctrl + m
        System.out.println("Wydruk metody equals VS == przy obiektach typu String");
        TestPerson person1 = new TestPerson(); // by to działało(w momencie gdy istnieje konstruktor parametrowy w klasie person) w klasie person musi być konstruktor bezparametrowy
        TestPerson person2 = new TestPerson();

        person1.setFirstName("Anna"); // tu dopisaliśmy wartości przez sety
        person1.setSurname("Nowak");
        person1.setIdentity(123);
        person2.setFirstName("Anna");
        person2.setSurname("Nowak");
        person2.setIdentity(123);
        System.out.println("Porównanie person 1 do person 2 przez == przy tym samym peselu ");
        System.out.println(person1 == person2); //tu będzie false bo porównuje miejsce w pamięci TO JEST TECHNICZNY PUNKT WIDZENIA
        System.out.println("Porównanie person 1 do person 2 przez equals przy tym samym peselu ");
        System.out.println(person1.equals(person2)); // jeśli nie zrobimy w klasie person metody equals to tutaj też będzie false TO JEST BIZNESOWY PUNKT WIDZENIA
        System.out.println("Porównanie person 1 do person 2 przez hashCode przy tym samym peselu");
        System.out.println(person1.hashCode() == person2.hashCode()); // to też nam da false jeśli nie zaimplemetowliśmy equals ani hashCode bo wtedy obie te metody porównują adresy w pamięci czyli mimo tych samych atrybutów miejsca są inne
        /*musi być equals i hasCode i tyle */
        /* po nadpisaniu metod equals i hasCode wyjdze nam true */

        TestPerson person3 = new TestPerson("Anna", "Nowak", 123);
        System.out.println("Porównanie person 1 do person 3 przez equals przy tym samym peselu");
        System.out.println(person1.equals(person3)); // tu będzie truee
        person3.setIdentity(111);
        System.out.println("Porównanie person 1 do person 3 przez equals przy innym peselu ");
        System.out.println(person1.equals(person3)); // tu będzie false bo person3 linie wcześniej dostał inny pesel

        String a = "A"; // imutable on jest niezmienny trzeba utworzyć nowego stringa by przypisać mu nową wartość
        String b = a + "!";


    }


}
