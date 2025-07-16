package HW_22.tests;

import java.time.LocalDate;

import HW_22.model.DateOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @Test
    void testGetAge() {
        assertEquals(64, DateOperation.getAge("12/04/1961"));
        assertEquals(63, DateOperation.getAge("1961-10-10"));
    }

    @Test
    void testSortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        assertArrayEquals(expected, actual);

    }
}

