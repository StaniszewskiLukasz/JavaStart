package pl.sda.javastart.codingBatExercise;

public class String2 {
    public static void main(String[] args) {
        System.out.println("ZWRACA WYNIK METODY SZUKAJĄCEJ ILOŚCI \"hi\" W DANYM STRINGU: WYNIK 5");
        System.out.println(countHi("Policzhiwhimądralohihihi"));
        System.out.println("ZWRACA WYNIK METODY PORÓWNUJĄCEJ ILOŚĆ \"catDog\" W DANYM STRINGU: WYNIK 1,1,2");
        System.out.println(catDog("dcat"));
        System.out.println(catDog("tdhushidodog"));
        System.out.println(catDog("dodjdyejfcatjddog"));
        System.out.println("ZWRACA WYNIK METODY PORÓWNUJĄCEJ ILOŚĆ \"co\"\"e\" W DANYM STRINGU: WYNIK 1,1,2");
        System.out.println(countCode("codjskicoje"));
        System.out.println(countCode("njbhbcodj ninicode"));
        System.out.println(countCode("bunimcodecole"));
        System.out.println("ZWRACA WYNIK METODY PORÓWNUJĄCEJ KONIEC STRINGA CZY WYSTĘPUJE TA ABC BEZ WZGLĘDU NA WIELKOŚĆ");
        System.out.println(endOther("JDKSHjdhA1H", "nsindSBISNA1h"));
        System.out.println(endOther("obubiuBUIUNAJG", "uibdBSUINajg"));
        System.out.println("ZWRACA WYNIK METODY SPRAWDZAJĄCEJ CZY STRING ZAWIERA XYZ ALE BEZ KROPKI PRZED: TRUE,FALSE,TRUE");
        System.out.println(xyzThere("bu.xyzibibbxyzdbe"));
        System.out.println(xyzThere("unvoia.xyz"));
        System.out.println(xyzThere("unvoiaxyz"));
        System.out.println(xyzThere("unvoia.xyzxyz"));
        System.out.println("ZWRACA WYNIK METODY SPRAWDZAJĄCEJ CZY W CIĄGU TRZECH ZNAKÓW WYSTĘPUJE B COŚ TAM B");
        System.out.println(bobThere("ioknaoidncbib"));
        System.out.println(bobThere("bob"));
        System.out.println(bobThere("bonboibpbbob"));
        System.out.println("METODA SPRAWDZA CZY NA WYSTĘPUJĄCE W TEKŚCIE X WYSTĘPUJE PÓŹNIEJ CHOCIAŻ JEDNO Y: T,F,T");
        System.out.println(xyBalance("oinaccmimcopasmxasmmxy"));
        System.out.println(xyBalance("akfmisdnfaaifmximgosgymomx"));
        System.out.println(xyBalance("xyxy"));
        System.out.println("METODA TWORZY Z DWÓCH STRINGÓW JEDEN ZROBIONY Z CHARÓW DWÓCH POMIESZANYCH NA ZMIANĘ");
        System.out.println(mixString("tttttt", "uuu"));
        System.out.println(mixString("XXX", "ooo"));
        System.out.println("METODA TWORZY Z OSTATNICH \"N\" CHARÓW POWTÓRZONYCH I SKLEJONYCH \"N\" RAZY STRINGA ");
        System.out.println(repeatEnd("Kto", 2));
        System.out.println(repeatEnd("Satysfakcja", 5));
        System.out.println("METODA TWORZY Z OSTATNICH \"N\" CHARÓW POWTÓRZONYCH I SKLEJONYCH \"N\" RAZY ZA KAŻDYM RAZEM O 1 CHARA MNIEJ STRINGA ");
        System.out.println(repeatFront("Ktozkimijak", 5));
        System.out.println(repeatFront("Satysfakcja", 3));
        System.out.println("METODA SKLAEJA STRINGA PODANĄ ILOŚĆ RAZY I ZA KAŻDYM RAZEM ROZDZIALE DRUGIM STRINGIEM ");
        System.out.println(repeatSeparator("Słowo", " na Niedzielę! ", 3));
        System.out.println(repeatSeparator("Krowa", " na granicy! ", 3));
        System.out.println("METODA SPRAWDZA CZY WYRAZ STWORZONY Z N LITER STRINGA POWTARZA SIĘ JESZCZE GDZIE Ś W STRINGU");
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("Hi12345Hi6789Hi10", 3));
        System.out.println(prefixAgain("aa", 1));
        System.out.println(prefixAgain("abcbacbac", 1));
        System.out.println(prefixAgain("xyzxyxyxy", 3));
        System.out.println("METODA SPRAWDZA CZY WYRAZ STWORZONY Z N LITER STRINGA POWTARZA SIĘ JESZCZE GDZIE Ś W STRINGU");
        System.out.println(xyzMiddle("xyzAxyzBxyz"));
        System.out.println(xyzMiddle("xyzAxyzBBB"));
        System.out.println(xyzMiddle("xyzxyzAxyzBxyzxyz"));
        System.out.println(xyzMiddle("xyzxyzxyzBxyzxyz"));
        System.out.println(xyzMiddle("xyzxyzAxyzxyzxyz"));
    }

    /* Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
        for (str.length() = 0; i < str.length() ; i--) {
            String doubleStr = doubleStr +
        }
    }*/

    /*  Return the number of times that the string "hi" appears anywhere in the given string.   */
    public static int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    /* Return true if the string "cat" and "dog" appear the same number of times in the given string.   */
    public static boolean catDog(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < str.length() - 2; i++) { // pętla zliczająca ilości cat
            if (str.substring(i, i + 3).equals("cat")) {
                counterCat = counterCat + 1;
            }
        }
        for (int j = 0; j < str.length() - 2; j++) {  // pętla zliczająca ilości dog
            if (str.substring(j, j + 3).equals("dog")) {
                counterDog = counterDog + 1;
            }
        }
        if (counterCat == counterDog) {
            return true;
        }
        return false;
    }

    /*Return the number of times that the string "code" appears anywhere in the given string,
     except we'll accept any letter for the 'd', so "cope" and "cooe" count.  */
    public static int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && (str.substring(i + 3, i + 4).equals("e"))) { // warunek sprawdza ile w stringy jest ciągów "co""e"
                counter = counter + 1;
            }
        }
        return counter;
    }

    /* Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 Note: str.toLowerCase() returns the lowercase version of a string.   */
    public static boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();
        if (a.length() == 1 || b.length() == 1) {
            if (aLow.substring(aLow.length() - 1).equals(bLow.substring(bLow.length() - 1))) {
                return true;
            }
        }
        if (aLow.substring(aLow.length() - 2, aLow.length() - 1).equals(bLow.substring(bLow.length() - 2, bLow.length() - 1))) {
            return true;
        }
        return false;
    }


    /*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
     a period (.). So "xxyz" counts but "x.xyz" does not.  */
    public static boolean xyzThere(String str) {
        /*if (str.contains(".xyz") && str.contains("xyz")) { // to moje nietrafione i siermiężne rozwiązanie
            if (str.indexOf("xyz") == str.lastIndexOf("xyz"))
                return false;
            else {
                return true;
            }
        } else if (str.contains(".xyz")) {
            return false;
        } else if (str.contains("xyz")) {
            return true;
        }
        return false;*/
        int howLong = str.length();
        String wanted = "xyz";
        if (howLong < 3)
            return false;
        for (int i = 0; i < howLong - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.equals(wanted) && i == 0)
                return true;
            else if (temp.equals(wanted) && str.charAt(i - 1) != 46) // tu część kodu która robi robotę. drugi warunek sprawdza czy przed szukanym wyrażeniem jest kropka
                return true;
        }
        return false;
    }

    /* Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.  */
    public static boolean bobThere(String str) {
        int howLong = str.length();
        if (howLong < 3) { // sprawdzamy czy spełnia warunek długości trzech char
            return false;
        }
        for (int i = 0; i < howLong - 2; i++) {
            /* if (str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b")){*/ // można tak jak i poniżej
            if (str.charAt(i) == 98 && str.charAt(i + 2) == 98) { // drugi czytelniejszy sposób
                return true;
            }
        }
        return false;
    }

    /*  We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
      but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.  */
    public static boolean xyBalance(String str) {
        int howLong = str.length();
        if (howLong == 1) {
            if (str.contains("x")) { // sprawdza czy string składa się z samego x. Wtedy od razu false
                return false;
            }
            return true;
        }
        int counterX = 0;
        int counterY = 0;
        for (int i = 0; i < howLong; i++) { // liczy ile jest x a ile jest y w Stringu. Jeśli x występuje a y nie to false

            if (str.charAt(i) == 'x') {
                counterX = counterX + 1;
            } else if (str.charAt(i) == 'y') {
                counterY = counterY + 1;
            }
        }
        if (counterX > 0 && counterY == 0) { // To jest warunek petli która powyżej dla niego zlicza chary
            return false;
        }

        if (str.contains("x") && str.contains("y")) { // jeśli w stringu występuje x i y to patrzy czy y jest później niż x
            if (str.lastIndexOf("x") > str.lastIndexOf("y")) {
                return false;
            }
            return true;
        }
        return true; // cała reszta otrzymuje true
    }

    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
     the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.  */
    public static String mixString(String a, String b) {
       /* int aHowLong = a.length(); // moje nieudane próby, koncepcja podobna ale wykonanie pętli i warunki w nich kompletnie inne
        int bHowLong = b.length();
        String newAB = "";

        for (int i = 0; i < aHowLong; i++) {

                newAB = newAB + a.substring(i,i+1);
        }
        for (int j = 0; j < bHowLong; j++) {

            newAB = newAB + b.substring(j,j+1);
        }
return newAB;*/
        int aHowLong = a.length();
        int bHowLong = b.length();
        int maxHowLong = Math.max(aHowLong, bHowLong); // ja robiłem dwie pętle o dwóch długościach dwóch stringów, a trzeba jedną pętle o długośći dłuższego Stringa
        String newAB = "";

        for (int i = 0; i < maxHowLong; i++) { // to jest właśnie pętla o długości dłuższego Stringa
            if (i <= aHowLong - 1) { // dopóki licznik pętli bądzie mniejszy-równy przedostatniej wartości długości Stringa bo String ma długość 10 a ostatnia jego komórka ma index 9
                newAB = newAB + a.substring(i, i + 1); // dodajemy do naszego pustego nowego stringa jeden char ze Stringa a.
            }
            if (i <= bHowLong - 1) {
                newAB = newAB + b.substring(i, i + 1);  // dodajemy do naszego pustego nowego stringa z jednym charem a jeden char ze Stringa b.
            }
        }
        return newAB;
    }


    /* Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.   */
    public static String repeatEnd(String str, int n) {
        String echoEnd = str.substring(str.length() - n); // tworzy Stringa z n ostatnich charów oryginalnego Stringa
        String echoResultEnd = "";
        for (int i = 0; i < n; i++) {
            echoResultEnd = echoResultEnd + echoEnd; // skleja nowego stringa n razy

        }
        return echoResultEnd;
    }


    /* Given a string and an int n, return a string made of the first n characters of the string,
    followed by the first n-1 characters of the string, and so on.
    You may assume that n is between 0 and the length of the string.   */
    public static String repeatFront(String str, int n) {
        String echoStart = str.substring(0, n); // tworzy Stringa z pierwszej liczby n charów
        int indexN = n;
        for (int i = 0; i < n; i++) {
            echoStart = echoStart + echoStart.substring(0, indexN - 1);// skleja nowego stringa n razy za każdym razem o jednego chara mniej
            indexN = indexN - 1;
        }
        return echoStart;

        /*
        int len = str.length(); // kod z internetu z pętlą odliczającą wstecznie, krótszy o jedną linię, ale z intem z długością Stringa który jest ani razu nie używany
        String newWord = "";
         for (int i = n; n > 0; n--){
        newWord += str.substring(0,n);
        }
        return newWord;
         */
    }

    /* Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
     separated by the separator string.  */
    public static String repeatSeparator(String word, String sep, int count) {
        if (count < 1) {
            return "";
        } else if (count < 2) {
            return word;
        }
        String firstSeparator = sep + word;
        String result = word + sep + word;

        for (int i = 0; i < count - 2; i++) {
            result = result + firstSeparator;
        }
        return result;
// metoda z internetu krótsza, prostsza, systemowa i bardziej elegancka !!!!!!!
      /*  String newWord = "";

        for (int i = 0; i < count; i++) {
            if (i < count-1)
            newWord += word + sep;
    else
            newWord += word;
        }
        return newWord;*/
    }


    /* Given a string, consider the prefix string made of the first N chars of the string.
     Does that prefix string appear somewhere else in the string?
     Assume that the string is not empty and that N is in the range 1..str.length().   */
    public static boolean prefixAgain(String str, int n) {
        String prefixWord = str.substring(0, n); // tworze string który będzie prefixem
        int strLeng = str.length(); // tworze inta z długością Stringa oryginalnego
        for (int i = n; i <= (strLeng - n); i++) {  // !!! tu się męczyłe 45min z czymś co było oczywiste z powodu braku nawiasu w części kodu i <= (strLeng - n) gdy to wyglądało tak: i <= strLeng - n on najpierw przypisywał wartość a później odejmował i dlatego program przekraczał zakres
            String wanted = str.substring(i, i + n); // tworze pętle która w Stringu oryginalnym poszukuje Stringa prefix z wyłaczeniem początku
            if (wanted.equals(prefixWord)) {
                return true;
            }
        }
        return false;
    }


    /* Given a string, does "xyz" appear in the middle of the string? To define middle,
    we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks. */
    public static boolean xyzMiddle(String str) {
        String wanted = "xyz";
        int strLeng = str.length();

        if (str.length() < 3) {
            return false;
        }

        if (str.length() < 5) {
            if (str.contains(wanted)) {
                return true;
            }
        }
        int good = strLeng / 2;
        int better = (strLeng / 2) - 1;
        int theBest = (strLeng / 2) - 2;
        if (((str.substring(good)).equals(wanted)) || (str.substring(better).equals(wanted)) || (str.substring(theBest).equals(wanted))){
                return true;
        }
        return false;
    }

}
