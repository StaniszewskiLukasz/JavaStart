package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder {
    private Integer indexNo;
    private BigDecimal scolarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scolarship) {
        super(firstName, lastName, identity, age); // dzięki super uzyskujemy dostęp do pól z nadklasy
        this.indexNo = indexNo;
        this.scolarship = scolarship;
    }

    public Student(Integer indexNo, BigDecimal scolarship) {
        super();
        this.indexNo = indexNo;
        this.scolarship = scolarship;
    }

    public Student(String lukas, String woj, int identity, int age, int indexNo, int i) {
        super();
    }

    public void introductionInner() {
        super.introduction();
        System.out.println("Poza tym jestem studentem");
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNo=" + indexNo +
                ", scolarship=" + scolarship +
                '}';
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + super.getLastname();
    }

    @Override//adnotacja pokazująca że ta metoda nadpisuje metodę z nadklasy
    public BigDecimal showIncome() {
    return scolarship;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public BigDecimal getScolarship() {
        return scolarship;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public void setScolarship(BigDecimal scolarship) {
        this.scolarship = scolarship;
    }


}
