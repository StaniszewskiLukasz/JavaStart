package pl.sda.javastart.day6.Homework.Animals;

public abstract class Animal {
    private String name;
    private Double weight;
    private Integer age;

    public abstract String introduceYourself();

    public Animal(String name, Double weight, Integer age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
