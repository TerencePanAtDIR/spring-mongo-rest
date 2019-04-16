package com.example.terencepan.springsamples.springmongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "payperiods")
public class PayPeriod {
    @Id
    private String id;
    private String month;
    private String year;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private int hours;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayPeriod payPeriod = (PayPeriod) o;
        return hours == payPeriod.hours &&
                Objects.equals(id, payPeriod.id) &&
                Objects.equals(month, payPeriod.month) &&
                Objects.equals(year, payPeriod.year) &&
                Objects.equals(periodStart, payPeriod.periodStart) &&
                Objects.equals(periodEnd, payPeriod.periodEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month, year, periodStart, periodEnd, hours);
    }

    @Override
    public String toString() {
        return "PayPeriod{" +
                "id='" + id + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                ", hours=" + hours +
                '}';
    }
}
