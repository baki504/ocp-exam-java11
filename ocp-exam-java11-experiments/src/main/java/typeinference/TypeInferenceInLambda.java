package typeinference;

import java.util.List;
import java.util.function.BiFunction;

public class TypeInferenceInLambda {

    public static void main(String[] args) {

        // Java 10 or later
        var l = List.of(1, 2, 3);
        l.stream().forEach(System.out::print);

        System.out.println("\n" + l.getClass());

        // Java 11 or later
        List<String> list = List.of("1", "2", "3");
        list.stream().forEach((var s) -> {
            System.out.println(s);
        });

        BiFunction<Integer, Integer, Integer> f = (var x, var y) -> {
            return x + y;
        };
        System.out.println(f.apply(10, 10));

        // Bad Examples
        //        BiFunction<Integer,Integer,Integer> ff = (Integer x,var y) -> {
        //            return x + y;
        //        };
        //        BiFunction<Integer,Integer,Integer> ff = (x,var y) -> {
        //            return x + y;
        //        };
    }

}
