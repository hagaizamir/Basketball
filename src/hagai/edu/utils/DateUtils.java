package hagai.edu.utils;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    //What is the date and time now
    public static LocalDateTime now() {
        return LocalDateTime.now();
    }

    //How many Years from now?
    public static long howManyYearsFromNow(LocalDateTime date) {
        LocalDateTime now = LocalDateTime.now();
        return date.until(now, ChronoUnit.YEARS);
    }

    //How many Years between two dates?
    public static long differenceInYears(LocalDateTime from, LocalDateTime to) {
        return to.until(from, ChronoUnit.YEARS);
    }

    //input a date:
    public static LocalDateTime getDate(String prompt) {
        int year = IO.getInt("Enter the year", 1900, 2200);
        int month = IO.getInt("Enter the month", 1, 12);
        int day = IO.getInt("Enter the day", 1, 31);

        return LocalDateTime.of(year, month, day, 0, 0);
    }

    public void howManySeconds(LocalDateTime from) {
        LocalDateTime now = LocalDateTime.now();

        now.until(from, ChronoUnit.SECONDS);

        LocalDateTime birthDate = LocalDateTime.of(1980, 1, 1, 12, 0);
    }
}
 