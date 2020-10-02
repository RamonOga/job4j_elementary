package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stupid = new Student();
        stupid.setFirstName("Ahmed");
        stupid.setSurname("Mamadjanov");
        stupid.setPatronymic("Ogli");
        stupid.setGroup(3124);
        stupid.setAdmission(new Date());

        System.out.println("Student name is :" + stupid.getFirstName() + "\n"
                + "His surname is " + stupid.getSurname() + "\n"
                + "His patronymic name is " + stupid.getPatronymic() + "\n"
                + "His group is " + stupid.getGroup() + "\n"
                + "He entered the collage " + stupid.getAdmission() + "\n"
        );
    }
}
