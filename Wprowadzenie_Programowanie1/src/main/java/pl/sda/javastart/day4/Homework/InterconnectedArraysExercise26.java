package pl.sda.javastart.day4.Homework;

public class InterconnectedArraysExercise26 {
    public static void main(String[] args) {
        connetctedArray(new int[]{1,2,3,4,5},new int[]{10,20,30,40,50});
    }
// Utwórz metodę przyjmującą dwie tablice z liczbami i zwracającą tablicę będącą efektem połączenia tych dwóch.
    public static int[] connetctedArray (int[] tableA,int[]tableB){
       int[] mixArray = new int[tableA.length + tableB.length];
      /*  for (int i = 0; i < tableA.length; i++) {
            mixArray[i] = tableA[i];
        }*/
       System.arraycopy(tableA, 0, mixArray, 0, tableA.length);
       System.arraycopy(tableB, 0, mixArray, tableA.length, tableB.length);
       /* for (int i = 0; i < tableB.length; i++) {
            mixArray[tableA.length + i] = tableB[i];
        }*/
        for (int i = 0; i <mixArray.length ; i++) {
            System.out.println(mixArray[i]);
        }
        return mixArray;
    }
}
