package pl.sda.javastart.day7;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0)); // tu się wysypie błąd i metoda wogóle nie zadziałą
        } catch (ArithmeticException e) { // musimy wybrać odpowiedni wyjątek
            System.out.println("Wystąpił wyjątek: " + e.getMessage()); // złapaliśmy wyjątek i go wypisujemy
        }
        System.out.println(divide(10, 2));

        try{
            divideWithException(2,0);
        } catch (MyRuntimeExceptions | ArithmeticException e){ // tuw psiujemy że może ich lub nasz wyjątek obsłużyć te metodę
            System.out.println("Wystąpił wyjątek: " + e.getMessage()); // złapaliśmy wyjątek i go wypisujemy
        } finally { // blok finally zawsze się odpali bez względu czy wyłapiemy wyjątek czy nie
            System.out.println("Blok finally");
        }


    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int divideWithException(int a, int b){
        if(b==0){
            throw new MyRuntimeExceptions("Nie dziel cholero przez zero"); // tu robimy własny wyjątek
        }
        return a/b;
    }
}
