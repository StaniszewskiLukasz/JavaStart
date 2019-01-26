package pl.sda.javastart.day8;

import java.util.Objects;

public class ConstantHashCode { // ta klasa zawsze ustala hashCode jako 5
    private String value;

    public ConstantHashCode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstantHashCode that = (ConstantHashCode) o;
        return Objects.equals(value, that.value);
    }

    @Override // taki hashCode stworzylismy by była stała wartość
    public int hashCode() {
        return 5;
    }

  /*  @Override // taki hashCode powinien tu być
    public int hashCode() {
        return Objects.hash(value);
    }*/
}
