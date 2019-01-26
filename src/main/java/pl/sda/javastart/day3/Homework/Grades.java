package pl.sda.javastart.Homework;

import java.sql.SQLOutput;

public class Grades {
    public static void main(String[] args) {
        System.out.println(results(95));
        System.out.println("Dostałeś ocenę "+ resaultGrupowa(51));
        System.out.println("Dostałeś ocenę "+ resaultGrupowa(79));
        System.out.println("Dostałeś ocenę "+ resaultGrupowa(49));
    }

    public static String results(int result) {
        if (result < 50) {
            return "You failed";
        } else if (result < 60) {
            return "Twoja ocena to 2";
        } else if (result < 70) {
            return "Twoja ocena to 3";
        } else if (result < 80) {
            return "Twoja ocena to 4";
        } else if (result < 90) {
            return "Twoja ocena to 5";
        } else if (result < 100) {
            return "Twoja ocena to 6";
        }
        return null;
    }
//PONIEŻEJ METODA GRUPOWA I INNE ROZWIĄZANIE NIŻ MOJE, JA BEZ SENSU DAŁEM ZA DUŻO WARUNKÓW
    public static String resaultGrupowa(int pcts) {
        if (pcts < 50) {
            return "1";
        } else {
           return calculateResultWhenExamIsPassed(pcts); // pamiętaj o return przed nazwą metody, bo to jest metoda w metodzie i w else
        }
    }

    public static String calculateResultWhenExamIsPassed(int pcts){
        if(pcts < 60){
            return "2";
        }else if (pcts <70){
            return "3";
        }else if (pcts <80) {
            return "4";
        }else if (pcts <90) {
            return "5";
        }
            return "6";
        }
    }

