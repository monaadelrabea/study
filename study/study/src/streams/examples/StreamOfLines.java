package streams.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

            Stream<String> lines = Files.lines(Paths.get("study/study/src/streams/examples/words.txt"));
            Stream<String> stringStream = lines.map(line -> line.replaceAll("\\W+", " "));
            Map<String, Long> wordCounts = stringStream.flatMap(pattern::splitAsStream).collect(
                    Collectors.groupingBy(String::toUpperCase, TreeMap::new, Collectors.counting()));

            TreeMap<Character, List<Map.Entry<String, Long>>> collect = wordCounts.entrySet().stream().collect(
                    Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()));
            collect.forEach((letter, wordList) -> {
                System.out.printf("%n%C%n", letter);
                wordList.forEach(word -> System.out.printf("%s : %d%n", word.getKey(), word.getValue()));
            });
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

}
