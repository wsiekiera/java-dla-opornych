package net.siekiera.tasks.lekcja3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDateTime;

public class DateTimeRangeValidatorTest {

    LocalDateTime start1;
    LocalDateTime end1;
    LocalDateTime start2;
    LocalDateTime end2;
    LocalDateTime start3;
    LocalDateTime end3;
    LocalDateTime start4;
    LocalDateTime end4;

    DateTimeRange range1;
    DateTimeRange range2;
    DateTimeRange range3;
    DateTimeRange range4;

    @Before
    public void prepareTestData() {
        start1 = LocalDateTime.of(2019, 11, 6, 17, 0, 0);
        end1 = LocalDateTime.of(2019, 11, 6, 18, 0, 0);
        start2 = LocalDateTime.of(2019, 11, 6, 19, 0, 0);
        end2 = LocalDateTime.of(2019, 11, 6, 20, 0, 0);
        start3 = LocalDateTime.of(2019, 11, 6, 21, 0, 0);
        end3 = LocalDateTime.of(2019, 11, 6, 22, 0, 0);
        start4 = LocalDateTime.of(2019, 11, 6, 10, 0, 0);
        end4 = LocalDateTime.of(2019, 11, 6, 19, 15, 0);

        range1 = new DateTimeRange(start1, end1);
        range2 = new DateTimeRange(start2, end2);
        range3 = new DateTimeRange(start3, end3);
        range4 = new DateTimeRange(start4, end4);

        // range4 overlaps with range1, range2 but not with range3
    }

    @Test
    public void emptyList() {
        DateTimeRangeValidator validator = new DateTimeRangeValidator();
        assertEquals(false, validator.doTheyOverlap());
    }

    @Test
    public void listWithOneEntry() {
        DateTimeRangeValidator validator = new DateTimeRangeValidator();
        validator.addRange(range1);
        assertEquals(false, validator.doTheyOverlap());
    }

    @Test
    public void listWithManyEntriesThatDontOverlap() {
        DateTimeRangeValidator validator = new DateTimeRangeValidator();
        validator.addRange(range1);
        validator.addRange(range2);
        validator.addRange(range3);
        assertEquals(false, validator.doTheyOverlap());
    }

    @Test
    public void listWithManyEntriesThatDoOverlap() {
        DateTimeRangeValidator validator = new DateTimeRangeValidator();
        validator.addRange(range1);
        validator.addRange(range2);
        validator.addRange(range3);
        validator.addRange(range4);
        assertEquals(true, validator.doTheyOverlap());
    }
}