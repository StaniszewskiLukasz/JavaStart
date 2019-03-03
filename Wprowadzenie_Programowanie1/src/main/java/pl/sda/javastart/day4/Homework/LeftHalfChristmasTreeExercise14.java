package pl.sda.javastart.day4.Homework;

public class LeftHalfChristmasTreeExercise14 {
    public static void main(String[] args) {
        leftHalfChristmasTreeLeftEdge(15);
        leftHalfChristmasTreeRightEdge(23);
    }

    public static void leftHalfChristmasTreeLeftEdge(int height) { // lewa krawędź równa
        int i,j,k;
        for (i = 0; i < height; i++) {// ilość wierszy
            for(j=height+(height/2); j>i; j--){ //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                System.out.print(" ");}
            for (k = 0; k <= i; k++) { // ilość kolumn
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Poniżej metoda RightEdge");
    }

    public static void leftHalfChristmasTreeRightEdge(int height) { //prawa krawędź równa
        int i,j,k;
        for (i = 0; i < height; i++) {// ilość wierszy
            if(height<=9){
                for (j = height - 1; j >= i; j--) { //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                    System.out.print(" ");}
                for (k = 0; k <= i; k++) { // ilość kolumn
                    System.out.print(i+1);
                }
            }
            if(height>9){
                if(i<9){
                    for(j = height*2 -1; j >= i; j--){ //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                        System.out.print(" ");}
                    for (k = 0; k <= i; k++) { // ilość kolumn
                        System.out.print(i+1);
                    }
                }
            }
            if(height>9){
                if(i>=9) {
                    for (j = (height+1)+(height/2)-(i-9); j>=i; j--) { //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                        System.out.print(" ");}
                    for (k = 0; k <= i; k++) { // ilość kolumn
                        System.out.print(i+1);
                    }
                    }
                }

            System.out.println();
        }
    }
}
