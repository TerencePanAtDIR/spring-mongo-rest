package com.example.terencepan.springsamples.springmongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Document(collection = "timesheets")
public class Timesheet {
    @Id
    private String id;
    private List<DayWorked> daysWorked;
    private Boolean timesheetSigned;
    private LocalDateTime timesheetSignedDate;
    private LocalDate periodStart;
    private LocalDate periodEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<DayWorked> getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(List<DayWorked> daysWorked) {
        this.daysWorked = daysWorked;
    }

    public Boolean getTimesheetSigned() {
        return timesheetSigned;
    }

    public void setTimesheetSigned(Boolean timesheetSigned) {
        this.timesheetSigned = timesheetSigned;
    }

    public LocalDateTime getTimesheetSignedDate() {
        return timesheetSignedDate;
    }

    public void setTimesheetSignedDate(LocalDateTime timesheetSignedDate) {
        this.timesheetSignedDate = timesheetSignedDate;
    }

    public LocalDate getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(LocalDate periodStart) {
        this.periodStart = periodStart;
    }

    public LocalDate getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(LocalDate periodEnd) {
        this.periodEnd = periodEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timesheet timesheet = (Timesheet) o;
        return Objects.equals(id, timesheet.id) &&
                Objects.equals(daysWorked, timesheet.daysWorked) &&
                Objects.equals(timesheetSigned, timesheet.timesheetSigned) &&
                Objects.equals(timesheetSignedDate, timesheet.timesheetSignedDate) &&
                Objects.equals(periodStart, timesheet.periodStart) &&
                Objects.equals(periodEnd, timesheet.periodEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, daysWorked, timesheetSigned, timesheetSignedDate, periodStart, periodEnd);
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "id=" + id +
                ", daysWorked=" + daysWorked +
                ", timesheetSigned=" + timesheetSigned +
                ", timesheetSignedDate=" + timesheetSignedDate +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                '}';
    }
}
