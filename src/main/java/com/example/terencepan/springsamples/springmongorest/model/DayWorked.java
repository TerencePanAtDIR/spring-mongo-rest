package com.example.terencepan.springsamples.springmongorest.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Document(collection = "daysworked")
public class DayWorked {
    @Id
    private Long id;
    private LocalDate dayWorked;
    private List<HoursBilled> hoursBilledList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDayWorked() {
        return dayWorked;
    }

    public void setDayWorked(LocalDate dayWorked) {
        this.dayWorked = dayWorked;
    }

    public List<HoursBilled> getHoursBilledList() {
        return hoursBilledList;
    }

    public void setHoursBilledList(List<HoursBilled> hoursBilledList) {
        this.hoursBilledList = hoursBilledList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayWorked dayWorked1 = (DayWorked) o;
        return Objects.equals(id, dayWorked1.id) &&
                Objects.equals(dayWorked, dayWorked1.dayWorked) &&
                Objects.equals(hoursBilledList, dayWorked1.hoursBilledList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dayWorked, hoursBilledList);
    }

    @Override
    public String toString() {
        return "DayWorked{" +
                "id=" + id +
                ", dayWorked=" + dayWorked +
                ", hoursBilledList=" + hoursBilledList +
                '}';
    }
}
