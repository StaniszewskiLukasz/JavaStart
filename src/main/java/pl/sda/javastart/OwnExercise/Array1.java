package pl.sda.javastart.OwnExercise;

public class Array1 {
    public static void main(String[] args) {

    }

    /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
     The array will be length 1 or more.   */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    /*Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.  */
    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    /*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.  */
    public int[] makePi() {
        int[] pI = new int[]{3, 1, 4};
        return pI;
    }


    /* Given 2 arrays of ints, a and b,
    return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.  */
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    /*Given an array of ints length 3, return an array with the elements
    "rotated left" so {1, 2, 3} yields {2, 3, 1}.  */
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};

    }

    /*Given an array of ints length 3, figure out which is larger, the first or last element in the array,
     and set all the other elements to be that value. Return the changed array.  */
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[]{nums[0], nums[0], nums[0]};
        } else if (nums[0] < nums[2]) {
            return new int[]{nums[2], nums[2], nums[2]};
        }
        return new int[]{nums[2], nums[2], nums[2]};
    }

    /*Given an int array length 2, return true if it contains a 2 or a 3.  */
    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            return true;
        }
        return false;
    }

    /*Given an int array, return a new array with double the length where its last element is the same
     as the original array, and all the other elements are 0. The original array will be length 1 or more.
      Note: by default, a new int array contains all 0's.   */
    public static int[] makeLast(int[] nums) {
        int[] makeLastArray = new int[nums.length * 2];
        makeLastArray[makeLastArray.length - 1] = nums[nums.length - 1];
        return makeLastArray;
    }

    /*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element. */
    public int start1(int[] a, int[] b) {

        /*int count = 0;
        if (a.length != 0) {
        if (a[0]== 1) count++; }
        if (b.length != 0) {
        if (b[0]== 1) count++; }
        return count;
TWÓRCA TEGO KODU TRAKTUJE SWÓJ KOD JAKO CAŁOŚĆ, NIE SPRAWDZA TAK JAK JA POJEDYNCZO KAŻDEGO PRZYPADKU.
SPRAWDZA OSOBNO A I B A NIE JE RAZEM W RÓŻNYCH KONFIGURACJACH, ALE CAŁOŚĆ TWORZY JEDNOLITY KOD A WYNIK
 OTRZYMUJEMY DOPIERO NA KOŃCU   SUPER!!!    */
        if (a.length < 1 && b.length < 1) {
            return 0;
        }
        if (a.length > 0 && b.length > 0) {
            if (a[0] == 1 && b[0] == 1) {
                return 2;
            } else if (a[0] == 1 || b[0] == 1) {
                return 1;
            }
        } else if (a.length > 0) {
            if (a[0] == 1) {
                return 1;
            }
            return 0;
        } else if (b.length > 0) {
            if (b[0] == 1) {
                return 1;
            }
            return 0;
        }

        return 0;
    }

    /*Given an array of ints, swap the first and last elements in the array.
     Return the modified array. The array length will be at least 1.  */
    public int[] swapEnds(int[] nums) {
        if (nums.length > 1) {
            int first = nums[nums.length - 1];
            int last = nums[0];
            nums[0] = first;
            nums[nums.length - 1] = last;
            return nums;
        }
        return nums;
    }

    /*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
     the elements from a followed by the elements from b. The arrays may be any length, including 0,
      but there will be 2 or more elements available between the 2 arrays.   */
    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[]{b[0], b[1]};
        } else if (b.length == 0) {
            return new int[]{a[0], a[1]};
        }if(a.length == 1){
            return new int[]{a[0], b[0]};
        }
        return new int[]{a[0],a[1]};

    }
}



