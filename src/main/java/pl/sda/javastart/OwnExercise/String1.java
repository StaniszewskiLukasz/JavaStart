package pl.sda.javastart.OwnExercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String1 {
    public static void main(String[] args) {
        System.out.println("METODA ZE ZWRACANIEM DWÓCH OSTATNICH STRINGÓW X 3:");
        System.out.println(extraEnd("Ku"));
        System.out.println(extraEnd("Kupadup"));
        System.out.println("METODA ZE ZWRACANIEM PIERWSZEJ POŁOWY STRINGA:");
        System.out.println(firstHalf("Kupa"));
        System.out.println(firstHalf("Ku"));
        System.out.println(firstHalf("KupaWdupaI"));
        System.out.println("METODA ZE ZWRACANIEM KRÓTKI-DŁUGI-KRÓTKI:");
        System.out.println(comboString("Kupa", "Duuppa"));
        System.out.println(comboString("Duuppa", "Kupa"));
        System.out.println("METODA ZE ZWRACANIEM DWÓCH ŚRODKOWYCH STRINGÓW:");
        System.out.println(middleTwo("DU"));
        System.out.println("METODA ZE ZWRACANIEM TRZECH ŚRODKOWYCH STRINGÓW ZE STRINGA NIEPARZYSTEGO:");
        System.out.println(middleThree("Kra"));
        System.out.println(middleThree("SraTa"));
        System.out.println("METODA ZE ZWRACANIEM DWÓCH POŁĄCZONYCH STRINGÓW BEZ POWTARZAJĄCYCH SIĘ ZNAKÓW:");
        System.out.println(conCat("cat", "tac"));
        System.out.println("METODA ZE ZWRACANIEM DWÓCH OSTATNICH STRINGÓW ZAMIENIONYCH MIEJSCAMI:");
        System.out.println(lastTwo("abc"));
        System.out.println(lastTwo("a"));
        System.out.println(lastTwo("abcd"));
    }

    /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2. */
    public static String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);

    }

    /*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
     If the string is shorter than length 2, return whatever there is, so "X" yields "X",
      and the empty string "" yields the empty string "". Note that str.length() returns the length of a string. */
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". */
    public static String firstHalf(String str) {
        return str.substring(0, (str.length() / 2));
    }

    /*Given 2 strings, a and b, return a string of the form short+long+short,
     with the shorter string on the outside and the longer string on the inside.
      The strings will not be the same length, but they may be empty (length 0). */
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    /*Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty. */
    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {

        if (str.length() > 0 && str.length() < 2) {
            return "";
        }
        if (str.length() == 0) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    /*Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     The string length will be at least 2. */
    public static String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    /*Given a string and an index, return a string length 2 starting at the given index.
    If the index is too big or too small to define a string length 2, use the first 2 chars.
    The string length will be at least 2. */
    public static String twoChar(String str, int index) {
        if (index < 0) {
            return str.substring(0, 2);
        }
        if (str.length() < index + 2) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    /*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3. */
    public static String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
     "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings. */
    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else if (str.startsWith("bad")) {
            return true;
        }
        if (str.length() > 3) {
            if (str.startsWith("bad", 1)) {
                return true;
            }
        }
        return false;
    }

    /*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat". */
    public static String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a + b;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) { //porównuje ostatniego chara ze Stringa "a" z pierwszym charem ze sStringa"b"
            return a.substring(0, a.length() - 1) + b; //jeśli w poprzedniej lini wynik jest pozytywny czyli są takie same ucina ostatniego chara ze Stringa"a"
        }
        return a + b;
    }

    /*Given a string of any length, return a new string where the last 2 chars, if present,
    are swapped, so "coding" yields "codign". */
    public static String lastTwo(String str) { // zamienia dwa ostatnie chary miejscami
        if (str.length() < 2) {
            return str;
        } else if (str.length() > 1) {
            char last = str.charAt(str.length() - 1);
            char preLast = str.charAt(str.length() - 2);
            return str.substring(0, str.length() - 2) + last + preLast;
        }
        return null;
    }

    /*Given a string, if the string begins with "red" or "blue" return that color string,
     otherwise return the empty string.  */
    public String seeColor(String str) { // sprawdza czy na początku podanego stringa występuje słowo red lub blue
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    /*Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".  */
    public boolean frontAgain(String str) { // porównuje czy dwa pierwsze chary są takie same jak dwa ostatnie
        if (str.length() < 2) {
            return false;
        } else if (str.length() < 4) {
            return true;
        } else if ((str.charAt(0) == str.charAt(str.length() - 2)) && (str.charAt(1) == str.charAt(str.length() - 1))) {
            return true;
        }
        return false;
    }

    /*Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string so it is the same length
     as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.  */
    public String minCat(String a, String b) {
        return null;
    }

    /*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.  */
    public String extraFront(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.length() < 2) {
            return str + str + str;
    }
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }


}


