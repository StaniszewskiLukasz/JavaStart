package pl.sda.javastart.Homework;


import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {//fixme
        grupowa();

    }
   /* public static void moja(){
        int minuta;
        int godzina;
        int rok;
        int miesiac;
        int dzien;

        LocalDateTime localTime1 = LocalDateTime.now();
        System.out.println(localTime1.getHour()+":"+localTime1.getMinute()+" "+localTime1.getDayOfMonth()+"."+localTime1.getMonthValue()+"."+localTime1.getYear());

    }*/

    public static void grupowa() {
        LocalDateTime actualTime = LocalDateTime.now();
        int month = actualTime.getMonthValue();
        int hour = actualTime.getHour();
        int day = actualTime.getDayOfYear();
        int year = actualTime.getYear();
        int minute = actualTime.getMinute();
        String hourValue;
        if (hour < 10) {
            hourValue = "0" + hour;
        } else {
//            hourValue = "" + hour; tak można zrobić by zmienić hour czyli int na String
            hourValue = Integer.toString(hour); // tak powinno się zamieniać integera czyli zmienną typu podstawowego na String
        }
        String minuteValue = minute < 10 ? "0" + minute : "" + minute;
        System.out.println(hourValue + ":" + minuteValue + " " + day + "." + month + "." + year);
        System.out.println("Od północy minęło " + (hour * 60 + minute)); // ważne są nawiasy bo inaczej przekształci się to na String

    }
}
