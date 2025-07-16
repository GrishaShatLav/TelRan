package HW_22.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class DateOperation {
    public static long getAge(String birthDate) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");

        LocalDate bD = LocalDate.parse(birthDate,df);
        //Сделал это лонгом, но можно было и в инт запарсить
        long age = ChronoUnit.YEARS.between(bD,LocalDate.now());
        return age;
    }

    public static String[] sortStringDates(String[] dates) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd][dd/MM/yyyy]");
        LocalDate[] datesSort = new LocalDate[dates.length];

        for (int i = 0; i < dates.length; i++) {
            datesSort[i] = LocalDate.parse(dates[i],df);
        }
        Arrays.sort(datesSort);
        for (int i = 0; i < dates.length; i++) {
            dates[i] = String.valueOf(datesSort[i]);

        }

        return dates;
    }
}
