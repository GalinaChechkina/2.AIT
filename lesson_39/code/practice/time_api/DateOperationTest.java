package practice.time_api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAge() {
        System.out.println(DateOperation.getAge("17.06.1980"));
        assertEquals(62, DateOperation.getAge("1961 04 12"));
        assertEquals(61, DateOperation.getAge("25/12/1961"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        System.out.println(Arrays.toString(actual));
        //assertArrayEquals(expected, actual);
    }
}