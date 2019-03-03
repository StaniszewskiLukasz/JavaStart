package pl.sda.javastart.day3;

public class ForsExample {
    public static void main(String[] args) {
        printNumbersWithoutDividableByParam(3);
        sumNaturalNumbersToLimit(1000);
    }

    private static void printNumbersWithoutDividableByParam(int param) {
        System.out.println("Wydruk metody omijającej wybraną liczbę. Parametr się równa " + param);
        for (int i = 0; i <= 10; i++) {
            if (i % param != 0) {
                System.out.println(i);
            }
        }

        for (int i = 0; i <= 10; i++) {
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void sumNaturalNumbersToLimit(int endNumber) {

        int sum = 0;
        for (int i = 0; ; i++) { // nie podajemy wartości końcowej ponieważ wartością końcową będzie suma
            if (sum + i >= endNumber) { //ten if jest bezpiecznikiem, jęśli sum po dodaniu "i" przekroczy endNumber to
                break;                     // if zadziałą i włączy się braek
            }
            sum = i + sum;
        }
        System.out.println(sum);
    }
}
