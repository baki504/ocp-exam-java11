package enhancements.cleaner;

import java.lang.ref.Cleaner;

// Java 9 or later
public class CleanerExample {

    String msg;

    public static void main(String[] args) {
        CleanerExample example = new CleanerExample();
        Cleaner.create()
                .register(
                        example,
                        () -> System.out.println("from cleaner"));
    }

}
