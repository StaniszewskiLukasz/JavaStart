package pl.sda.javastart.day4.Homework;

public class TableWithNewIntExercise28 {
    public static void main(String[] args) {
        tableWithAddedInt(5, new int[]{4, 8, 6, 9,});
    }

    //Utwórz metodę przyjmującą tablicę liczb i liczbę a zwracającą tę tablicę z dopisaną liczbą.
    public static int[] tableWithAddedInt(int argAdd, int[] table) {
        int[] tableWithAdded = new int [table.length + 1];
        tableWithAdded[tableWithAdded.length - 1] = argAdd;
        System.out.println(tableWithAdded.length);
        return tableWithAdded;
    }
}
