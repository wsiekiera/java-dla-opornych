package net.siekiera.tasks.lekcja3;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

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
        this.dateTimeRangeList.sort(DateTimeRangeComparator);
        for(int i = 0; i < this.dateTimeRangeList.size() - 1; i++) {
            if(this.dateTimeRangeList.get(i).checkOverlap(this.dateTimeRangeList.get(i+1))) return true;
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

    public static Comparator<DateTimeRange> DateTimeRangeComparator = new Comparator<DateTimeRange>() {
        public int compare(DateTimeRange a, DateTimeRange b) {
            return a.compareTo(b);
        }
    };
}
