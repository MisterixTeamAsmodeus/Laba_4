package org.example.model;

import java.util.Objects;

public class People {
    long id;
    String name;
    Gender gender;
    Division division;
    long salary;
    String birthdate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        People people = (People) object;
        return id == people.id && salary == people.salary && Objects.equals(name, people.name) && gender == people.gender && Objects.equals(division, people.division) && Objects.equals(birthdate, people.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, division, salary, birthdate);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", division=" + division +
                ", salary=" + salary +
                ", birthdate='" + birthdate + '\'' +
                "}\n";
    }
}
