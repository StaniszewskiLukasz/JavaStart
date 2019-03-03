package pl.sda.javastart.day4.Homework;

public class RectangleExercise38 {
    public static void main(String[] args) {
        rectanglePrint(10, 3);
    }

    // Utwórz metodę, która wyświetli prostokąt o podanych wymiarach (użytkownik podaje jego wymiary jako parametry)
    public static void rectanglePrint(int width, int height) {
        for (int i = 0; i < height; i++) { // ta pętla steruje wysokością prostokąta
            for (int j = 0; j < width; j++) { // ta pętla steruje wydrukiem na szerokość
                if (i == 0 || i == height - 1) { // tan warunek zadrukowuje górną i dolną ścianę prostokąta
                    System.out.print("X");
                } else if (j == 0 || j == width - 1) { // ten warunek zadrukowuje boczne ściany prostokąta
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
