package com.example.terencepan.springsamples.springmongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "hoursbilled")
public class HoursBilled {
    @Id
    private String id;
    private Integer hoursBilled;
    private String billingAccount;
    private String billingType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getHoursBilled() {
        return hoursBilled;
    }

    public void setHoursBilled(Integer hoursBilled) {
        this.hoursBilled = hoursBilled;
    }

    public String getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(String billingAccount) {
        this.billingAccount = billingAccount;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoursBilled that = (HoursBilled) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(hoursBilled, that.hoursBilled) &&
                Objects.equals(billingAccount, that.billingAccount) &&
                Objects.equals(billingType, that.billingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hoursBilled, billingAccount, billingType);
    }

    @Override
    public String toString() {
        return "HoursBilled{" +
                "id=" + id +
                ", hoursBilled=" + hoursBilled +
                ", billingAccount='" + billingAccount + '\'' +
                ", billingType='" + billingType + '\'' +
                '}';
    }
}
