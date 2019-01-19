package pl.sda.javastart.OwnExercise;

import static java.lang.Integer.max;

public class Logic2 {
    public static void main(String[] args) {

        System.out.println(makeBricks(2, 3, 13));
        System.out.println(noTeenSum(13, 15, 28));
        System.out.println(roundSum(23, 24, 25));
        System.out.println("WYDRUK METODY Z DWOMA INATMI RÓŻNYMI O JEDEN I TRZECIM INTEM RÓŻNYM O WIĘCEJ NIŻ JEDEN");
        System.out.println(closeFar(1, 1, 1));
        System.out.println(closeFar(6, 6, 6));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(10, 9, 8));
        System.out.println(closeFar(1, 2, 8));
        System.out.println(closeFar(3, 2, 8));
        System.out.println(closeFar(1, 4, 3));
        System.out.println(closeFar(1, 3, 4));
        System.out.println(closeFar(3, 1, 4));
        System.out.println(closeFar(4, 1, 3));
        System.out.println("WYDRUK METODY Z CZEKOLADĄ PO 1 I 5 KILO. TRZEBA ODLICZYĆ UŻYTE WARTOŚCI 1 KILO");
        System.out.println(makeChocolate(1, 3, 15));
        System.out.println(makeChocolate(8, 3, 19));
        System.out.println(makeChocolate(0, 3, 16));
    }

    /*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
     and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
      This is a little harder than it looks and can be done without any loops.   */
    public static boolean makeBricks(int small, int big, int goal) {
        int counter = 0;
        for (int i = 0; i < big; i++)
            if (counter + 5 <= goal) {
                counter = counter + 5;
            }

        for (int i = 0; i < small; i++) {
            if (counter + 1 <= goal) {
                counter = counter + 1;
            }
        }
        if (counter == goal) {
            return true;
        }

        return false;
    }

    /*Given 3 int values, a b c, return their sum. However,
    if one of the values is 13 then it does not count towards the sum and values to its right do not count.
     So for example, if b is 13, then both b and c do not count.   */
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    /*
Given 3 int values, a b c, return their sum. However, if any of the values is a teen
 -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
  Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed
   for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
   Define the helper below and at the same indent level as the main noTeenSum().  */
    public static int noTeenSum(int a, int b, int c) {
        int result = 0;
        result = result + fixTeen(a);

        result = result + fixTeen(b);

        result = result + fixTeen(c);

        return result;

    }

    public static int fixTeen(int n) {
        if (n > 12 && n < 20) {
            if (n == 15 || n == 16) return n;
            return 0;
        }
        return n;
    }


    /* For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
  so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
      so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.  */
    public static int roundSum(int a, int b, int c) {
        int result = 0;
        result = result + round10(a);
        result = result + round10(b);
        result = result + round10(c);
        return result;
    }

    public static int round10(int num) {
        if (num % 10 == 0) {
            return num;
        }
        if (num % 10 >= 5) {
            int restModulo = num % 10;
            restModulo = 10 - restModulo;
            return num + restModulo;
        } else if (num % 10 < 5) {
            int restModulo = num % 10;
            return num - restModulo;
        }
        return 0;
    }

    /*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
    while the other is "far", differing from both other values by 2 or more.
    Note: Math.abs(num) computes the absolute value of a number.   */
    public static boolean closeFar(int a, int b, int c) {
       /* int aAbs = Math.abs(a);
        int bAbs = Math.abs(b);
        int cAbs = Math.abs(c);

        if (aAbs == bAbs - 1 && bAbs + 2 <= cAbs) {
            return true;
        } else if (bAbs == cAbs - 1 && bAbs + 2 <= aAbs) {
            return true;
        } else if (cAbs == aAbs - 1 && cAbs + 2 <= bAbs) {
            return true;
        } else if (aAbs == bAbs + 1 && bAbs + 2 <= cAbs) {
            return true;
        } else if (bAbs == cAbs + 1 && bAbs + 2 <= aAbs) {
            return true;
        } else if (cAbs == aAbs + 1 && cAbs + 2 <= bAbs) {
            return true;
        } else if (aAbs == bAbs + 1 && bAbs - 2 >= cAbs) {
            return true;
        } else if (bAbs == cAbs + 1 && bAbs - 2 >= aAbs) {
            return true;
        } else if (cAbs == aAbs + 1 && cAbs - 2 >= bAbs) {
            return true;
        } else if (aAbs == bAbs - 1 && bAbs - 2 >= cAbs) {
            return true;
        } else if (bAbs == cAbs - 1 && bAbs - 2 >= aAbs) {
            return true;
        } else if (cAbs == aAbs - 1 && cAbs - 2 >= bAbs) {
            return true;
        }
        return false;TO MOJA PIERWSZA PRÓBA TOTALNA PORAŻKA INTELEKTUALNA, PODPRAŁEM SIĘ POMYSŁEM Z INTERNETU NIESTETY */
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return false;
        }

    }

    /* Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
 Return 0 if they both go over.   */
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }
        return 0;
    }

    /*
Given three ints, a b c, one of them is small, one is medium and one is large.
 Return true if the three values are evenly spaced, so the difference between small and medium is the same
  as the difference between medium and large.   */
    public static boolean evenlySpaced(int a, int b, int c) { // mój autorski kod, krótszy niż w sieci, ale co się nakombinowałem to moje
       if(Math.abs(a-b)==Math.abs(b-c)){
           if((Math.abs(a-b)) + (Math.abs(b-c))==Math.abs(a-c)){
               return true;
           }
       }if(Math.abs(a-c)==Math.abs(b-c)){
            if((Math.abs(a-c)) + (Math.abs(b-c))==Math.abs(a-b)){
                return true;
            }
        }if(Math.abs(a-b)==Math.abs(a-c)){
            if((Math.abs(a-b)) + (Math.abs(a-c))==Math.abs(b-c)){
                return true;
            }
        }
       return false; //poniżej kod z sieci, dłuższy ale ogólnie czytelnieszy i prostszy chyba
    /*int diff1 = 0;
    int diff2 = 0;
    int diff3 = 0;

    if(a==b && a ==c)
    return true;

    if(a == b || b == c || a == c)
    return false;

    diff1 = Math.abs(a - b);
    diff2 = Math.abs(a - c);
    diff3 = Math.abs(b - c);

    if(diff1 == diff2)
    return true;

    if(diff1 == diff3)
    return true;

    if(diff2 == diff3)
    return true;
    return false;
    */
    }

    /*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.    */
    public static int makeChocolate(int small, int big, int goal) {
        int counter = 0;
        int counterSmall = 0;
        for (int i = 0; i < big; i++)
            if (counter + 5 <= goal) {
                counter = counter + 5;
            }
        for (int i = 0; i < small; i++) {
            if (counter + 1 <= goal) {
                counterSmall = counterSmall + 1;
                counter = counter + 1;
            }
        }
        if (counter == goal) {
            return counterSmall;
        }
        return -1;

        /* int rem = goal % 5;    // TO JEST KOD Z NETU, KRÓTSZY ALE WYDAJE MI SIĘ MNIEJ CZYTELNY I TRUDNIEJSZY
              if (small + (big*5) < goal)
                return -1;
              else if (rem <= small && goal - big*5 > 4)
                return rem + 5;
              else if (rem <= small)
                return rem;
              else
                return -1;        */
    }

}

