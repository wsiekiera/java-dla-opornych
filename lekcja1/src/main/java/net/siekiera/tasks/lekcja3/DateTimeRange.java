package net.siekiera.tasks.lekcja3;

import java.time.LocalDateTime;

public class DateTimeRange implements Comparable<DateTimeRange>{
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public DateTimeRange(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public int compareTo(DateTimeRange compareDateTimeRange) {
        LocalDateTime compareStartDate = compareDateTimeRange.getStartDate();
        if (this.startDate.isAfter(compareStartDate)) return 1;
        else if (this.startDate.isBefore(compareStartDate)) return -1;
        return 0;
    }
}