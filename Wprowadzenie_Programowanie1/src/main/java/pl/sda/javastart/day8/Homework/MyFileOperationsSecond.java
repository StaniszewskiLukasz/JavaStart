package pl.sda.javastart.day8.Homework;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyFileOperationsSecond {
    private static final String PATH_TO_FILE = "d:\\programowanie\\nauka\\romeo_juliet.txt";

    public static void main(String[] args) {
        List l = readFileInList(PATH_TO_FILE);

        Iterator<String> itr = l.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }

    public static List<String> readFileInList(String fileName) {

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(PATH_TO_FILE), StandardCharsets.UTF_8);
        } catch (IOException e) {

            e.printStackTrace();
        }
        return lines;
    }

}
