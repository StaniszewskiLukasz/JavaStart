package pl.sda.javastart.day5;

public class ExperimentalObject {
    private Integer notFinalImmutable; // tu nie możemy zmienić argumentu na inny bo klasa integer zabrania, ale możemy zmienić referencję
    private final Integer finalImmutable; // final musi być zainnicialjzowane inaczej będzie wychodził bład że wartość jest niezmienna a wartości nie ma, tu nie można ani wartośći zmienić ani referencji zmienić
/* argument nie możemy znienić jeśli klasa z której wywodzi się rodzaj zmiennej tego zabrania, referencji nie mozemy zmienić jeśli modyfikator dostępu zmiennej zabrania czyli jest final*/
    /* jak stworzymy konstruktor dla tej zmiennej to już nie będzie błedu bo JVM będzie wiedział że tworząc obiekt będziemy
    podawać jego wartość która już potem będzie niezmienna bo to final TUTAJ JUŻ NIC NIE ZMIENIMY */
    private final TestPerson finalMutable;  // tu możemy zmienić wartość ale nie możemy zmienić referencji. Tutaj pole jest final ale klasa nie jest final

    public ExperimentalObject(Integer notFinalImmutable, Integer finalImmutable, TestPerson finalMutable) { // to jest konstruktor parametrowy
        this.notFinalImmutable = notFinalImmutable;
        this.finalImmutable = finalImmutable;
        this.finalMutable = finalMutable;
    }

    public Integer getNotFinalImmutable() {
        return notFinalImmutable;
    }

    public Integer getFinalImmutable() {
        return finalImmutable;
    }

    public void setNotFinalImmutable(Integer notFinalImmutable) {
        this.notFinalImmutable = notFinalImmutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }
    /* nie ma setera dla finalImmutable bo to final więc jaego wartość i tak jest niezmienna */
}
