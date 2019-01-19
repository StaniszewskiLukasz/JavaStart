package pl.sda.javastart.day7;

import pl.sda.javastart.day4.Car;

import java.util.Arrays;

public class OOP4 {
    public static void main(String[] args) {
        CreateWhiteCar();
        System.out.println(ColourEnum.WHITE); // tak zadziała bo nemu ma w sobie Stirnga
        //System.out.println(ColourEnum.values()); // sout przy tablicy jeśli użyjemy wyświetli miejsce w tablicy
        System.out.println(Arrays.toString(ColourEnum.values()));
        ColourEnum[] colours = ColourEnum.values();
        for(ColourEnum x:colours){ // tu robimy pętle i doastajemy się do tablicy Colour Name ale nam zależy na nazwach polskich
            System.out.println(x.getPlName()); // to dostaejmy się do nazw polskich
        } //  to jest starsza wersja z pętlą
        System.out.println("DRUKUJEMY PRZEZ STRING");
        Arrays.stream(ColourEnum.values()).map(e->e.getPlName()).forEach(e-> System.out.println(e)); // to wersja przez streama



    }

    private static void CreateWhiteCar() {
        Car car = new Car(); // tworzymy obiekt klasy car z dnia 4
        car.setColour(ColourEnum.WHITE); // tak nadaliśmy mu kolor poprzez setera wybraliśmy z enuma jeden z dwóch kolorów
        System.out.println(car.getColour().getColorNumber()); // drukujemy kolor i kod koloru
    }
}
