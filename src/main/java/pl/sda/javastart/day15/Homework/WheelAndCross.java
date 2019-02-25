package pl.sda.javastart.day15.Homework;

public class WheelAndCross {

    public static void main(String[] args) {
        tablePrinting();
    }

    private static String[] table = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-"};

    private static void tablePrinting() {

        for (int i = 0; i <table.length ; i++) {
            if(i<3){
                System.out.print(table[i]);
            }else if(i<6)

            System.out.println();
            System.out.println();
        }


    }
}
