package pl.sda.javastart.day2;

public class Methods {
    public static void main(String[] args) {

        System.out.println("Policz pole prostokata a*b");
        int a = 2;
        int b = 3;
        int x = a * b;
        System.out.println(x);
        //poniżej różne sposoby wykorzystania tej samej METODY
        System.out.println("Policz pole prostokata a*b inną metodą");
        int result = rectangleArea(a, b);
        System.out.println(result);
        System.out.println("Policz pole prostokata a*b kolejną metodą");
        result = rectangleArea(5, 5);/*reużycie zmiennej result*/
        System.out.println(result);//wydruk reużycia
        System.out.println("Wyświetla metodę rectangleArea");
        System.out.println(rectangleArea(4, 8));//użycie metody wewnątrz metody

        System.out.println("Wyświetla metodę rectangleCircuit");
        System.out.println(rectangleCircuit(4,8 ));

        System.out.println("Wyświetla metodę inchToMeter");
        System.out.println(inchToMeter(15));

        System.out.println("Wyświetla metodę minutesToDateValue");
        System.out.println(minutesToDateValue(9001));/* to można też podać wartość w ten sposób (365 * 54 *68 ) i też będzie git mimo tego
        że w metodzie jest tylko jeden int minutes*/

        System.out.println("Wyświetla metodę sumDigitsOfNumber");
        System.out.println(sumDigitsOfNumber(234));

        System.out.println("Wyświetla metodę bmi");
        System.out.println(bmi(100,190 ));


    }

    public static int rectangleArea(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int rectangleCircuit(int a, int b) {
        int result = a * 2 + b * 2;
        return result;

        /*return a * 2 + b * 2;*/ //powinno być tak bo czytelniej i krócej
    }

    public static double inchToMeter(double inches) {

        double result = inches * 0.0254;
        return result;

        /* return inches * 0.0254;*/ //powinno być tak bo czytelniej i krócej
    }

    public static String minutesToDateValue(int minutes) { //todo

        int h = minutes / 60;
        int m = minutes % 60;
        int d = minutes / (24 * 60);
        int y = minutes / (d * 365);
        return y + "y" + d + "d" + m + "m" + h + "h"; // po return nie pisać = bo będzie błąd
    }

    public static int sumDigitsOfNumber(int number) {

        int last = number % 10;
        int middle = number % 100 / 10;
        int first = number % 1000 / 100;
        int sum = last + middle + first;
        return sum;
    }

    public static double bmi(double weight, double height) {
        double result = weight / Math.pow(height, 2);
        return result;
    }
}




