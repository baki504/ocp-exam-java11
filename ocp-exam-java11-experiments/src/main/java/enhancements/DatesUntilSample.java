package enhancements;

import java.time.LocalDate;
import java.time.Period;

// Java 9 or later
public class DatesUntilSample {

    public static void main(String[] args) {

        LocalDate.now()
                .datesUntil(LocalDate.now().plusMonths(1))
                .forEach(System.out::println);

        System.out.println("----------");

        LocalDate.now()
                .datesUntil(LocalDate.now().plusMonths(1), Period.ofWeeks(1))
                .forEach(System.out::println);
    }

}
