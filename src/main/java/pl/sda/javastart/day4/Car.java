package pl.sda.javastart.day4;

import pl.sda.javastart.day7.ColourEnum;

import java.math.BigDecimal;

public class Car {
    private String model;
    private ColourEnum colour; // tu wpisujemy nasz enum z dnia 7
    private String manufacturer;
    private String vin;
    private int hp;
    private BigDecimal basePrise;
    private int doorNumber;
    private CarOption[] options;

    public BigDecimal summaryPrice (){
        BigDecimal finalPrice = basePrise;
        CarOption[] carOptions = options;
        if(options==null){

            return finalPrice==null ? BigDecimal.ZERO : finalPrice;
        }

        for (int i = 0; i < carOptions.length; i++) {
            finalPrice = finalPrice.add(carOptions[i].getOptionPrice());
        }
        return finalPrice;
    }


    public ColourEnum getColour(){
        return colour;
    }
    public void setColour(ColourEnum colour){
        this.colour=colour;
    }


    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }


    public String getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(String model){
        this.manufacturer=manufacturer;
    }

    public String getVin() {
        return vin;
    }

    public int getHp() {
        return hp;
    }

    public BigDecimal getBasePrise() {
        return basePrise;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public CarOption[] getOptions() {
        return options;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setBasePrise(BigDecimal basePrise) {
        this.basePrise = basePrise;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void setOptions(CarOption[] options) {
        this.options = options;
}

    @Override
    public String toString() {
        return model +" " +summaryPrice();
    }
}
