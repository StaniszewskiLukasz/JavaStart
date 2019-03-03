package pl.sda.javastart.day4;

import java.util.Scanner;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersChristmasTree(15);
       DoubleTreeWithTrunk();
    }

    public static void printNumbersChristmasTree(int height){
        for (int i = 0; i < height; i++) {// ilość wierszy inkrementacja pętli zewnętrznej działa i się zapamiętuje, inkrementacja pętli wewnętrznej działa ale za każdym razem się resetuje
            for (int j = 0; j <= i; j++) { // ilość kolumn
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void DoubleTreeWithTrunk (){ // metoda drukująca przy pomocy pętl drzewo z podwójną koroną i pniem
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Row/Column Value::");
        int i,j,k,n;
        n=s.nextInt();
        for(i=1; i<n; i++){
            for(j=n+(n/2); j>i; j--){ //ta pętla drukuje puste miejsca, najpierw działa ta aż sie wyczerpie
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){ // ta pętla drukuje kropki rozszerzające się w kształcie drzewka
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n+(n/2); i++){ // ta pętla i jej dwie wewnetrzne drukuje to samo co na górze czyli drugie takie samo drzewko
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){  // ta pętla i jej dwie wewnętrzne drukują pień
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        }
    }
}
