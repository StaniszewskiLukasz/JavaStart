package pl.sda.javastart.day7;

public class ColorEnum { // normalna klasa ma pola i konstruktor i geter i setery
    private Integer colorNumber; // zrobiliśmy enkapsulację
    private String plName;

    public ColorEnum(int colorNumber, String colorName) {
        this.colorNumber = colorNumber;
        this.plName = colorName;
    }

    public Integer getColorNumber() {
        return colorNumber;
    }

    public String getPlName() {
        return plName;
    }

    public void setColorNumber(Integer colorNumber) {
        this.colorNumber = colorNumber;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }
}
