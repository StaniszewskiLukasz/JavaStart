package pl.sda.javastart.day11;

public abstract class MathAbstract<E> {

    protected abstract Integer map(E e); //  w tej klasie dodajemy dwie wartości nie wiemy jakich typów one będą ale je maoujemy do Integer
    StringMath stringMath = new StringMath();
    public Integer plus(E e1, E e2){
        return map(e1)+map(e2);
    }
}
