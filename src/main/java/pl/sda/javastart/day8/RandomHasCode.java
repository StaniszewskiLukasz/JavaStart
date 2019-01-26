package pl.sda.javastart.day8;

import org.apache.commons.lang3.RandomUtils;

import java.util.Objects;

public class RandomHasCode { // w tej klasie będziemy mieli hashCode randomowy
    private String value;

    public RandomHasCode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomHasCode that = (RandomHasCode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {// tu sami zrobiliśmy randomowy hashCode
        return RandomUtils.nextInt(0,100);
    }
}
