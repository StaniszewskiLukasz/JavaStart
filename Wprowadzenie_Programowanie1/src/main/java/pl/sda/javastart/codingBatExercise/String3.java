package pl.sda.javastart.codingBatExercise;

public class String3 {

    public static void main(String[] args) {
        System.out.println("METODA LICZY ILE RAZY NA KOŃCU WYRAZÓW ZNAJDZEI SIĘ Y LUB Z:");
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println("METODA ZE JEDNEGO STRINGA WYRZUCA ZNAKI TREŚĆ ZAWARTĄ W DRUGIM STRINGU:");
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
        System.out.println("METODA SPRAWDZA CZY ILOŚĆ NOT JEST TAKA SAMA JAK IS:");
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
        System.out.println("METODA SPRAWDZA CZY WYSTĘPUJE W TEKŚCIE G I CZY PO NIM LUB PRZED NIM WYSTĘPUJE INNE G: T, F, F,");
//        System.out.println(gHappy("xxggxx"));
//        System.out.println(gHappy("xxgxx"));
//        System.out.println(gHappy("xxggyygxx"));
        System.out.println("METODA SPRAWDZA CZY WYSTĘPUJE W TEKŚCIE CYFRA I JE ZLICZA");
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
        System.out.println("METODA ZWRACA STRING JEŚLI ORYGINALNY STRING MA POCZĄTKU MA WARTOŚC KTÓRA NA JEGO KOŃCU JEST W POSTACI LUSTRZANEGO ODBICIA");
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
        System.out.println("METODA ZWRACA INT Z NAJWIĘKSZĄ LICZBĄ POWTARZAJĄCEGO SIĘ W STRING CHAR Z RZĘDU: 3, 4, 0 ");
        System.out.println(maxBlock("XXBBBbbxx"));
        System.out.println(maxBlock("XXBBBbbxxXXXX"));
        System.out.println(maxBlock(""));
        System.out.println("METODA ZWRACA SUMĘ LICZB ZAWARTYCH W STRINGU: 123, 44, 18, 7 ");
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
        System.out.println(sumNumbers("5$$1;;1!!"));
        System.out.println("METODA DODAJE DO TEKSTU \"NOT\" JEŚLI W STRING WYSTĘPUJE \"IS\" NIE SKLEPJONE Z INNYMI CHAR");
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
        System.out.println(notReplace("This is right issue islam"));
    }

    /*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
 but not the 'y' in "yellow" (not case sensitive).
  We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
  (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)   */
    public static int countYZ(String str) {
        String strEvo = str.toLowerCase(); // zmienia litery na małe
        int counter = 0;
        for (int i = 0; i < strEvo.length(); i++) {
            if (strEvo.charAt(i) == 'y' || strEvo.charAt(i) == 'z') { //  sprawdza czy występuje y lub z
                if (i == str.length() - 1) {
                    counter++;
                    break;
                } else if (!Character.isLetter(strEvo.charAt(i + 1))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /*
Given two strings, base and remove,
return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".    */
    public static String withoutString(String base, String remove) {
        int baseLen = base.length();
        int removeLen = remove.length();
        String lowBase = base.toLowerCase();
        String lowRemove = remove.toLowerCase();
        String resultString = "";

        for (int i = 0; i < baseLen; i++) {
            if (i <= baseLen - removeLen) {
                String comparative = lowBase.substring(i, i + removeLen); // String aktualny do porównania z remove
                if (!comparative.equals(lowRemove)) // porównanie
                    resultString = resultString + base.substring(i, i + 1); // jeśli inny to aktualny Char trafia do result
                else {
                    i = i + removeLen - 1; // jeśli taki sam to char omijamy i podbijamy "i" by dalej nie sprawdzać i nie fałszować wyniku
                }
            } else {
                String comparative2 = lowBase.substring(i, i + 1); // zabezpieczenie przed przekroczeniem dłuości tablicy
                if (!comparative2.equals(lowRemove))
                    resultString = resultString + base.substring(i, i + 1);
            }
        }
        return resultString;
    }

    /* Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
     of appearances of "not" anywhere in the string (case sensitive).   */
    public static boolean equalIsNot(String str) {
      /*  String isSearch = "is"; // to jest mój sposób z dwoma pętlami ale poniżej podpatrzony bardzo podobny ale oparta na ifach a nie na petlach
        String notSearch = "not";

        int strLen = str.length();
        int counterNot = 0;
        int counterIs = 0;
        for (int i = 0; i <= strLen - 3; i++) {
            String comparativeNot = str.substring(i, i + 3);
            if (comparativeNot.equals(notSearch)) {
                counterNot++;
            }
        }
        for (int i = 0; i <= strLen - 2; i++) {
            String comparativeIs = str.substring(i, i + 2);
            if (comparativeIs.equals(isSearch)) {
                counterIs++;
            }
        }
        if (counterIs == counterNot) {
            return true;
        }
        return false;*/


        String isSearch = "is"; // to podpatrzony sposób oparty na ifach ma za to o dwie pętle mniej
        String notSearch = "not";
        int strLen = str.length();
        int counterNot = 0;
        int counterIs = 0;

        for (int i = 0; i <= strLen; i++) {
            if (i <= strLen - 3) {
                String comparativeNot = str.substring(i, i + 3);
                if (comparativeNot.equals(notSearch)) {
                    counterNot++;
                }
            }
            if (i <= strLen - 2) {
                String comparativeIs = str.substring(i, i + 2);
                if (comparativeIs.equals(isSearch)) {
                    counterIs++;
                }
            }
        }
        if (counterIs == counterNot) {
            return true;
        }
        return false;
    }

    /* We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    Return true if all the g's in the given string are happy.    */
  /*  public static boolean gHappy(String str) { // instrukcja zadania jest błędna mówi że g ma być po lewo LUB po prawo a może być i po lewo i po prawo


        char gSearch = 'g';
        boolean happy = false;
        for (int i = 0; i < str.length(); i++) {
            char previousChar = str.charAt(i-1);
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (currentChar == gSearch) {
                if (previousChar == gSearch || nextChar == gSearch) {
                    happy = true;
                } else {
                    happy = false;
                }
            }
        }
        return happy;



    }*/

    /*  We'll say that a "triple" in a string is a char appearing three times in a row.
     Return the number of triples in the given string. The triples may overlap.  */
    public int countTriple(String str) {
        String strLow = str.toLowerCase();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() < 3) {
                return 0;
            }
            if (i < str.length() - 2) {
                char currentChar = strLow.charAt(i);
                if (currentChar == strLow.charAt(i + 1) && currentChar == strLow.charAt(i + 2)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /* Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
     Return 0 if there are no digits in the string.
      (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
      Integer.parseInt(string) converts a string to an int.)   */
    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                String digit = "" + currentChar;
                int value = Integer.parseInt(digit);
                sum = sum + value;
            }
        }
        return sum;
    }

    /*   Given a string,
    return the longest substring that appears at both the beginning and end of the string without overlapping.
     For example, sameEnds("abXab") is "ab".      */
   /* public String sameEnds(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.length() - 1 - i) {
                String result = "" +
            }
        }
    }*/


    /* Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string,
    and at the very end of the string in reverse order (possibly overlapping).
    For example, the string "abXYZba" has the mirror end "ab".  */
    public static String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                result = result + string.charAt(i);
            } else {
                break;
            }
        }
        return result;
    }

    /* Given a string, return the length of the largest "block" in the string.
     A block is a run of adjacent chars that are the same.  */
    public static int maxBlock(String str) {
        int counter1 = 1;
        int counter2 = 0;
        if (str.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter1 = counter1 + 1;
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                if (counter2 > counter1) {
                    counter1 = 1;
                } else {
                    counter2 = counter1;
                    counter1 = 1;
                }
            }
        }
        if (counter1 > counter2) {
            counter2 = counter1;
        }
        return counter2;
    }

    /*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 A number is a series of 1 or more digit chars in a row.
  (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
   Integer.parseInt(string) converts a string to an int.)   */
    public static int sumNumbers(String str) {
        String number = ""; // kod zbyt długi, sekwencje się powtarzają więc jest do poprawienia logika działania
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                number = number + currentChar;
            } else {
                if (number.length() > 0) {
                    int value = Integer.parseInt(number);
                    number = "";
                    sum = sum + value;
                }
            }
        }
        if (number.length() > 0) {
            int value = Integer.parseInt(number);
            sum = sum + value;
        }
        return sum;
    }

    /* Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
     The word "is" should not be immediately preceeded or followed by a letter
      -- so for example the "is" in "this" does not count.
      (Note: Character.isLetter(char) tests if a char is a letter.) */
    public static String notReplace(String str) {
        String result = "";
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))
                    || i+2 < len && Character.isLetter(str.charAt(i+2))) {
                result += str.charAt(i);
            }
    else if(i+1 < len && str.substring(i, i+2).equals("is")) {
                result += "is not";
                i++;
            }
    else result += str.charAt(i);
        }
        return result;




        /* String resultString = "";
        String pasteString = "is not ";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if ('i' == str.charAt(i) && 's' == str.charAt(i + 1) && !Character.isLetter(i + 2)) {
                    resultString = resultString + pasteString;
                    i = i + 2;
                } else {
                    resultString = resultString + str.charAt(i);
                }
            } else if (i == str.length() - 2) {
                if ('i' == str.charAt(i) && 's' == str.charAt(i + 1) && !Character.isLetter(str.charAt(i - 1))) {
                    resultString = resultString + pasteString;
                } else {
                    resultString = resultString + str.charAt(i);
                }
            } else if (i > str.length() - 2) {
                resultString = resultString + str.charAt(i);
            } else if ('i' == str.charAt(i) && 's' == str.charAt(i + 1) && !Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
                resultString = resultString + pasteString;
                i = i + 2;
            } else {
                resultString = resultString + str.charAt(i);
            }
        }
        return resultString;*/
    }
}







