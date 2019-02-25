package pl.sda.javastart.streamsExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    private static final String PATH_TO_FILE = "d:\\programowanie\\nauka\\wiersz.txt";

    public static void main(String[] args) throws IOException {
//        integerPrint();

//        streamWithSkip();

//        streamSum();

//        findFirst();

//        filteredNames();

//        averageIntegers();

//        stringListFiltered();


    }

    private static void stringListFiltered() {
        List<String> persons = Arrays.asList("Agnieszka", "Łukasz", "Marek", "Jarek", "Jurek");
        persons//dlaczego nazwa tablicy nie jest w nawiasie streama? Tu nie można napisać
                .stream()
                .map(String::toLowerCase)
//                        .filter(String::startsWith) // dlaczego tak nie można? Chyba dlatego że ten zapis używamy gdy robimy coś na całej tablicy a nie na pojedynczych elementach
                .filter(x -> x.startsWith("a"))
//                .filter(x -> x.startsWith("m")) // gdyby ta linia nie była wyłączona nic się nie wyświetli bo filtr pierwszy wybiera tylko imie na "a" a ten filtr wybiera tylko te na "m' ale takich już nie ma więc jest pusto, Filtr nie pasujące wyrzuca, kasuje.
                .forEach(System.out::println);
    }

    private static void averageIntegers() {
        Arrays.stream(new int[]{4, 8, 7, 9, 6})
                .map(x -> x * x) //mnożenie wszytkich elementów z tablicy
                .average() // średnia
                .ifPresent(System.out::println);
    }

    private static void filteredNames() {
        //String[] names = {"Agnieszka", "Łukasz","Marek", "Jarek","Jurek"}; // tak można i jest krócej
        String[] names = new String[]{"Agnieszka", "Łukasz", "Marek", "Jarek", "Jurek"};
//        Stream.of(names)//tak też można zamiast tego zapisu poniżej
        Arrays.stream(names)
                .filter(x -> x.startsWith("J"))
                .sorted()
                .forEach(System.out::println);
    }

    private static void findFirst() {
        Stream.of("Michał", "i", "Kuba", "Zuza")
                .sorted()//w tym przypadku sortuje alfabetycznie
                .findFirst() //szuka pierwszego wyrażenia bez sorted będzie to Michał, z sorted Kuba
                .ifPresent(System.out::println);
    }

    private static void streamSum() {
        System.out.println(  // sout musi być tutaj bo sum jest operacją kończącą a w streamach jest tylko jedna operacja kończąca
                IntStream
                        .range(1, 10)
                        .sum());
    }

    private static void streamWithSkip() {
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
    }

    private static void integerPrint() { //metoda z zakresu od 1 do 9 drukuje cyfry
        IntStream
                .range(1, 10) // zakres od 1 włącznie, liczba kończąca wyłacznie
                .forEach(System.out::print); // najpierw klasa później metoda z tej klasy
    }
}
