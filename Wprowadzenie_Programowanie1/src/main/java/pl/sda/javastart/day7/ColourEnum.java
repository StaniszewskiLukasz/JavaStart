package pl.sda.javastart.day7;

public enum ColourEnum { // enum nie ma public przy konstruktorze bo wartości ma skończone już zainicjalizowane

    BLACK(2,"czarny"), WHITE(1,"biały"); // tu mamy jakby dwie publiczne stałe których mozemy użyć wszędzie

    private Integer colourNumber; // zrobiliśmy enkapsulację
    private String plName;

    ColourEnum(int colorNumber, String colorName) {
        this.colourNumber = colorNumber;
        this.plName = colorName;
    }

    public Integer getColorNumber() {
        return colourNumber;
    }

    public String getPlName() {
        return plName;
    }
    // użyliśmy naszego enuma w dniu 4
}