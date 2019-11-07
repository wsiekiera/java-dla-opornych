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
        if (this.dateTimeRangeList.size() < 2) return false; // pusta, albo jednoelementowa lista (zakladajac, ze startDate<endDate)

        for (int compared = 0; compared < (dateTimeRangeList.size() - 1); compared++) {
            for (int i = compared + 1; i < dateTimeRangeList.size(); i++) {
                boolean StartDateAfterOtherEndDate = dateTimeRangeList.get(compared).getStartDate().isAfter(dateTimeRangeList.get(i).getEndDate());
                boolean EndDateAfterOtherEndDate = dateTimeRangeList.get(compared).getEndDate().isAfter(dateTimeRangeList.get(i).getEndDate());

                boolean EndDateBeforeOtherStartDate = dateTimeRangeList.get(compared).getEndDate().isBefore(dateTimeRangeList.get(i).getStartDate());
                boolean StartDateBeforeOtherStartDate = dateTimeRangeList.get(compared).getStartDate().isBefore(dateTimeRangeList.get(i).getStartDate());

                if ( !( (StartDateAfterOtherEndDate && EndDateAfterOtherEndDate) || (EndDateBeforeOtherStartDate && StartDateBeforeOtherStartDate) ) ) {
                    return true;
                }
            }
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
