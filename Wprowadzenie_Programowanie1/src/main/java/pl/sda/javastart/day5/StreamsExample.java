package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"}; // tu musi być static bo inaczej z innych metod statycznych nie wykorzystamy tej tablicy

    public static void main(String[] args) {
        firstStream();
        secondStream();
        sortExample();
    }

    private static void firstStream() {
    System.out.println("Tutaj drukuje pętla");
        for (String animal : animals) {
            if (animal == null) { // jeśli nie odfiltrujemy nulla to wysypie się bład bo na nullach nie można odpalać metody
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                // todo unikalność
                System.out.println(animal);
            }
        }
        System.out.println("Od tego miejsca drukuje stream");
        Arrays.stream(animals) // tu jest strumień Stringów
                .filter(e -> e != null) // jeśli nie odfiltrujemy nulla to wysypie się bład bo na nullach nie można odpalać metody
                .map(e -> e.trim()) //to mapowanie trzeba zrobić żeby można było obrobić te Stringi
                .filter(e -> e.length() >= 4) // każde "e" to onbiekt typu String
                .distinct()
                .forEach(e -> System.out.println(e)); // poniżej poprzez collect zrobiliśmy to samo ale tutaj od razu drukujemy bez zwracania Stringa
    }

    private static void secondStream() {
        System.out.println("WYDRUK METODY SECOND STREAM");
        System.out.println();
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            System.out.print(animal + ","); // todo zrobić by na końcu nie był przecinka
        }
        System.out.println();
        System.out.println();
        System.out.println("Od tego miejsca drukuje stream w collecct");
        String result = Arrays.stream(animals) // żeby później użyć metody collect czyli zebrać je razem do kupy trzeba stworzyć Stringa w któym to skleimy
                .filter(a -> StringUtils.isNotBlank(a)) // zaimportowaliśmy poprzez ctrl+alt+n wyszukaj pom metodę z Maven StringUtils 3.8.1 i teraz korzystamy z isNoBlank wypierdala wszystko poza pustymi
                .map(a->a.trim())
                .collect(Collectors.joining(",")); // łączenie wielu napisów w jeden powyżej poprzez forEach od razu drukowaliśmy a Collect jest metodą zwraca Stringa więc misumy go wydrukować
        System.out.println(result);
    }

    private static void sortExample(){
        String name1 = "Anna";
        String name2 = "Ola";
        System.out.println("Tu będzie wynik liczbowy ujemny, 0 lub dodatni w zależności czy anna jest inna od Oli");
        System.out.println(name1.compareTo(name2)); // to jest compareTo metoda z klasy String więc ona zwraca minusową liczbę jeśli coś jest mniejsze, 0 gdy jest takie same, i dodatnią jesli jest większa jedna od drugiej
        System.out.println("Odrzucamy blanki, odcinamy białe znaki, sortujemy bombelkowo i drukujemy z odstępami");
        Arrays.stream(animals)
                .filter(e->StringUtils.isNotBlank(e))
                .map(e->e.trim())
                .sorted((e,f)->e.compareTo(f))
                .forEach(e-> System.out.print(e + " "));
        System.out.println();
        System.out.println("Sortowanie pod długości Stringa");
        Arrays.stream(animals)
                .filter(e->StringUtils.isNotBlank(e))
                .map(e->e.trim())
                .distinct()
                .sorted((e,f)->Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length())))
                .forEach(e-> System.out.println(e + " "));


    }
}