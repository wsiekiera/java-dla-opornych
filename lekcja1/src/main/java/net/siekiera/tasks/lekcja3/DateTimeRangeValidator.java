package net.siekiera.tasks.lekcja3;

import java.util.ArrayList;
import java.util.List;

/**
 * We don't want our ranges to overlap. This validator should check if ranges overlap or not.
 *
 * # Add to ArrayList list.add(Object o)
 * # Get from ArrayList list.get(int index)
 * # Compare dates date1.isBefore(LocalDateTime date2), date1.isAfter(LocalDateTime date2),
 * date1.isEqual(LocalDateTime date2)
 *
 */
public class DateTimeRangeValidator {
    private List<DateTimeRange> dateTimeRangeList;

    public DateTimeRangeValidator() {
        this.dateTimeRangeList = new ArrayList<>();
    }

    /**
     * Returns true if ranges in list overlap at least once.
     *
     * @return
     */
    public boolean doTheyOverlap() {
        //TODO implement me
        return true;
        }

    /**
     * Add range to list.
     * @param dateTimeRange
     */
    public void addRange(DateTimeRange dateTimeRange) {
        this.dateTimeRangeList.add(dateTimeRange);
    }
}
