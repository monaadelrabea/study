package streams.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Name : StreamOfLines
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class StreamOfLines {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+");
        try {

            Map<String, Long> wordCounts = Files.lines(Paths.get("./src/streams/examples/words.txt")).map(
                    line -> line.replaceAll("\\W+\\s+", "")).flatMap(line -> pattern.splitAsStream(line)).collect(
                    Collectors.groupingBy(String::toUpperCase, TreeMap::new, Collectors.counting()));
            wordCounts.entrySet()
                    .stream()
                    .collect(
                            Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))
                    .forEach((letter, wordList) -> {
                        System.out.printf("%n%C%n", letter);
                        wordList.stream().forEach(
                                word -> System.out.printf("%s : %d%n", word.getKey(), word.getValue()));
                    });
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

}
