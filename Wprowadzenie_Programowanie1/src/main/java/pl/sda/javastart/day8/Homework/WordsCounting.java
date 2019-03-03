package pl.sda.javastart.day8.Homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordsCounting {
    private static final String PATH_TO_FILE = "d:\\programowanie\\nauka\\romeo_juliet.txt";

    public static void main(String[] args) {
        wordsCounting();
    }

    public static void wordsCounting() {
        try (FileReader fileReader = new FileReader(PATH_TO_FILE)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int counter = 0;

            while (line != null) {
                String[] words = line.split(" ");
                for (String singleWord : words) {
                    if(singleWord.length()>1){
                        counter++;
                    }
                }
                line = bufferedReader.readLine();
            }
            System.out.println(counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
