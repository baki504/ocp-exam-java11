package enhancements.cleaner;

import java.lang.ref.Cleaner;

// Java 9 or later
public class GoodCleanerExample {

    private String msg;

    public GoodCleanerExample(String msg) {
        this.msg = msg;
        final String localMsg = msg;
        Cleaner.create()
                .register(
                        this,
                        () -> System.out.println(localMsg));
    }
}
