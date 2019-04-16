package com.example.terencepan.springsamples.springmongorest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "personroles")
public class PersonRoles {
    @Id
    private String id;
    private String roleTypeName;
    private String roleTypeDescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleTypeName() {
        return roleTypeName;
    }

    public void setRoleTypeName(String roleTypeName) {
        this.roleTypeName = roleTypeName;
    }

    public String getRoleTypeDescription() {
        return roleTypeDescription;
    }

    public void setRoleTypeDescription(String roleTypeDescription) {
        this.roleTypeDescription = roleTypeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonRoles that = (PersonRoles) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(roleTypeName, that.roleTypeName) &&
                Objects.equals(roleTypeDescription, that.roleTypeDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleTypeName, roleTypeDescription);
    }

    @Override
    public String toString() {
        return "PersonRoles{" +
                "id='" + id + '\'' +
                ", roleTypeName='" + roleTypeName + '\'' +
                ", roleTypeDescription='" + roleTypeDescription + '\'' +
                '}';
    }
}
