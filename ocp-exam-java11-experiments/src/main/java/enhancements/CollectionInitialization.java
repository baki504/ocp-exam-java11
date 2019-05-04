package enhancements;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Java 9 or later
public class CollectionInitialization {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        Set<String> set = Set.of("a", "b", "c");
        Map<String, Integer> map = Map.of(
                "a", 1,
                "b", 2,
                "c", 3,
                "d", 4,
                "e", 5,
                "f", 6,
                "h", 7,
                "h", 8,
                "i", 9,
                "j", 10
        //,"k", 11 // 要素は10個まで
        );

        Map<String, Integer> map2 = Map.ofEntries(
                Map.entry("A", 1),
                Map.entry("B", 2),
                Map.entry("C", 3),
                Map.entry("D", 4),
                Map.entry("E", 5),
                Map.entry("F", 6),
                Map.entry("G", 7),
                Map.entry("H", 8),
                Map.entry("I", 9),
                Map.entry("J", 10),
                Map.entry("K", 11) // 11以上でもOK
                );
    }
}
