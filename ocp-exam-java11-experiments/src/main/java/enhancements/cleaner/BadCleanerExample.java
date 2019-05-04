package enhancements.cleaner;

import java.lang.ref.Cleaner;

// This feature isn't listed in the exam objectives
// Java 9 or later
public class BadCleanerExample {

    private String msg;

    public BadCleanerExample(String msg) {
        this.msg = msg;
        Cleaner.create()
                .register(
                        this,
                        () -> System.out.println(this.msg));
    }

}
