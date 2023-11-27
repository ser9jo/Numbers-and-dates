package practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

        int previousYear = year - 1;
        System.out.println(collectBirthdays(previousYear, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" - dd.MM.yyyy - E", Locale.ENGLISH);
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int a = 0;
        String result = "";
        while (birthday.isBefore(today.plusDays(1))) {
            String date = a + formatter.format(birthday);
            result += date + System.lineSeparator();
            birthday = birthday.plusYears(1);
            a++;
        }
        return result;
    }
}
