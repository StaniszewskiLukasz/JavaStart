package pl.sda.javastart.OwnExercise;

import static java.lang.Math.abs;

public class Logic1 {
    public static void main(String[] args) {
        System.out.println("WYNIK METODY Z CYGARAMI POWINNO WYJŚC: FALSE, FALSE, TRUE, TRUE, FALSE, TRUE ");
        System.out.println(cigarParty(28, false));
        System.out.println(cigarParty(28, true));
        System.out.println(cigarParty(42, false));
        System.out.println(cigarParty(42, true));
        System.out.println(cigarParty(62, false));
        System.out.println(cigarParty(62, true));
        System.out.println("WYNIK METODY Z ZABAWĄ WIEWIÓREK WYNIK: FALSE, FALSE, TRUE,TRUE, FALSE, TRUE, FALSE, FALSE");
        System.out.println(squirrelPlay(55, false));
        System.out.println(squirrelPlay(55, true));
        System.out.println(squirrelPlay(70, false));
        System.out.println(squirrelPlay(70, true));
        System.out.println(squirrelPlay(95, false));
        System.out.println(squirrelPlay(95, true));
        System.out.println(squirrelPlay(105, false));
        System.out.println(squirrelPlay(105, true));
        System.out.println("WYNIK METODY MANDAT: JEST DOBRZE SPRAWDZAŁEM W BatCode");
        System.out.println(caughtSpeeding(55, true));
        System.out.println(caughtSpeeding(55, false));
        System.out.println(caughtSpeeding(64, true));
        System.out.println(caughtSpeeding(64, false));
        System.out.println(caughtSpeeding(67, true));
        System.out.println(caughtSpeeding(67, false));
        System.out.println(caughtSpeeding(82, true));
        System.out.println(caughtSpeeding(82, false));
        System.out.println("WYNIK METODY SUMOWANIE Z WYJATKIEM PRZEDZIAŁU 10-20: 9, 20, 22 ");
        System.out.println(sortaSum(3, 6));
        System.out.println(sortaSum(3, 8));
        System.out.println(sortaSum(10, 12));
        System.out.println("WYNIK METODY Z BUDZIKIEM: off , 7:00 , 10:00  ");
        System.out.println(alarmClock(0, true));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(6, false));
        System.out.println("WYNIK METODY Z WSPANIAŁĄ LICZBĄ 6: FALSE , TRUE , TRUE, FALSE, TRUE, TRUE, TRUE  ");
        System.out.println(love6(3, 2));
        System.out.println(love6(6, 2));
        System.out.println(love6(2, 6));
        System.out.println(love6(6, 6));
        System.out.println(love6(3, 3));
        System.out.println(love6(8, 2));
        System.out.println(love6(2, 8));
        System.out.println("WYNIK METODY 1 TO 10: FALSE, TRUE, FALSE, TRUE, TRUE, FALSE, TRUE ");
        System.out.println(in1To10(0, false));
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(12, false));
        System.out.println(in1To10(0, true));
        System.out.println(in1To10(1, true));
        System.out.println(in1To10(5, true));
        System.out.println(in1To10(12, true));
        System.out.println("WYNIK METODY Z 11: FALSE, TRUE, TRUE  ");
        System.out.println(specialEleven(7));
        System.out.println(specialEleven(11));
        System.out.println(specialEleven(33));
        System.out.println(specialEleven(45));
        System.out.println("WYNIK METODY Z 20: FALSE, TRUE, TRUE  ");
        System.out.println(more20(20));
        System.out.println(more20(41));
        System.out.println(more20(62));
        System.out.println("WYNIK METODY Z WIELOKROTNOŚCIĄ 3 I 5: TRUE, TRUE, FALSE  ");
        System.out.println(old35(20));
        System.out.println(old35(9));
        System.out.println(old35(15));
        System.out.println("WYNIK METODY Z 3 i 5 i !: FizzBuzz, Fizz, 2! ");
        System.out.println(fizzString2(15));
        System.out.println(fizzString2(9));
        System.out.println(fizzString2(2));
        System.out.println("WYNIK METODY Z DODAWANIEM DWÓCH INT BY UZYSKAĆ TRZECI: TRUE, FALSE, FALSE ");
        System.out.println(twoAsOne(3, 3, 0));
        System.out.println(twoAsOne(3, 3, 2));
        System.out.println(twoAsOne(5, 3, -3));
        System.out.println("WYNIK METODY ZE SPRAWDZANIEM PODOBIEŃSTWA CYFR W TRZECH LICZBACH: TRUE, TRUE, TRUE ");
        System.out.println(lastDigit(23, 33, 11));
        System.out.println(lastDigit(15, 5, 30));
        System.out.println(lastDigit(5, 5, -7));
        System.out.println("WYNIK METODY Z RÓŻNICĄ KTÓRA MA BYĆ WIĘKSZA NIŻ 10: TRUE, TRUE, TRUE ");
        System.out.println(lessBy10(2, 20, 5));
        System.out.println(lessBy10(11, 1, 7));
        System.out.println(lessBy10(1, 15, -12));

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars > 39 & cigars < 61) & !isWeekend | cigars > 39 & isWeekend) {
            return true;
        }
        return false;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if ((temp > 59 & temp < 91) & !isSummer | (temp > 59 & temp < 101) & isSummer) {
            return true;
        }
        return false;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed > 60 & speed < 81) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (isBirthday) {
                if (speed <= 65) {
                    return 0;
                } else if (speed > 65 & speed < 86) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 0;
    }

    public static int sortaSum(int a, int b) {
        if ((a + b) > 9 & (a + b) < 20) {
            return 20;
        }
        return a + b;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day > 0 & day < 6) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (!vacation) {

                if (day > 0 & day < 6) {
                    return "7:00";
                } else {
                    return "10:00";
                }
            }
        }
        return "wyjątek";
    }

    public static boolean love6(int a, int b) {
        int x = 6;
        if (a + b == 6) {
            return true;
        } else if (a - b == abs(x)) {
            return true;
        } else if (b - a == abs(x)) {
            return true;
        } else if ((a == 6 || b == 6) | (a != 6 & b == 6)) {
            return true;
        }
        return false;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            if (n > 0 & n < 11) {
                return true;
            } else {
                return false;
            }
        } else if (outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean specialEleven(int n) {
        if ((n % 11 == 0) | (n % 11 == 1)) {
            return true;
        }
        return false;
    }

    public static boolean more20(int n) {
        if ((n % 20 == 1) | (n % 20 == 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean old35(int n) {
        if ((n % 3 == 0) & (n % 5 == 0)) {
            return false;
        } else if ((n % 3 == 0) || (n % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean less20(int n) { // ten kod nie jest uruchamiany w metodzie main. Wynik jest pozytywny w CodingBat
        if ((n % 20 == 18) | (n % 20 == 19)) {
            return true;
        } else {
            return false;
        }
    }

    public int teenSum(int a, int b) { //ten kod nie jest uruchamiany w metodzie main. Wynik jest pozytywny w CodingBat
        if ((a > 12 & a < 20) | (b > 12 & b < 20)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) { //ten kod nie jest uruchamiany w metodzie main. Wynik jest pozytywny w CodingBat
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) {
            return false;
        }
        return true;
    }

    public int teaParty(int tea, int candy) { //ten kod nie jest uruchamiany w metodzie main. Wynik jest pozytywny w CodingBat
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= (candy * 2) || candy >= (tea * 2)) {
            return 2;
        } else {
            return 1;
        }
    }

    /*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.*/
    public static String fizzString(String str) { //ten kod nie jest uruchamiany w main. Wynik jest ok w CodingBat
        if (str.startsWith("f") & str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else {
            return str;
        }
    }

    /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz",
     and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division,
     so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
     */
    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    /*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.*/
    public static boolean twoAsOne(int a, int b, int c) {
        if ((a + b) == c) {
            return true;
        } else if ((a + c) == b) {
            return true;
        } else if ((b + c) == a) {
            return true;
        } else {
            return false;
        }
    }

    /*Given three ints, a b c, return true if b is greater than a, and c is greater than b. However,
     with the exception that if "bOk" is true, b does not need to be greater than a.
      */
    public static boolean inOrder(int a, int b, int c, boolean bOk) { //ten kod nie jest uruchamiany w main. Wynik jest ok w CodingBat
        if (!bOk) {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (bOk) {
                if (c > b) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /*Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7,
     but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed,
     such as 5 5 7 or 5 5 5. */
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {//ten kod nie jest uruchamiany w main. Wynik jest ok w CodingBat
        if (!equalOk) {
            if (b > a && c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (equalOk) {
                if (b >= a && c >= b) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit.
     The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. */
    public static boolean lastDigit(int a, int b, int c) {
        /*tutaj rozumiem działania matamatycznego jakie zostało wykonane ale powtórzyć trzeba!!!!!*/
        int an = a % 10;
        int bn = b % 10;
        int cn = c % 10;

        if (an == bn || an == cn || bn == cn) {
            return true;
        }
        return false;
    }

    /*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.*/
    public static boolean lessBy10(int a, int b, int c) {
        int x;
        int y;
        int z;
        x = a - b;
        y = a - c;
        z = b - c;
        x = abs(x);
        y = abs(y);
        z = abs(z);
        if (x >= 10 || y >= 10 || z >= 10) {
            return true;
        }
        return false;
    }

    /* Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true,
     if the two dice show the same value, increment one die to the next value,
      wrapping around to 1 if its value was 6.*/
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = 0;
        if (noDoubles) {
            if ((die1 == 6) && (die2 == 6)) {
                return sum = 1 + die2;
            } else if (die1 == die2) {
                return sum = (die1 + 1) + die2;
            }
        }
        return sum = die1 + die2;
    }

    /*
Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5,
then the return the smaller value. However, in all cases, if the two values are the same,
return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.*/
    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
        } else if (a > b) {
            return a;
        }
        return b;
    }

    /*  You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
    If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
     Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0. */
    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && a == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    /*You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
     the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
      the result is 10.*/
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }

    /*You have a blue lottery ticket, with ints a, b, and c on it.
    This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
    If any pair sums to exactly 10, the result is 10.
    Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0. */
    public int blueTicket(int a, int b, int c) {
        int y = a + b;
        int x = a + c;
        int z = b + c;
        if (y == 10 || x == 10 || z == 10) {
            return 10;
        } else if (y == x + 10 || y == z + 10) {
            return 5;
        }
        return 0;
    }

    /*Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
    such as the 2 in 12 and 23.
    (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.) */
    public static boolean shareDigit(int a, int b) {
        if ((a % 10 == b % 10) || (a / 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b / 10)) {
            return true;
        }
        return false;
    }


    /*Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
    If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of
     a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)*/
    public static int sumLimit(int a, int b) {
        String aS = Integer.toString(a+b);
        String bS = Integer.toString(a);
        if(aS.length()==bS.length()){
            return a+b;
        }
        return a;
    }


}

