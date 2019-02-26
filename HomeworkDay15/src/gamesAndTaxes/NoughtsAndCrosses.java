package gamesAndTaxes;

import java.util.Arrays;
import java.util.Scanner;

public class NoughtsAndCrosses {
    private static String[] board = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-"};
    private static Scanner scanner = new Scanner(System.in);
    private static int counter = 0;
    private static int endCounter = 0;

    public static void main(String[] args) {
        start();
        endGame();
    }

    private static void start() {
        boardPrinting();
        crossPrinting();
    }

    private static void boardPrinting() {
//    System.out.println(board[0],board[1]); // tak nie można
//    System.out.println(board); // tak można a;e zwróci miejsce w pamięci, a nie obiekt
//    for (int i = 0; i < board.length; i++) {
//        if (i < 3) {
//            System.out.print(board[i]);
//        } else if (i < 6) {
//            System.out.print(board[i]);  // tak można ale dużo pisania i problem by to wyszło 3 kreski w trzech wierszach
//        } else {
//            System.out.print(board[i]);
//        }
//    }
        System.out.print("0" + " | " + "1" + " | " + "2   ");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.print("3" + " | " + "4" + " | " + "5   ");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.print("6" + " | " + "7" + " | " + "8   ");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    private static void crossPrinting() {
        counter++;
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Postaw krzyżyk wybierając numer pola ");
        int field = scanner.nextInt();
        fieldsChecking(field);
        board[field] = "X";
        boardPrinting();
        checkingWhoWin();
        if (endCounter < 1) {
            noughtPrinting();
        } else {
            endGame();
        }
    }

    private static void noughtPrinting() {
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Postaw kółko wybierając numer pola ");
        int field = scanner.nextInt();
        fieldsChecking(field);
        board[field] = "O";
        checkingWhoWin();
        if (endCounter < 1) {
            start();
        } else {
            endGame();
        }
    }

    private static void fieldsChecking(int field) {
        if (board[field].equals("X")) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("To pole jest już zajęte. Wybierz inne.");
            crossPrinting();
        } else if (board[field].equals("O")) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("To pole jest już zajęte. Wybierz inne.");
            noughtPrinting();
        }
    }

    private static void checkingWhoWin() {
        boolean ifExist = true;
        if (counter >= 3) {
            if (board[0].equals("X") && board[1].equals("X") && board[2].equals("X") ||//SPR. POZIOM
                    board[3].equals("X") && board[4].equals("X") && board[5].equals("X") ||
                    board[6].equals("X") && board[7].equals("X") && board[8].equals("X") ||
                    board[0].equals("X") && board[3].equals("X") && board[6].equals("X") ||//SPR. PION
                    board[1].equals("X") && board[4].equals("X") && board[7].equals("X") ||
                    board[2].equals("X") && board[5].equals("X") && board[8].equals("X") ||
                    board[2].equals("X") && board[4].equals("X") && board[6].equals("X") ||//SPR. SKOS
                    board[0].equals("X") && board[4].equals("X") && board[8].equals("X")) {
                System.out.println(" X wygrywa!!! Gratulacje ");
                endCounter++;
            } else if (board[0].equals("O") && board[1].equals("O") && board[2].equals("O") ||//SPR. POZIOM
                    board[3].equals("O") && board[4].equals("O") && board[5].equals("O") ||
                    board[6].equals("O") && board[7].equals("O") && board[8].equals("O") ||
                    board[0].equals("O") && board[3].equals("O") && board[6].equals("O") ||//SPR. PION
                    board[1].equals("O") && board[4].equals("O") && board[7].equals("O") ||
                    board[2].equals("O") && board[5].equals("O") && board[8].equals("O") ||
                    board[2].equals("O") && board[4].equals("O") && board[6].equals("O") ||//SPR. SKOS
                    board[0].equals("O") && board[4].equals("O") && board[8].equals("O")) {
                System.out.println(" O wygrywa!!! Gratulacje ");
                endCounter++;
            }
        }
        if (counter >= 5) {
           ifExist = Arrays.asList(board).contains("-");
        }if(!ifExist){
           endCounter++;
        }
            }

    private static void endGame() {
        System.out.println("Koniec gry. Zagrajcie ponownie.");
    }
}