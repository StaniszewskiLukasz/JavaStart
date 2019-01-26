package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println("Wydruk metody if else");
        System.out.println(isEven(15));
        System.out.println("Wydruk metody Ternary");
        System.out.println(isEvenTernary(14));
        System.out.println("Wydruk metody dividableByThreeAndFive");
        System.out.println(dividableByThreeAndFive(15));
        System.out.println("Wydruk metody addTax");
        System.out.println(addTax(100, 23));
        System.out.println("Wydruk metody introduction");
        System.out.println(introduction("Maciej", 16, true));
        System.out.println("Wydruk metody twoParamsEven");
        System.out.println(twoParamsEven(4, 5));
        System.out.println("Wydruk metody threeParamsEven");
        System.out.println(threeParamsEven(15, 15, 30));
        System.out.println("Wydruk metody isEnyBiggerThanZero");
        System.out.println(isEnyBiggerThanZero(5, 6));
        System.out.println("Wydruk metody answearCell");
        System.out.println(answearCell(true, false, false));
        System.out.println("Wydruk metody answearCell po raz drugi");
        System.out.println(answearCell(false, false, true));
        System.out.println("Wydruk metody checkWhichOneIsBigger");
        System.out.println(checkWhichOneIsBigger(15, 15, 8));
    }

    public static boolean isEven(int a) {

        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEvenTernary(int a) {

        boolean result = a % 2 == 0 ? true : false;
        return result;

    }

    public static boolean dividableByThreeAndFive(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    public static double addTax(int price, int tax) {
        return price * tax / 100 + price;
    }

    public static String introduction(String name, int age, boolean genderParam) {
        String gender;

        if (genderParam) {
            gender = "mężczyzna";
        } else {
            gender = "kobieta";
        }
        return "Cześć! Jestem " + name + "mam " + age + "lat i jestem " + gender;
    }


        /*Utwórz metodę, do której przekazujesz dwa
        parametry a ona zwróci informację (wartość logiczną - `boolean`) czy **obydwie** są parzyste.

Utwórz metodę, do której przekazujesz trzy parametry a ona zwróci informację (wartość logiczną - `boolean`)
czy suma pierwszych dwóch daje trzeci.*/

    public static boolean twoParamsEven(int a, int b) {

        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean threeParamsEven(int a, int b, int c) {

        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    /*Utwórz metodę, do której przekazujesz dwa parametry, a ona zwróci informację (wartość logiczną
     - `boolean`) czy **chociaż jeden z nich** jest większy od zera.
      */
    public static boolean isEnyBiggerThanZero(int a, int b) {

        if (a > 0 || b > 0) {
            return true;
        } else {
            return false;
        }
    }

    /*answerCell(boolean isMama,boolean isMorning, boolean isAsleep) - dzwoni telefon, mamy zwrócić true jeśli chcemy go odebrać.
Nie odbieramy kiedy śpimy.
Nie odbieramy kiedy jest rano i nie jest to telefon od mamy*/

    public static boolean answearCell(boolean isMama, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMama) {
            return false;
        }
        return true;
    }

    /*checkWhichOneIsBigger - Program odczytujący 3 liczby i wypisujący, która z nich jest największa.*/
    public static int checkWhichOneIsBigger(int a, int b, int c) { //fixme
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;

    }
}
