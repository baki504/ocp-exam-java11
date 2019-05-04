package enhancements;

import java.util.ArrayList;
import java.util.List;

// Java 9 or later
public class DiamondInAnonymousClass {

    public static void main(String[] args) {

        // Compiler error in Java 8
        List<String> list = new ArrayList<>() {
            @Override
            public String toString() {
                return "Overridden";
            }
        };
    }

}
