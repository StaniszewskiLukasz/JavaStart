package pl.sda.javastart.day4.Homework;

public class WhetherEvenExercise29 {
    public static void main(String[] args) {
        System.out.println(evenTwoOrOne(3,8));
        System.out.println(evenTwoOrOne(4,8));
    }

    public static boolean evenTwoOrOne(int one,int two){ // metoda sprawdza czy obie zmienne są parzyste
        if(one%2==0 && two%2==0){
            return true;
        }
        return false;
    }

}
