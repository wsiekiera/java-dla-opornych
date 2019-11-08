package net.siekiera.tasks.lekcja3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * We don't want our ranges to overlap. This validator should check if ranges overlap or not.
 *
 * # Add to ArrayList list.add(Object o)
 * # Get from ArrayList list.get(int index)
 * # Compare dates date1.isBefore(LocalDateTime date2), date1.isAfter(LocalDateTime date2),
 * date1.isEqual(LocalDateTime date2)
 *
 * https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
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
        if (this.dateTimeRangeList.size() < 2) return false;

        // Arrays.sort(this.dateTimeRangeList); czeeeeeeeeeeemuuuuuuuuuuu nie pozwala?....

        Arrays.sort(new List[]{this.dateTimeRangeList}); // o co tu chodzi?....

        for(int i = 0; i < this.dateTimeRangeList.size() - 1; i++) {
            if ( !(this.dateTimeRangeList.get(i).getEndDate().isBefore(this.dateTimeRangeList.get(i+1).getStartDate())) ) return true;
        }
        return false;
    }

    /**
     * Add range to list.
     * @param dateTimeRange
     */
    public void addRange(DateTimeRange dateTimeRange) {
        this.dateTimeRangeList.add(dateTimeRange);
    }
}