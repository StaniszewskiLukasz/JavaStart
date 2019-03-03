package pl.sda.javastart.day8;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {  // uruchamiamy klasy Random i Constant, sprawdzamy jakie efekty da zły hashCode
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConstantHashCode const1 = new ConstantHashCode("6"); // jak wartości są takie same to jest źle i rzykład działa, przy innych wartościach i tak porówna to equalsem
            ConstantHashCode const2 = new ConstantHashCode("6"); // jeśli są takie same biznesowo ale po dodaniu do hashSeta i tak będzie jeden a hashCode jest jeden nie dodaje nowych bo hashSet nie duplikuje
            ConstantHashCode const3 = new ConstantHashCode("6");
            ConstantHashCode const4 = new ConstantHashCode("6");
            ConstantHashCode const5 = new ConstantHashCode("6");
            RandomHashCode rand1 = new RandomHashCode("7"); // tutaj trafiają do innych indexów i namnarza te same wartości pod różnymi indexami
            RandomHashCode rand2 = new RandomHashCode("7"); //tutaj ponieważ wartośc jest zawsze ta sama to powinien wyjść zawsze ten sam hashCode i powinien każdy obiekt wrzucać do tego samego indexu, ale ponieważ zmieniliśmy specjalnie hashCode na zmienny to każda tożsama wartość trafia do innego indexu co nie powinno mieć miejsca
            RandomHashCode rand3 = new RandomHashCode("7");
            RandomHashCode rand4 = new RandomHashCode("7");
            RandomHashCode rand5 = new RandomHashCode("7");

//            System.out.println("Rozmiar Const");
            Set<ConstantHashCode> constantHashCodeSet = new HashSet<>(); // tworzymy hashSeta
            constantHashCodeSet.add(const1);
            constantHashCodeSet.add(const2);
            constantHashCodeSet.add(const3);
            constantHashCodeSet.add(const4);
            constantHashCodeSet.add(const5);
            System.out.println(constantHashCodeSet.size());

//            System.out.println("Rozmiar Random");
            Set<RandomHashCode> randomHashCodes = new HashSet<>(); // shift + F6 nadajemy inną nazwe wielu na raz
            randomHashCodes.add(rand1);
            randomHashCodes.add(rand2);
            randomHashCodes.add(rand3);
            randomHashCodes.add(rand4);
            randomHashCodes.add(rand5);
            System.out.println(randomHashCodes.size());
            System.out.println(randomHashCodes.contains(rand1)); //
        }
    }
}
