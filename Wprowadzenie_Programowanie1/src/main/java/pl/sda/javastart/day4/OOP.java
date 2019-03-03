package pl.sda.javastart.day4;

import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Fabia");

        System.out.println(car.getModel());
        System.out.println(car);

        CarOption leatherSeats = new CarOption();
        leatherSeats.setOptionName("Skóra");
        leatherSeats.setChoosen(true);
        leatherSeats.setOptionPrice(BigDecimal.valueOf(1.99));

        CarOption radio = new CarOption();
        radio.setOptionName("Radio");
        radio.setChoosen(true);
        radio.setOptionPrice(BigDecimal.valueOf(2.99));


        CarOption[] carOptions = new CarOption[]{radio, leatherSeats};
        car.setOptions(carOptions);

        car.setBasePrise(BigDecimal.valueOf(0.99));

        System.out.println(car.summaryPrice());
        System.out.println(car);
        System.out.println(car.toString());

    }

    private static BigDecimal summaryPrice (Car car){ // ta metoda jest w Car i tam sam obiekt car może zwrócić cenę ale tu też może być choć jest niepotrzebna
        BigDecimal finalPrice = car.getBasePrise();
        CarOption[] carOptions = car.getOptions();
        for (int i = 0; i < carOptions.length; i++) {
            finalPrice = finalPrice.add(carOptions[i].getOptionPrice());
        }
        return finalPrice;
    }

}

