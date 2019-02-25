package pl.sda.javastart.day15;

import java.util.Objects;

public abstract class Animal implements Introduction {
    public String name;
    public Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduceYourself() {
        return "name: " + name + ", age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
