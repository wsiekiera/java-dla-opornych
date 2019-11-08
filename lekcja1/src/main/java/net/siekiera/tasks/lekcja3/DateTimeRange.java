package net.siekiera.tasks.lekcja3;

import java.time.LocalDateTime;

public class DateTimeRange implements Comparable<DateTimeRange>{
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public DateTimeRange(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public int compareTo(DateTimeRange o) {
        return 0;
    }
}
