package pl.sda.javastart.day1;

import java.util.Date;

public class Main {
    public static void/*"nic nie zwraca, oznacza"nicość"*/ main(String[] args) {/*sygnatura metody*/
        System.out.println("Hello World!");
        Date date = new Date();
        System.out.println(date.toString());
        int/*to jest typ prosty*/ number = 100;
        System.out.println("Liczba " + number); // Tu występuje konkatenacja
        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + 2);
        System.out.println("a" + "b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + 'b' + 3);
        System.out.println('b' + 3 + "a");
        System.out.println(9 % 4);
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);//zamienił to na string i skleił cyfry
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8); //najpierw mnozy
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); //najpier dzieli bo mnożenie i dzielenie jest przemienne

        System.out.println("Adam");
        System.out.println("Marek");
        System.out.println("Anna");

        System.out.println("Adam\nMarek\nAnna");
        System.out.println("\\Adam\nMarek\nAnna"); //
        System.out.println("\\Adam\nMarek\nAnna");
        System.out.println("Adam" + 4 + false);

        // operator & znaczy "i" sprawdza oba warunki, ale wynik musi być dobry w obu by było true
        /* operator && sprawdza dopóki nie napotka na pierwszy fałszywy wtedy przerywa i robi false ,jeden element jest
        niewłaściwy i robi false dupa*/

        // operator | wystarczy by jeden warunek był true i wynik jest true, sprawdza oba waunki
        /* operator || wystarczy by jeden warunek był true i wynik jest true, sprawdza do pierwszego true wtedy przerywa
        dalsze sprawdzanie  */

        System.out.println(false == false);
        System.out.println(false != true);
        System.out.println(!true);
        System.out.println(2 > 4);
        System.out.println(3 < 5);
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2 + 4) > (1 + 3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos" == "cos");
        System.out.println("cos" == new String("cos)"));


    }
}
