package pl.sda.javastart.codingBatExercise;

import static java.lang.Math.abs;

public class WarmUp1 {
    public static void main(String[] args) {
        System.out.println("WYDRUK ZADANIA KIEDY IDZIESZ DO PRACY A KIEDY ŚPISZ.");
        System.out.println(sleepIn(true, false));
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z DWIEMA MAŁPAMI. POWINNO WYJŚĆ DWA RAZY TRUE I DWA RAZY FALSE");
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z DWIEMA LICZBAMI POWINNO WYJŚĆ 8 I 5");
        System.out.println(sumDouble(2, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z RÓŻNICĄ ABSOLUTNĄ");
     /*   System.out.println(diff21(36));
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(-8));*/
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z GADATLIWĄ PAPUGĄ POWINNO WYJŚĆ: FALSE,TRUE,TRUE,FALSE");
        System.out.println(parrotTrouble(true, 8));
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 21));
        System.out.println(parrotTrouble(false, 22));
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z DWIEMA LICZBAMI I PECHOWĄ 10, POWINNO WYJŚĆ FALSE,TRUE,TRUE,TRUE");
        System.out.println(makes10(3, 22));
        System.out.println(makes10(10, 10));
        System.out.println(makes10(5, 10));
        System.out.println(makes10(3, 7));
        System.out.println("\n");
        System.out.println("WYDRUK ZADANIA Z DWIEMA LICZBAMI MINUS I PLUS. pOWINNO WYJŚĆ ");
        System.out.println("POWINNO WYJŚĆ TRUE, TRUE,FALSE,FALSE,TRUE,FALSE");
        System.out.println(posNeg(-5, 7, true));
        System.out.println(posNeg(-5, 7, false));
        System.out.println(posNeg(5, 7, true));
        System.out.println(posNeg(5, 7, false));
        System.out.println(posNeg(-5, -7, true));
        System.out.println(posNeg(-5, -7, false));
        System.out.println("\n");
        System.out.println("WYDRUK METODY Z OBCIĘCIEM KOŃCÓWKI STRING");
        System.out.println(backAround("Dupa"));
        System.out.println("WYDRUK METODY Z OBCIĘCIEM początku STRINGA");
        System.out.println(front22("Dupa"));
        System.out.println(front22("D"));
        System.out.println("WYDRUK METODY Z HI");
        System.out.println(startHi("hiupa"));
        System.out.println(startHi("dupa"));
        System.out.println("WYDRUK METODY Z WYKASOWANIEM DEL W INDEKSACH 1:3");
        System.out.println(delDel("edelChar"));
        System.out.println(delDel("delChar"));
        System.out.println(delDel("Char"));
        System.out.println(delDel("de"));
        System.out.println("WYDRUK METODY Z SPRAWDZENIEM IX W INDEKSACH1:2");
        System.out.println(mixStart("pix"));
        System.out.println(mixStart("zixima"));
        System.out.println(mixStart("a"));
        System.out.println("WYDRUK METODY Z SPRAWDZENIEM OZ W INDEKSACH 0:1");
        System.out.println(startOz("od  "));
        System.out.println(startOz("ozone"));
        System.out.println(startOz("bzy"));
        System.out.println(startOz(""));
        System.out.println("WYDRUK METODY Z SPRAWDZENIEM INT MAX");
        System.out.println(intMax(15, 7, 18));
        System.out.println("WYDRUK METODY Z SPRAWDZENIEM CO JEST BLIŻEJ 10");
        System.out.println(close10(13, 7));
        System.out.println("WYDRUK METODY Z SPRAWDZENIEM CO CZY OSTATNIA CYFRA JEST TAKA SAMA W DWÓCH LICZBACH");
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return a * 2 + b * 2;
        }
        return a + b;
    }

    /*  Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.   */
  /*  public static int diff21(int n) { // nie rozumiem polecenia w tym zadaniu
        int diff21 = 21;
        if (n > 21) {
            return 0;
        }
        int value = abs(n);
        return diff21 - value;
    }*/

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7 || talking && hour > 20) {
            return true;
        }
        return false;
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    /*Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative"
    is true, then return true only if both are negative.*/
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) {
                return true;
            }
        }
        if (!negative) {
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                return true;
            }
        }
        return false;
    }

    /* Given a string, return a new string where "not " has been added to the front.
     However, if the string already begins with "not", return the string unchanged.
      Note: use .equals() to compare 2 strings.   */
    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

    /* Given a string, return a new string where the first and last chars have been exchanged.  */
    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        String front = str.substring(0,1);
        String end = str.substring(str.length()-1,str.length());
        String centre = str.substring(1,str.length()-1);
        return end+centre+front;
    }


    /*Given a string, take the last char and return a new string with the last char added at the front and back,
     so "cat" yields "tcatt". The original string will be length 1 or more.*/
    public static String backAround(String str) {
        String end = str.substring(str.length() - 1);
        return end + str + end;
    }

    /*Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator*/
    public static boolean or35(int n) {
        if (n % 5 == 0 || n % 3 == 0) {
            return true;
        }
        return false;
    }

    /*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
     so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.*/
    public static String front22(String str) {
        int lengthCheck = str.length();
        if (lengthCheck < 2) {
            return str + str + str;
        }
        String beginning = str.substring(0, 2);
        return beginning + str + beginning;
    }

    /*Given a string, return true if the string starts with "hi" and false otherwise.*/
    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String hiOrNot = str.substring(0, 2);
        if (hiOrNot.equals("hi")) {
            return true;
        }
        return false;
    }

    /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.*/
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100)) {
            return true;
        }
        return false;
    }

    /*Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/
    public boolean in1020(int a, int b) {
        if ((a > 9 && a < 21) || (b > 9 && b < 21)) {
            return true;
        }
        return false;
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
     return true if 1 or more of them are teen.*/
    public boolean hasTeen(int a, int b, int c) {
        if ((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
            return true;
        }
        return false;
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
    return true if one or the other is teen, but not both.*/
    public boolean loneTeen(int a, int b) {
        if ((a > 12 && a < 20) && (b > 12 && b < 20)) {
            return false;
        }
        if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
            return true;
        }
        return false;
    }

    /*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
 Otherwise, return the string unchanged.*/
    public static String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return (str.substring(0, 1) + str.substring(4));
        }
        return str;
    }

    /*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.*/
    public static boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;

    }

    /*Given a string, return a string made of the first 2 chars (if present), however include first char only if it
    is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". */
    public static String startOz(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals("oz")) {
            return "oz";
        }
        if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
            return "o";
        }
        if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
            return "z";
        }
        return "";
    }

    /*
Given three int values, a b c, return the largest. */
    public static int intMax(int a, int b, int c) {
        if (Integer.max(a, b) > Integer.max(b, c)) {
            return Integer.max(a, b);
        }
        return Integer.max(b, c);
    }

    /*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
     Note that Math.abs(n) returns the absolute value of a number. */
    public static int close10(int a, int b) {
        int aClose = Math.abs(a - 10);
        int bClose = Math.abs(b - 10);
        if (aClose == bClose) {
            return 0;
        } else if (aClose < bClose) {
            return a;
        }
        return b;
    }

    /*Given 2 int values, return true if they are both in the range 30..40 inclusive,
     or they are both in the range 40..50 inclusive. */
    public static boolean in3050(int a, int b) {
        if ((a > 29 && a < 41 && b > 29 && b < 41) || (a > 39 && a < 51 && b > 39 && b < 51)) {
            return true;
        }
        return false;
    }

    /* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     or return 0 if neither is in that range. */
    public static int max1020(int a, int b) {
        if ((a < 10 || a > 20) && (b < 10 || b > 20)) {
            return 0;
        }
        if ((a > 9 && a < 21) && (b > 9 && b < 21)) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if (a > 9 && a < 21) {
            return a;
        }
        return b;
    }

    /*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7. */
    public static boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    /*
Given an int n, return true if it is within 10 of 100 or 200.
 Note: Math.abs(num) computes the absolute value of a number.*/
    public boolean nearHundred(int n) {
        int nABS = Math.abs(n);
        if (n > 89 && n < 111 || n > 189 && n < 211) {
            return true;
        }
        return false;
    }

}





