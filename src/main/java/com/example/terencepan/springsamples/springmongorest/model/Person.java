package com.example.terencepan.springsamples.springmongorest.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;


@Document(collection = "persons")
public class Person {
    @Id
    private String id;
    @NotNull
    private String firstName;
    private String middleName;
    private String lastName;
    private String personDivision;
    private String idCode;
    private String personPosition;
    private String encryptedPassword;
    private List<String> userRoles;
    private boolean isUserActivated;
    @Indexed(unique=true)
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonDivision() {
        return personDivision;
    }

    public void setPersonDivision(String personDivision) {
        this.personDivision = personDivision;
    }

    public String getidCode() {
        return idCode;
    }

    public void setidCode(String idCode) {
        this.idCode = idCode;
    }

    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public boolean getIsUserActivated() {
        return isUserActivated;
    }

    public void setIsUserActivated(boolean isUserActivated) {
        this.isUserActivated = isUserActivated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(middleName, person.middleName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(personDivision, person.personDivision) &&
                Objects.equals(idCode, person.idCode) &&
                Objects.equals(personPosition, person.personPosition) &&
                Objects.equals(encryptedPassword, person.encryptedPassword) &&
                Objects.equals(isUserActivated, person.isUserActivated) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, personDivision, idCode, personPosition, encryptedPassword, isUserActivated, email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personDivision='" + personDivision + '\'' +
                ", idCode='" + idCode + '\'' +
                ", personPosition='" + personPosition + '\'' +
                ", encryptedPassword=" + encryptedPassword + '\'' +
                ", isUserActivated=" + isUserActivated + '\'' +
                ", email=" + email +
                '}';
    }
}
