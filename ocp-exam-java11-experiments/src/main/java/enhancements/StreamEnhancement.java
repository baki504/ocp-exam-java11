package enhancements;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java 9 or later
public class StreamEnhancement {

    public static void main(String[] args) {

        List.of(1, 3, 5, 7, 9).stream()
                .takeWhile(i -> i < 5)
                .forEach(System.out::print); // 13

        System.out.println("\n---");

        List.of(1, 3, 5, 7, 9).stream()
                .dropWhile(i -> i < 5)
                .forEach(System.out::print); //579

        System.out.println("\n---");

        System.out.println(
                Stream.iterate(1, i -> i * 2)
                        .dropWhile(n -> n < 1000)
                        .limit(10)
                        .map(n -> "" + n)
                        .collect(Collectors.joining(", ")));

    }

}
