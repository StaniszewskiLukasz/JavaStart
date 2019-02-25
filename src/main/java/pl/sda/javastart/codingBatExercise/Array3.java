package pl.sda.javastart.codingBatExercise;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
//        System.out.println("METODA ZWRACA TABLICĘ GDZIE KAŻDA WART. 4 JEST PRZENIESIONA TUŻ ZA WART.3");
//        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
//        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
//        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4})));
//        System.out.println("METODA ZWRACA TABLICĘ GDZIE KAŻDA WART. 5 JEST PRZENIESIONA TUŻ ZA WART.4");
//        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
//        System.out.println(Arrays.toString(fix45(new int[]{5, 5, 4, 1, 4, 1})));
//        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
//        System.out.println(Arrays.toString(fix45(new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5})));
//        System.out.println("METODA ZWRACA SPRAWDZA CZY DA SIĘ PODZIELIĆ TABLICĘ NA DWIE RÓNE CZĘŚCI POD  WZGLĘDEM SUMY WARTOŚCI");
//        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
//        System.out.println(canBalance(new int[]{1, 1, 1, 1, 4}));
//        System.out.println("METODA ZWRACA TABLICĘ O DŁUGOŚCI n*n I PODZIELONA NA n SEKCJI GDZIE WART. MALEJE OD n O 1 CO SEKCJĘ");
//        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println("METODA ZWRACA TABLICĘ O DŁUGOŚCI n*(n + 1)/2 PODZIELONĄ NA n SEKCJI Z WART ROŚNIE OD 1 O 1 CO SEKCJĘ");
        System.out.println(Arrays.toString(seriesUp(3)));
    }

    /* Consider the leftmost and righmost appearances of some value in an array.
     We'll say that the "span" is the number of elements between the two inclusive.
     A single value has a span of 1. Returns the largest span found in the given array.
      (Efficiency is not a priority.)     */
   /* public int maxSpan(int[] nums) {

    }*/


    /* Return an array that contains exactly the same numbers as the given array,
     but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
      but every other number may move. The array contains the same number of 3's and 4's,
       every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.   */
    public static int[] fix34(int[] nums) {
      /*  int valueMove = 0;
        int valueOfThree = 0;
        int valueOfFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (valueOfFour > 0 && valueOfThree > 0) {
                valueMove = nums[valueOfThree + 1];
                nums[valueOfThree + 1] = nums[valueOfFour];
                nums[valueOfFour] = valueMove;
            }
            if (nums[i] == 3) {
                valueOfThree = i;
            } else if (nums[i] == 4) {
                valueOfFour = i;
            }
        }
        return nums;*/

        int blabla = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = blabla; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        blabla = j;
                        int value = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = value;
                        break;
                    }
                }
            }

        }
        return nums;
    }

    /* (This is a slightly harder version of the fix34 problem.)
     Return an array that contains exactly the same numbers as the given array,
      but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's,
       but every other number may move. The array contains the same number of 4's and 5's,
        and every 4 has a number after it that is not a 4. In this version,
        5's may appear anywhere in the original array.   */
    public static int[] fix45(int[] nums) {
        int firstFive = nums.length + 2; // to działa na każdy przypadek gdzie w tym zadaniu ale nie jest to kod działająco systemowo
        int secondFive = nums.length + 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (firstFive == j || secondFive == j) {
                        continue;
                    } else if (nums[j] == 5) {
                        if (firstFive != nums.length + 2) {
                            secondFive = i + 1;
                        } else {
                            firstFive = i + 1;
                        }
                        int value = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = value;
                        break;
                    }

                }
            }

        }
        return nums;

        /*for (int i = 0; i < nums.length; i++) { // kod działający taj jak mój powyżej ale z solutions, krótszy o 3 linie
    if (nums[i] == 4) { // działa systemowo i poprzez prostego ifa wyklucza wszystkie niechciane przypadki
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == 5) {
          if (j > 0 && nums[j-1] != 4) {
            int tmp = nums[i+1];
            nums[i+1] = 5;
            nums[j] = tmp;
          }
          else if (j == 0) {
            int tmp = nums[i+1];
            nums[i+1] = 5;
            nums[j] = tmp;
          }
        }
      }
    }
  }
  return nums; */



        /*  int firstFive = nums.length + 2; // to działa na każdy przypadek gdzie 5 nie występuje częściej niż dwa razy, rozmieszczenie 5 nie ma znaczenia
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (firstFive == j) {
                       continue;
                    }else if(nums[j] == 5){
                            firstFive = i+1;
                            int value = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = value;
                            break;
                        }

                }
            }

        }
        return nums;  */

    /*    int blabla = 0; // to działa na wiele występujących 5 pod warunkiem że przed pierwszą 4 nie ma więcej niż dwie 5
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = blabla; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        blabla = i+2;
                        int value = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = value;
                        break;
                    }
                }
            }

        }
        return nums;*/
    }

    /* Given a non-empty array,
    return true if there is a place to split the array so that the sum of the numbers
    on one side is equal to the sum of the numbers on the other side.  */
    public static boolean canBalance(int[] nums) {
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        for (int i = 0; i < nums.length; i++) {
            sumFirstPart = sumFirstPart + nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sumSecondPart = sumSecondPart + nums[j];
            }
            if (sumFirstPart == sumSecondPart) {
                return true;
            } else {
                sumSecondPart = 0;
            }
        }
        return false;
    }


    /*   Given n>=0, create an array length n*n with the following pattern,
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).  */
    public static int[] squareUp(int n) {
        int index = (n*n)-1;
        int[] tableOfSomething = new int[n * n];
        for (int i = n; i > 0; i--) {
            int value = 1;
            for (int j = 0; j < n ; j++) {
                if(value<=i){
                    tableOfSomething[index] = value;
                }
                if(n>value){
                    value++;
                }
                        index--;
            }

        }
        return tableOfSomething;
    }


    /*  Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
      which is known to sum to exactly n*(n + 1)/2.    */
    public static int[] seriesUp(int n) {
        int tableLength = (n*(n + 1)/2);
        int index = 0;
        int[] tableOfSomething = new int[tableLength];
        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <=i; j++) {
                tableOfSomething[index++] = value++;
            }
        }
        return tableOfSomething;
    }

}
