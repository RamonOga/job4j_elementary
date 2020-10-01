package ru.job4j.hostital;

import java.time.LocalDate;

public class Profession {
    private int salary;
    private String name;
    private String surname;
    private String education;
    private LocalDate birthday;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
