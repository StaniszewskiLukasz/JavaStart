package pl.sda.javastart.day8;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        notGeneric();   //przykład zły z brakiem generyczności, ale działanie tej metody jest takie same jak genericExample po debuggowaniu

        genericExample(); //ale działanie tej metody jest takie same jak notGeneric po debuggowaniu

        compileTimeSafety();

        //GenericFruitBox<String> blbl = new GenericFruitBox<String>(); tak się nie da bo tu dajemy String a generics jest Apple
        GenericFruitBox<Apple> appleBox = new GenericFruitBox<>(new Apple()); // tak możemy zrobić bo wrzucamy tu Apple
        appleBox.getFruit().introduceYourself();// ta metoda raz drukuje Jestem Jabłkiem. Jestem ciekw co oznacza  "appleBox.getFruit().introduceYourself()"dlaczego to przechodzi przez geter
        appleBox.getFruit().introduceApple(); // ta metoda raz drukuje Jestem Jabłkiem

        GenericFruitBox<Orange> orangeBox = new GenericFruitBox<>(new Orange());
        orangeBox.getFruit().introduceYourself(); // ta metod drukuje jestem pomarańcza
//        orangeBox.getFruit().introduceApple(); nie mozna wywołać, bo tej metody nie ma w Orange


        System.out.println(sumAnyNumbers(Arrays.asList(10, 4, 5, 58, 86)));
       // System.out.println(sumAnyNumbers(numbers));
       // Long x = sumAnySpecifiedNumbers(longs);
    }

    private static Double sumAnyNumbers(List<Number> numbers){ //robimy metodę która będzie sumować dowolne ilości liczb, będzie zwracać Double, przyjmuje listę byśmy mogli przyjąć dowolną ilość liczb, typ w liście podliśmy Number bo to jest nad klasa dla intów i doubli dlatego możemy podać tam dowolne liczby a ta lista je przyjmie
        Double sum = 0d;
        for (Number number: numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    private static <T extends Number>/* a to jest deklaracja*/ double/*to jest typ zwracany*/ sumAnySpecifiedNumbers(List<T> numbers){ //robimy metodę która będzie sumować dowolne ilości liczb, będzie zwracać to co przyjmie, przyjmuje listę byśmy mogli przyjąć dowolną ilość liczb, typ w liście podliśmy Number bo to jest nad klasa dla intów i doubli dlatego możemy podać tam dowolne liczby a ta lista je przyjmie
        Double sum = 0d; // deklarujemy mimo to jao double bo to jest typ najogólniejszy
        for (T number: numbers) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }

    private static void compileTimeSafety() {
        Orange orange = new Orange();
        GenericFruitBox<Orange> genericFruitBox = new GenericFruitBox<>(orange);//tutaj obiekt genericFruitBox otrzymuje wartość obiektu Apple
//        Apple appleFromBox = genericFruitBox.getFruit(); //nie da się
//        appleFromBox.introduceApple();
    }

    private static void genericExample() {
        Apple apple = new Apple();
        GenericFruitBox<Apple> genericFruitBox = new GenericFruitBox<>(apple);  // chcemy stworzyć pudełko generyczne, tu tworzymy boź i do niego chcemy włożyć Apple, ten obiekt dostaje wartość obiektu Apple
        Apple appleFromBox = genericFruitBox.getFruit(); //nie musimy castowac jak powyżej
        appleFromBox.introduceApple();
    }

    private static void notGeneric() {
        Fruit apple = new Apple(); // jeśli tu zmienimy Apple na Orange nie odpali bo jabłk był castowane, może być Fruit bo to jest klasa nadrzędna do Apple
        FruitBox fruitBox = new FruitBox(apple);// czy tu ten obiekt otrzyma wartość zmiennej fruit czyli wartość obiketu Apple?
        Apple appleFromBox = (Apple) fruitBox.getFruit();//castowanie czyli podanie klasy w nawiasie. W metodzie powyżej jest w nawiasie <> wpisany Apple i później nie trzeba castować ale różnicy specjalnej nie widzę
        appleFromBox.introduceApple();
    }
}
