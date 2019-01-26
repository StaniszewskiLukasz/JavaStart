package pl.sda.javastart.day7;


public class MyRuntimeExceptions extends RuntimeException { // nasze wyjątki które nie wiemy kiedy wsytąpią
    public MyRuntimeExceptions(String message) {
        super(message);
    }

}
