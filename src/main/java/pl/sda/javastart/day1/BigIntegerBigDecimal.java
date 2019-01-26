package pl.sda.javastart.day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {


        System.out.println("Tu dodajemy dwa BigInteger");
        BigInteger big = new BigInteger("6786766866987868766");
        BigInteger bigger = new BigInteger("98565656454564868766");
        System.out.println(big.add(bigger));


        System.out.println("Tu odejmujemy dwa double(widać że odejmowanie na doublach daje mało dokładny wynik");
        double x = 0.02;
        double y = 0.03;
        double z;
        z = x - y;
        System.out.println(z);


        System.out.println("Tu odejmujemy dwa BigDecimel te same wartości co wyżej a wynik dokładny");
        BigDecimal small = new BigDecimal("0.02");
        BigDecimal smaller = new BigDecimal("0.03");
        System.out.println(small.subtract(smaller));


        System.out.println("Tu odejmujemy dwa BigDecimal, które zainicjowane są doublem(wartości jak wyżej) a nie Stringiem tak jak powinno być i wynik jest zły");
        BigDecimal bad = new BigDecimal(x);
        BigDecimal worse = new BigDecimal(y);
        System.out.println(bad.subtract(worse));


        System.out.println("Tu odejmujemy dwa BigDecimal, które zainicjowane są doublem(argumenty co wyżej) a nie Stringiem tak jak powinno być ale wynik jest dobry bo użyliśmy BigDecimal.valueOf");
        BigDecimal xxxx = BigDecimal.valueOf(x);
        BigDecimal yyyy = BigDecimal.valueOf(y);
        BigDecimal zzzz = xxxx.subtract(yyyy);

        System.out.println(zzzz);

    }
}
