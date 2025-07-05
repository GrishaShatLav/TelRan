package HW_20.Basic.Tests;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


public class DateSortTest {
    @Test
     void test() {
        String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970" };
        String[] expected = { "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010" };
        LocalDate[] lDates = new LocalDate[dates.length];
        LocalDate[] lExpected= new LocalDate[dates.length];
        DateTimeFormatter formatterDash = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterSlash = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < dates.length; i++) {
            if(dates[i].charAt(2)=='-') {
                lDates[i] = LocalDate.parse(dates[i], formatterDash);
            } else if (dates[i].charAt(2)=='/') {
                lDates[i] = LocalDate.parse(dates[i], formatterSlash);

            }
        }
        for (int i = 0; i < expected.length; i++) {
            if(expected[i].charAt(2)=='-') {
                lExpected[i] = LocalDate.parse(expected[i], formatterDash);
            }
            else if(expected[i].charAt(2)=='/'){
                lExpected[i] = LocalDate.parse(expected[i], formatterSlash);
            }
        }
        Comparator<LocalDate> comp = (d1, d2) -> d1.compareTo(d2); // TODO: implement comparator
        Arrays.sort(lDates, comp);
        assertArrayEquals(lExpected, lDates);
    }
}
