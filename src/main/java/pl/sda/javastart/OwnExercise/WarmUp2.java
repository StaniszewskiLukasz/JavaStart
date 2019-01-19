package pl.sda.javastart.OwnExercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WarmUp2 {
    public static void main(String[] args) {
        System.out.println("METODA KOPIUJE STR WSKAZANĄ ILOŚĆ RAZY N");
        System.out.println(stringTimes("Hi", 0));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 5));
        System.out.println("METODA KOPIUJE STR WSKAZANĄ ILOŚĆ RAZY N");
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("A", 3));
        System.out.println("METODA LICZY ILE RAZY JEST XX");
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
        System.out.println("METODA SPRAWDZA CZY PO X POJAWIA SIĘ KOLEJNY X : T, F, T");
      /*  System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxx"));*/ //fixme
    }


    /* Given a string and a non-negative int n, return a larger string that is n copies of the original string.  */
    public static String stringTimes(String str, int n) {
        String result;
        result = str;
        if (n == 0) {
            return "";
        }
        for (int i = 0; i < n - 1; i++) {
            result = result + str;
        }
        return result;
    }

    /* Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     or whatever is there if the string is less than length 3. Return n copies of the front;   */
    public static String frontTimes(String str, int n) {
        int firstThree = 3;
        if (str.length() < 3) {
            firstThree = str.length();
        }
        String working = str.substring(0, firstThree);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + working;
        }
        return result;
    }

    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx"*/
    static int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".*/
    /*static boolean doubleX(String str) { //fixme
        if (!str.contains("x")) {
            return false;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i).equals("x") && str.substring(i+1).equals("x")) {
                return true;
            }
        }
        return true;
    }*/
}
