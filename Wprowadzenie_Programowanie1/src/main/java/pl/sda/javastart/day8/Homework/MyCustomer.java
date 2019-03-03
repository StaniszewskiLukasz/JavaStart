package pl.sda.javastart.day8.Homework;

import java.math.BigDecimal;
import java.util.Objects;

public class MyCustomer {
    private Integer id;
    private final String firstName;
    private final String surname;
    private final Integer age;
    private final BigDecimal salary;
    private static Integer counter = 1;

    {
        id=counter++;
    }

    public MyCustomer(String firstName, String surname, Integer age, String salary) {
//        this.firstName = firstName;
//        this.surname = surname;
//        this.age = age;
//        this.salary = salary;
        this(firstName,surname,age,Integer.valueOf(salary));
    }

    public MyCustomer(String firstName, String surname, Integer age, Integer salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.salary = BigDecimal.valueOf(salary);
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCustomer that = (MyCustomer) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary);
    }
}
