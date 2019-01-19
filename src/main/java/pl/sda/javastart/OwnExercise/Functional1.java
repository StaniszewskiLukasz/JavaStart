package pl.sda.javastart.OwnExercise;

import pl.sda.javastart.day6.NameHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
    }


    /* Given a list of integers, return a list where each integer is multiplied by 2.  */
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        System.out.println(nums);
        return nums;
    }

    /*Given a list of integers, return a list where each integer is multiplied with itself.  */
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    /* Given a list of strings, return a list where each string has "*" added at its end. */
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + '*');
        return strings;
    }

    /* Given a list of strings,
    return a list where each string is replaced by 3 copies of the string concatenated together.  */
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    /* Given a list of strings, return a list where each string has "y" added at its start and end.  */
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> 'y' + n + 'y');
        return strings;
    }

    /* Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10. */
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    /* Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)  */
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    /* Given a list of strings, return a list where each string is converted to lower case
    (Note: String toLowerCase() method).   */
    public List<String> lower(List<String> strings) {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }

    /* Given a list of strings, return a list where each string has all its "x" removed.  */
    public List<String> noX(List<String> strings) {
        strings.indexOf('x'); // fixme
        return strings;
    }

}
