package pl.sda.javastart.OwnExercise;

import java.util.List;

public class Functional2 {
    public static void main(String[] args) {

    }

    /* Given a list of integers, return a list of the integers, omitting any that are less than 0.  */
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    /*
Given a list of non-negative integers,
return a list of those numbers except omitting any that end with 9. (Note: % by 10)  */
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    /* Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive. */
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n > 12 && n < 20);
        return nums;
    }

    /* Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)  */
    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    /* Given a list of strings, return a list of the strings, omitting any string length 4 or more.*/
    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() > 3);
        return strings;
    }

    /* Given a list of strings, return a list of the strings, omitting any string length 3 or 4. */
    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }

    /* Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.  */
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf(n -> n.contains("yy"));
        return strings;
    }

    /* Given a list of non-negative integers, return a list of those numbers multiplied by 2,
     omitting any of the resulting numbers that end in 2.   */
    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    /* Given a list of integers, return a list of those numbers squared and the product added to 10,
     omitting any of the resulting numbers that end in 5 or 6.  */
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (n * n)+10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}
