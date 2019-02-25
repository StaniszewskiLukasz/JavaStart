package pl.sda.javastart.day10;

import java.util.List;

public class Sorting {

    public static void lineSearchOpty(int[] tab, int search){
        Integer index = null;
        for (int i=0, j=tab.length-1; i<j; i++,j--) {
            if (tab[i] == search) {
                index = i;
                break;
            }
            if (tab[j] == search) {
                index = j;
                break;
            }
        }

        System.out.println("Szukanie elementu " + search);
        System.out.println(index == null ? "Brak szukanego elementu w tablicy"
                : "Element "+ search + " znajduję sie w miejscu o indeksie " + index);
    }

    public static int linearSearchOfTable(Object o, Object[] tab) { // wyszukiwanie liniowe
        for (int i = 0; i < tab.length; i++) {
            if (o.equals(tab[i])) {
                return i;
            }
        }
        return -1;
    }

    public static Object linearSearchOfCollect(Object o, List<Object> list) { // można iterować jedną pętle po dwóch zmiennych i tak skracamy znacznie działanie pętli
        for (int i = 0; i < list.size(); i++) {
            if(o.equals(list.get(i))){
                return list.get(i);
            }
        }
        return -1;
    }

 /*   public static Object binarySearchOfCollect(Object o, List<Object> list) { // binarnie tylko

    }*/
}

