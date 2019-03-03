package pl.sda.javastart.day12;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ChangeNames {

    private List<Animal> listOfAnimals = new ArrayList<>();


    public void animalsNamesPrint() {

        for (int i = 0; i < 10; i++) {
            Animal animal = new Animal("Name" + i);
            listOfAnimals.add(animal);
        }

        IntStream.range(0, 10)// tworzymy nowe zwierzęta w pustym streamie mającym 10 indexów
                .mapToObj(i -> new Animal("name" + i)) // tworzymy dziesięć obiektów Animal z innym imieniem
                .map(Animal::getSpecies)  // dobieramy się do nazwy zwierzęcia
                .map(StringUtils::capitalize)//zmieniamy litery na duże
        .forEach(System.out::println); // przed dwukropkiem zawsze obiket na którym pracujemy, po dwukropku metoda z tej klasy

    }


}
