package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Pensioner extends Person {

    private BigDecimal pension;

    public Pensioner(String firstName, String lastName, Integer identity, Integer age, BigDecimal pesnsion) {
        super(firstName, lastName, identity, age);
        this.pension = pesnsion;
    }

    public void introductionInner(){
        super.introduction();
        System.out.println("Poza tym jestem starym prykiem");
    }

    @Override//adnotacja pokazująca że ta metoda nadpisuje metodę z nadklasy
    public BigDecimal showIncome() {
        return pension;
    }

    public BigDecimal getPension() {
        return pension;
    }

    public void setPension(BigDecimal pension) {
        this.pension = pension;
    }


}
