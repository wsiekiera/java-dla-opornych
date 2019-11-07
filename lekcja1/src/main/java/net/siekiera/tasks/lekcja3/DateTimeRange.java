package net.siekiera.tasks.lekcja3;

import java.time.LocalDateTime;

public class DateTimeRange {
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
}
