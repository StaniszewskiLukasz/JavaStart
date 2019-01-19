package pl.sda.javastart.OwnExercise;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import sun.font.FontRunIterator;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        System.out.println("METODA SPRAWDZA ILE JEST PARZYSTYCH LICZB W TABLICY:6, 0, 1");
        countEvens(new int[]{2, 4, 2, 6, 8, 0});
        countEvens(new int[]{5, 3, 1, 121, 1253, 3});
        countEvens(new int[]{5, 6});
        System.out.println("METODA SPRAWDZA RÓŻNICE MIĘDZY MAKSEM A MIN W TABLICY");
        System.out.println(bigDiff(new int[]{5, 6}));
        System.out.println("METODA SPRAWDZA ŚREDNIĄ WARTOŚĆ ARGUMENTÓW Z POMINIĘCIEM WARTOŚCI MIN I MAX: 4, 3, 1");
        System.out.println(centeredAverage(new int[]{5, 3, 0, 8, 6}));
        System.out.println(centeredAverage(new int[]{10, 3, 8}));
        System.out.println(centeredAverage(new int[]{-2, 0, 6, -9, 10}));
        System.out.println("METODA SUMUJE WARTOŚCI Z TABLICY Z POMINIĘCIEM LICZBY 13: 6, 6, 0, 4");
        System.out.println(sum13(new int[]{1, 2, 2, 1}));
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));
        System.out.println(sum13(new int[]{13, 0}));
        System.out.println(sum13(new int[]{1, 2, 13, 2, 1, 13}));
        System.out.println("METODA SUMUJE WARTOŚCI Z TABLICY Z POMINIĘCIEM LICZBY MIĘDZY 6 A 7: 16, 1, 5");
        System.out.println(sum67(new int[]{1, 2, 6, 2, 7, 13}));
        System.out.println(sum67(new int[]{1, 6, 13, 2, 1, 7}));
        System.out.println(sum67(new int[]{1, 2, 2}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY OBOK SIEBIE WYSTĘPUJĄ DWIE DWÓJKI: T, F, F, F, F ");
        System.out.println(has22(new int[]{1, 2, 2}));
        System.out.println(has22(new int[]{1, 2, 1, 2}));
        System.out.println(has22(new int[]{2, 1, 2}));
        System.out.println(has22(new int[]{2, 1,}));
        System.out.println(has22(new int[]{2}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY WYSTĘPUJĄ JEDYNKI I TRÓJKI OBECNOŚĆ=FALSE: T, T, T, F, F, F");
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{2}));
        System.out.println(lucky13(new int[]{}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
        System.out.println(lucky13(new int[]{3}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY WYSTĘPUJĄ CZTERY DWÓJKI: T, F, F, F");
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println(sum28(new int[]{2}));
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println(sum28(new int[]{1, 2, 3, 4}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY WYSTĘPUJE WIĘCEJ JEDYNEK NIŻ CZWÓREK: T, F, T, F");
        System.out.println(more14(new int[]{1, 4, 1}));
        System.out.println(more14(new int[]{1, 4, 1, 4}));
        System.out.println(more14(new int[]{1, 1}));
        System.out.println(more14(new int[]{}));
        System.out.println("METODA TWORZY NOWĄ TABLICĘ OKRĘLSONĄ LICZBĄ N : T, F, T, F");
        fizzArray(4);
        fizzArray(1);
        fizzArray(10);
        System.out.println("METODA SPRAWDZA CZY W TABLICY WYSTĘPUJE TYLKO JEDYNKI CZWORKI: T, F, T");
        System.out.println(only14(new int[]{1, 4, 1, 4}));
        System.out.println(only14(new int[]{1, 4, 2, 4}));
        System.out.println(only14(new int[]{1, 1}));
        System.out.println("METODA TWORZY TABLICĘ O PODANEJ DŁUGOŚCI I WYPEŁNIONĄ STRINGAMI: T, F, T");
        fizzArray2(4);
        fizzArray2(1);
        System.out.println("METODA JEST DZLA MNIE NIE ZROZUMIAŁA: T, F, F");
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 1));
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3}, 2));
        System.out.println(isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        System.out.println("METODA SPRAWDZA CZY W TABLICY WYSTĘPUJE 2 LUB 4 OBOK SIEBIE: T, T, F, F, F");
        System.out.println(either24(new int[]{1, 2, 2}));
        System.out.println(either24(new int[]{4, 4, 1}));
        System.out.println(either24(new int[]{4, 4, 1, 2, 2}));
        System.out.println(either24(new int[]{4, 1, 4, 2, 1, 2}));
        System.out.println(either24(new int[]{4, 1, 6, 2}));
        System.out.println("METODA SPRAWDZA CZY W DWOCH TABLICACH LICZBY SĄ DO SIEBIE PODOBNE: 2, 3, 2, 1");
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        System.out.println(matchUp(new int[]{5, 3}, new int[]{2, 2}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY CYFRA TRZY POJAWIA SIĘ TRZY RAZY I W ODSTĘPACH: F, F, F, F, F");
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));
        System.out.println(haveThree(new int[]{1, 3, 3, 1, 3}));
        System.out.println(haveThree(new int[]{3, 3, 3}));
        System.out.println(haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY CYFRA DWA POJAWIA SIĘ ZAWSZE OBOK INNEJ DWA: F, T, T, F, F");
        System.out.println(twoTwo(new int[]{2, 2, 4, 2}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{4, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{1, 2, 3, 4}));
        System.out.println(twoTwo(new int[]{1, 2}));
        System.out.println("METODA SPRAWDZA CZY W TABLICY ZNAJDUJE SIĘ TRZY LICZBY O JEDEN WIĘKSZE NP. 4,5,6 : T, T, F");
        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2}));
        System.out.println(tripleUp(new int[]{1, 2, 3}));
        System.out.println(tripleUp(new int[]{1, 2, 4}));
        System.out.println("METODA TWORZY NOWĄ TABLICĘ GDZIE POCZĄTKOWA WARTOŚĆ W INDEKSIE 0 TO START A OSTATNIA TO END-1");
        System.out.println(Arrays.toString(fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizzArray3(1, 3)));
        System.out.println("METODA TWORZY NOWĄ TABLICĘ GDZIE POCZĄTKOWA WARTOŚĆ TRAFIA NA KONIEC");
        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2})));
        System.out.println(Arrays.toString(shiftLeft(new int[]{1})));
        System.out.println("METODA TWORZY NOWĄ TABLICĘ ZŁOŻONĄ Z WARTOŚCI ORYGINALENEJ DO MOMENTU POJAWIENIA SIĘ 4");
        System.out.println(Arrays.toString(pre4(new int[]{1, 2, 4, 1})));
        System.out.println(Arrays.toString(pre4(new int[]{3, 1, 4})));
        System.out.println(Arrays.toString(pre4(new int[]{1, 4, 4})));
        System.out.println("METODA TWORZY NOWĄ TABLICĘ ZŁOŻONĄ Z WARTOŚCI ORYGINALENEJ OD MOMENTU POJAWIENIA SIĘ 4");
        System.out.println(Arrays.toString(post4(new int[]{2, 4, 1, 2})));
        System.out.println(Arrays.toString(post4(new int[]{4, 1, 4, 2})));
        System.out.println(Arrays.toString(post4(new int[]{4, 4, 1, 2, 3})));
    }

    /*Return the number of even ints in the given array.
     Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.  */
    public static int countEvens(int[] nums) {
        int licznik = 0;
        for (int elements : nums) {
            if (elements % 2 == 0) {
                licznik = licznik + 1;
            }
        }
        System.out.println(licznik);
        return licznik;
    }


    /* Given an array length 1 or more of ints,
    return the difference between the largest and smallest values in the array.
     Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.  */
    public static int bigDiff(int[] nums) {
        /*int min = nums[0]; // można też tak tą metodę rozwiązać. Krócej i prościej. 6 lini kodu zamiast przynajmnie 8.
          int max = nums[0];

          for (int i = 0; i < nums.length; i++){
               min = Math.min(min,nums[i]);
               max = Math.max(max,nums[i]);
          }
          return max-min;  */
        int max = nums[0];
        int min = nums[0];
        int difference; // ta zmienna jest niepotrzebna

        for (int element : nums) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        difference = max - min; // można od razu napisać return max - min bez zmiennej
        return difference;
    }

    /* Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
     except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
      ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
      You may assume that the array is length 3 or more.  */
    public static int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            sum = sum + nums[i];
        }
        return (sum - max - min) / (nums.length - 2);
    }

    /* Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
     so it does not count and numbers that come immediately after a 13 also do not count.  */
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) // wszystko inne od 13 sumujemy
                sum = sum + nums[i];
            else if (nums[i] == 13 && i < nums.length - 1) { // wszystko równe 13 i gdy nie jest to ostatni index tablicy
                nums[i] = 0;                                 // zamieniamy na 0 i index następny tak samo
                nums[i + 1] = 0;
            }
        }
        return sum;

       /* int sum = 0;
        int unlucky=0;

        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) { // tu już ombinowałem i nie jest to mój oryginalny pomysł
            if(nums[i]==13){
                i=unlucky;  // miałem problem z tym że int którego przypisywałem do indeksu tablicy z 13 przybierał wartość
                sum = sum + 0;  // 0 na początku i zawsze pomijany był w liczeniu indeks 0 a później te właściwe
                if((i + 1) == (unlucky + 1)){
                    sum = sum + 0;
                }
            }
            else{
                sum = sum + nums[i];
            }
        }
        return sum;  */
    }

    /* Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending
     to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.  */
    public static int sum67(int[] nums) {
        int sum = 0;
        int endSection = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                nums[i] = 0;
                for (int j = i; nums[j] != 7; j++) { // tu nie może być warunek nums[j]==7 bo pętla działa tak długo
                    nums[j] = 0;              // jak j jest mniejsze od czegoś, jak j nie jest równe 7,
                    endSection = j;           //warunek j==7 oznacza pętla działa tak długo jak j jest równe 7 czyli nigdy
                }
                nums[endSection + 1] = 0;
            } else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    /*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.  */
    public static boolean has22(int[] nums) {
        if (nums.length < 2) { // jeśli tablica krótsza niż 2 to nie ma co sprawdzać dalej
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && i == nums.length - 1) { // jeśli dwójka jest ostatnią liczbą to nie ma co sprawdzać
                return false;
            } else if (nums[i] == 2 && nums[i + 1] == 2) { // jeśli pierwsza natrafiona  dwójka sąsiaduje z inną to bingo
                return true;
            }
        }
        return false;
    }

    /* Given an array of ints, return true if the array contains no 1's and no 3's.  */
    public static boolean lucky13(int[] nums) {
        if (nums.length < 1) { // jeśłi krótszy niż jeden to true bo nie zawiera
            return true;
        }
        for (int i = 0; i < nums.length; i++) {  // jeśłi zawiera 1 lub 3 to false
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    /* Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.  */
    public static boolean sum28(int[] nums) {
        int sum = 0;
        if (nums.length < 4) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum = sum + nums[i];
            }
        }
        if (sum == 8) {
            return true;
        }
        return false;
    }

    /* Given an array of ints, return true if the number of 1's is greater than the number of 4's   */
    public static boolean more14(int[] nums) {
        int counterOne = 0;
        int counterFour = 0;
        if (nums.length < 1) { // jeśli tablica jest pusta to false
            return false;
        }
        for (int i = 0; i < nums.length; i++) { // pętla liczy ile jest jedynek i czwórek
            if (nums[i] == 1) {
                counterOne = counterOne + 1;
            } else if (nums[i] == 4) {
                counterFour = counterFour + 1;
            }
        }
        if (counterOne > counterFour) { // warunke sprawdza czy jedynek było więcej
            return true;
        }
        return false;
    }

    /* Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just return a length 0 array.
    You do not need a separate if-statement for the length-0 case;
    the for-loop should naturally execute 0 times in that case, so it just works.  */
    public static int[] fizzArray(int n) {
        int[] newArrayN = new int[n]; // tworzymy nową tablicę
        for (int i = 0; i < n; i++) {
            newArrayN[i] = i; // w pętli o podanej długości n wypełniamy tablicę cyframi od zera do n-1
        }
        return newArrayN;
    }

    /*Given an array of ints, return true if every element is a 1 or a 4.  */
    public static boolean only14(int[] nums) {
        int counterOne = 0;
        int counterFour = 0;
        int counterSum = 0;

        for (int i = 0; i < nums.length; i++) { // pętla zlicza ilość jedynek i czwórek
            if (nums[i] == 1) {
                counterOne = counterOne + 1;
            } else if (nums[i] == 4) {
                counterFour = counterFour + 1;
            }
        }
        counterSum = counterFour + counterOne;
        if (counterOne == nums.length || counterFour == nums.length || counterSum == nums.length) {
            return true; // warune porównuje ilośc jedynek i czwórek z ogólną liczbą indexów w tablicy
        }
        return false;
    }

    /* Given a number n, create and return a new string array of length n,
    containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.
    Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is:
     new String[desired_length]  (See also: FizzBuzz Code)   */
    public static String[] fizzArray2(int n) {
        String[] newArrayN = new String[n]; // tworzymy nową tablicę
        for (int i = 0; i < n; i++) {
            newArrayN[i] = String.valueOf(i); // w pętli o podanej długości n wypełniamy tablicę Stringami od zera do n-1
        }
        return newArrayN;
    }

    /* Given an array of ints, return true if it contains no 1's or it contains no 4's.  */
    public static boolean no14(int[] nums) {
        int counterOne = 0;
        int counterFour = 0;
        if (nums.length < 2) { // jeśłi krótszy niż jeden to true bo nie zawiera obu zakazanych
            return true;
        }
        for (int i = 0; i < nums.length; i++) {  // jeśłi zawiera 1 i 4 to false
            if (nums[i] == 1) {
                counterOne = counterOne + 1;
            } else if (nums[i] == 4) {
                counterFour = counterFour + 1;
            }
        }
        if (counterOne > 0 && counterFour > 0) { // ten warunek sprawdza czy false czy nie
            return false;
        }
        return true;
    }

    /* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
    at least one of the pair is that value. Return true if the given value is everywhere in the array.  */
    public static boolean isEverywhere(int[] nums, int val) {
       /* int valCounter = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                valCounter = valCounter + 1;
            }
            i++;
        }
        if ((nums.length % 2 == 0) && (valCounter * 2 == nums.length)) {
            return true;
        }else if((nums.length % 2 !=0) &&(nums[nums.length-1]==val)){
            return true;
        }
       */
        return false;
    }

    /* Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.  */
    public static boolean either24(int[] nums) { // można to zrobić zwylymi licznikami także
        boolean twoOccur = false;
        boolean fourOccur = false;
        for (int i = 0; i < nums.length - 1; i++) { // zrobiłem po jednej pętli dla kązdego warunku, zbędnie
            if (nums[i] == 2 && nums[i + 1] == 2) {
                twoOccur = true;
            }
        }
        for (int j = 0; j < nums.length - 1; j++) { // druga pętla jest całkowicie zbędna dwa warunki zliczające powinny być w jednej pętli
            if (nums[j] == 4 && nums[j + 1] == 4) {
                fourOccur = true;
            }
        }
        if (twoOccur == true && fourOccur == true) {
            return false;
        } else if (twoOccur == true) {
            return true;
        } else if (fourOccur == true) {
            return true;
        }
        return false;
    }

    /* Given arrays nums1 and nums2 of the same length, for every element in nums1,
     consider the corresponding element in nums2 (at the same index).
     Return the count of the number of times that the two elements differ by 2 or less, but are not equal.  */
    public static int matchUp(int[] nums1, int[] nums2) {
        int matchCounter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums2[i] - nums1[i] <= 2 && nums2[i] - nums1[i] > 0) {
                matchCounter++;
            } else if (nums1[i] - nums2[i] <= 2 && nums1[i] - nums2[i] > 0) {
                matchCounter++;
            }
        }
        return matchCounter;
    }

    /* Given an array of ints, return true if the array contains two 7's next to each other,
     or there are two 7's separated by one element, such as with {7, 1, 7}.  */
    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) { // metod sprawdza czy obok siebie ale jedno pole od siebie są dwie 7
            if (nums[i] == 7 && nums[i + 1] == 7) { // pętla i ten warunek sprawdzają bezpośrednie sąsiedztwo
                return true;
            } else if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) { // ten warunek sprawdza czy 7 są dwa pola od sibie
                return true;                         // zapis i<nums.length-2 jest ważny ze względu na BoundException
            }
        }
        return false;
    }

    /* Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.  */
    public static boolean has12(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.*/
    public boolean modThree(int[] nums) { // metoda sprawdza czy obok siebie
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            } else if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
    and no 3's are next to each other.    */
    public static boolean haveThree(int[] nums) {
        int counterThree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                counterThree++;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {
                return false;
            }
        }
        if (counterThree == 3) {
            return true;
        }
        return false;
    }

    /*Given an array of ints, return true if every 2 that appears in the array is next to another 2.  */
    public static boolean twoTwo(int[] nums) {
        int counterTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                counterTwo++;
            }
        }
        if (counterTwo == 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                for (int j = i; j < counterTwo; j++) {
                    if (nums[j] != 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* Return true if the group of N numbers at the start and end of the array are the same.
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
     You may assume that n is in the range 0..nums.length inclusive. */
    /*public boolean sameEnds(int[] nums, int len) {
        if (len == 0) {
            return true;

            }
        }*/

    /*Return true if the array contains, somewhere,
    three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.  */
    public static boolean tripleUp(int[] nums) {
        int number;
        if (nums.length < 3) { // sprawdza czy tablica ma trzy znaki jeśli nie to nie ma co sprawdzać dalej
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) { // pętla i if w niej sprawdza czy gdzieś w tablicy są trzy liczby rosnące o jeden
            if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }
        return false;
    }

    /* Given start and end numbers, return a new array containing the sequence of integers from start up to
     but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
      The end number will be greater or equal to the start number. Note that a length-0 array is valid.  */
    public static int[] fizzArray3(int start, int end) {
        int tableLength = end - start; // ten int przechowuje długość tablicy jaka ma zostać stworzona
        int tableIndex = 0; // to jest początkowa wartść indeksu tablicy
        int[] newTable = new int[tableLength]; // tworzymy tablicę
        for (int i = start; i < end; i++) { // pętla startuje od wartości "start" a kończy na "end" -1
            newTable[tableIndex] = start; // początkowa wartość tablicy to start
            tableIndex++; // inkrementujemy index i wartości w każdym następnym indeksie
            start++;
        }
        return newTable;
    }

    /*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.   */
    public static int[] shiftLeft(int[] nums) {
        if (nums.length < 1)
            return nums;
        int firstValueOfTable = nums[0]; // pierwsza wartość z oryginalnej tablicy
        int[] newTable = new int[nums.length]; // tworzymy nową tablicę o długości oryginalnej
        newTable[newTable.length - 1] = firstValueOfTable; // ostatnia wartość w nowej to pierwsza wartość ze starej
        for (int i = 1; i < nums.length; i++) { // reszte indeksów przesuwamy o jeden do tyłu
            newTable[i - 1] = nums[i];
        }
        return newTable;
    }

    /*Given a non-empty array of ints, return a new array containing the elements
     from the original array that come before the first 4 in the original array.
     The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.  */
    public static int[] pre4(int[] nums) {
        if (nums.length < 1) {
            return nums;
        }
        if (nums.length == 1 && nums[0] == 4) {
            return new int[]{0};
        }
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                counter = i;
                break;
            }
        }
        int[] newTable = new int[counter];
        for (int j = 0; j < counter; j++) {
            newTable[j] = nums[j];
        }
        return newTable;
    }

    /*Given a non-empty array of ints, return a new array containing the elements from the original array
    that come after the last 4 in the original array. The original array will contain at least one 4.
    Note that it is valid in java to create an array of length 0.   */
    public static int[] post4(int[] nums) {
        int numsLength = nums.length;
        if (nums.length < 1) {
            return nums;
        }
        if (nums.length == 1 && nums[0] == 4) {
            return new int[]{0};
        }
        int counter = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[i] == 4) {
                counter = i;
                break;
            }
        }
        int[] newTable = new int[numsLength-counter-1];
        for (int j = 0; j < numsLength-counter; j++) {
            newTable[j] = nums[counter+1];
            counter++;
        }
        return newTable;
    }

}




