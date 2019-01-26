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
            RandomHasCode rand1 = new RandomHasCode("7"); // tutaj trafiają do innych indexów i namnarza te same wartości pod różnymi indexami
            RandomHasCode rand2 = new RandomHasCode("7"); //tutaj ponieważ wartośc jest zawsze ta sama to powinien wyjść zawsze ten sam hashCode i powinien każdy obiekt wrzucać do tego samego indexu, ale ponieważ zmieniliśmy specjalnie hashCode na zmienny to każda tożsama wartość trafia do innego indexu co nie powinno mieć miejsca
            RandomHasCode rand3 = new RandomHasCode("7");
            RandomHasCode rand4 = new RandomHasCode("7");
            RandomHasCode rand5 = new RandomHasCode("7");

//            System.out.println("Rozmiar Const");
            Set<ConstantHashCode> constantHashCodeSet = new HashSet<>(); // tworzymy hashSeta
            constantHashCodeSet.add(const1);
            constantHashCodeSet.add(const2);
            constantHashCodeSet.add(const3);
            constantHashCodeSet.add(const4);
            constantHashCodeSet.add(const5);
            System.out.println(constantHashCodeSet.size());

//            System.out.println("Rozmiar Random");
            Set<RandomHasCode> randomHasCodes = new HashSet<>(); // shift + F6 nadajemy inną nazwe wielu na raz
            randomHasCodes.add(rand1);
            randomHasCodes.add(rand2);
            randomHasCodes.add(rand3);
            randomHasCodes.add(rand4);
            randomHasCodes.add(rand5);
            System.out.println(randomHasCodes.size());
            System.out.println(randomHasCodes.contains(rand1)); //
        }
    }
}
