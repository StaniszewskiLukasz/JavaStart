package pl.sda.javastart.day4.Homework;

public class MultiplicationTableExercise35 {
    public static void main(String[] args) {
        table(8);
    }

    /*Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem
    podwójnej pętli for (rozmiar podajemy przez parametr).
    Wskazówka: dla zwiększenia czytelności skorzystaj z tabulatora.
    Podaj rozmiar tabliczki mnozenia: 8  */
    public static void table(int size) {
        for (int i = 0; i < 2; i++) { // ta podwójna pętla steruje dwiema pierwszymi liniami by wydrukować poziome indexy pól
            for (int j = 1; j <= size; j++) {
                if (i == 1) {
                    System.out.print("-----");
                } else {
                    System.out.print("\t"+ j);
                }
            }
            System.out.println();
        }
        for (int k = 1; k <= size; k++) { // ta podwójna pętla steruje wydrukiem tablicy mnożenia i indexami pionowymi
            System.out.print(k + "|");
            System.out.print("\t");
            for (int l = 1; l <= size; l++) {
                System.out.print(k * l);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

