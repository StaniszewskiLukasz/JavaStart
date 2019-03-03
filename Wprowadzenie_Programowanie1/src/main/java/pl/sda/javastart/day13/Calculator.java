package pl.sda.javastart.day13;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
//        System.out.println(sum("5+ 6 "));
        System.out.println(minus("-2-2"));
    }

    private static int sum(String value) {
        int sum = 0;
        String[] sumTable = value.split("\\+");
        for (int i = 0; i < sumTable.length; i++) {
            String t = sumTable[i].trim();
            sum = sum + Integer.valueOf(t);
        }

        return sum;
    }

    private static int minus(String value) {
        int temp = 0;
        String[] sumTable = value.split("\\-");
        int v = 0;
        for (int i = 0; i < sumTable.length; i++) {
            String t = sumTable[i].trim();
            if (t.equals("")) {
                continue;
            } else {
                temp = Integer.valueOf(sumTable[0].trim());
                if (i > 0) {
                    temp = temp - Integer.valueOf(sumTable[i].trim());
                }
            }
        }
        return temp;
    }
}
