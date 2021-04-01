package lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileReader {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = Files.lines(Path.of("data.txt"))
                .flatMap(line -> Arrays.stream(line.split(" +")))
                .filter(line -> !line.isBlank())
                .collect(Collectors.toMap(
                        Function.identity(),
                        val -> 1,
                        Integer::sum
                ));

        System.out.println(map);

        map.entrySet()
                .stream()
                .sorted(Comparator.comparing(o -> -o.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue() + " times in text"));
    }
}
