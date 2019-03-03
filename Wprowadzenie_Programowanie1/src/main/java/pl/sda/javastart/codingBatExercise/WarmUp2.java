package pl.sda.javastart.codingBatExercise;

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
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxx"));
        System.out.println("METODA TWORZY NOWEGO STRINGA Z CHARÓW NIEPARZYSTYCH");
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println("METODA TWORZY NOWEGO STRINGA Z CHARÓW AKTUALNY + 1: \"CCoCodCode\"");
        System.out.println(stringSplosion("Code"));
        System.out.println("METODA SPRAWDZA ILE RAZY WYSTĘPUJE 9 W PIERWSZYCH 4 INDEXACH");
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println("METODA SPRAWDZA CZY WYSTĘPUJE W TABLICY CIĄG LICB 1,2,3");
        System.out.println(array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(array123(new int[]{2, 6, 5, 1}));
        System.out.println("METODA SPRAWDZA ILE RAZY WYSTĘPUJE W DWÓCH STRINGACH TAKI SAM CIĄG DWÓCH ZNAKÓW");
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        System.out.println("METODA LIKWIDUJE WSZYSTKIE X W TEKŚCIE POZA PIERWSZYM I OSTATNIM INDEXEM");
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
        System.out.println("METODA ZWRACA STRINGA Z CHARÓW O WYBRANYCH INDEXACH,0 I 1, 4 I 5, 8 I 9 ");
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println("METODA ZWRACA STRINGA BEZ CIĄGU ZNAKÓW Y(COŚ TAM)K:");
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
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
    static boolean doubleX(String str) {

    /* int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx"); */

        for (int i = 0; i < str.length(); i++) { // to jest moja metoda działająca. powyżej wzięta z solutions
            if (str.charAt(i) == 'x') {
                if (i == str.length() - 1) {
                    return false;
                }
            }
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    /* Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". */
    public static String stringBits(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String bits = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            if (i > 0) {
                if (i % 2 == 0) {
                    bits = bits + str.charAt(i);
                }
            }
        }
        return bits;
 /*String result = ""; // TO JEST KOD Z SOLUTIONS JEST LEPSZY BO KRÓTSZY
  // Note: the loop increments i by 2
  for (int i=0; i<str.length(); i+=2) {
    result = result + str.substring(i, i+1);
    // Alternately could use str.charAt(i)
  }
  return result;*/
    }


    /* Given a non-empty string like "Code" return a string like "CCoCodCode".  */
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i);
        }
        return result + str;
    }

    /* Given an array of ints, return the number of 9's in the array.  */
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

    /*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     The array length may be less than 4.  */
    public static boolean arrayFront9(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /* Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.  */
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    /*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
and "az" substrings appear in the same place in both strings.  */
    public static int stringMatch(String a, String b) {
        int counter = 0;
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    counter++;
                }
            }
        } else {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    counter++;
                }
            }
        }
        return counter;

       /* // Figure which string is shorter. // to zapis z internetu krótszy o dwie linie i ma jednego ifa a nie dwa. Warto podpatrzeć
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }*/
    }

    /* Given a string, return a version where all the "x" have been removed.
     Except an "x" at the very start or end should not be removed.  */
    public static String stringX(String str) {
        if (str.length() < 2) {
            return str;
        }
        String result = str.substring(0, 1) + str.substring(1, str.length() - 1).replaceAll("x", "") + str.substring(str.length() - 1);
        return result;
    }

    /* Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".  */
    public static String altPairs(String str) {//kod ściągnięty z solutions, nie mogłem wymyślić dobreo obejścia nieparzystej liczby char
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length(); // jeśli string będzie miał nieparzystą liczbę char/indexów to ta linia to wychwyci
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    /*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
 but the "a" can be any char. The "yak" strings will not overlap.    */
    public static String stringYak(String str) { //fixme
        String result = "";
        for (int i = 0; i < str.length(); i = i + 3) {
            int endSub = i + 3;
            if (endSub > str.length() - 1) {
                endSub = str.length() - 2;
            }
            if (str.substring(i, endSub - 2).equals("y") && str.substring(endSub - 1, endSub).equals("k")) {

            } else {
                result = result + str.substring(i, i + 3);
            }
        }
        return result;
    }

    /*
Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.   */
    public static int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }

    /* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
     Return true if the array does not contain any triples.  */
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i <nums.length-2 ; i++) {
            int value = nums[i];
            if(nums[i]==value && nums[i+1]==value && nums[i+2]==value){
                return false;
            }
        }
        return true;
    }
}

