package Lotto;

import java.util.Objects;

public class Digit {
    private Integer digit;

    public Digit(Integer digit) {
        this.digit = digit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit1 = (Digit) o;
        return Objects.equals(digit, digit1.digit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(digit);
    }

    @Override
    public String toString() {
        return "Digit " + digit;
    }
}
