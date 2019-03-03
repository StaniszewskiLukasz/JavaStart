package pl.sda.javastart.day10;

public class FirstValue {

    public static void main(String[] args) {
        System.out.println("METODA SPRAWDZAJĄCA LICZBĘ PIERWSZĄ");
        System.out.println(firstValue(15));
        System.out.println(firstValue(8));
    }

    public static boolean firstValue(int a){
       if( a < 2){
           return false;
       }
        for (int i = 2; i <=a/2 ; i++) { // jeśli tu zrobimy dzilenie przez dwa to ograniczymy ilośc operacji a
            if(a%i==0){
                return false;
            }else return true;
        }
        return true;
    }
}
