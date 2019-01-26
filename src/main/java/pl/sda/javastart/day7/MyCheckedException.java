package pl.sda.javastart.day7;

public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }

    public static int divideCheckedException(int a, int b){
        if(b==0){
            throw new MyRuntimeExceptions("Nie dziel cholero przez zero"); // tu robimy własny wyjątek
        }
        return a/b;
    }

    public static int divideWithException(int a, int b){
        if(b==0){
            throw new MyRuntimeExceptions("Nie dziel cholero przez zero"); // tu robimy własny wyjątek
        }
        return a/b;
    }
}
