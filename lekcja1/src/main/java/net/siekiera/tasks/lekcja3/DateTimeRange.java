package net.siekiera.tasks.lekcja3;

import java.time.LocalDateTime;

public class DateTimeRange implements Comparable<DateTimeRange>{
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public DateTimeRange(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean checkOverlap(DateTimeRange o) {
        return this.startDate.isAfter(o.endDate) || this.endDate.isAfter(o.startDate);
    }

    @Override
    public int compareTo(DateTimeRange o) {
        return this.startDate.isBefore(o.startDate) ? -1 : this.startDate.isAfter(o.startDate) ? 1 : 0;
    }
}
