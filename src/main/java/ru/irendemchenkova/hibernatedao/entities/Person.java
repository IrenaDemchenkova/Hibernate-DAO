package ru.irendemchenkova.hibernatedao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONS")
public class Person {
    @Id
    @Column(length = 100)
    public String name;

    @Column(length = 100)
    public String surname;

    public int age;

    @Column(length = 10)
    public String phoneNumber;

    @Column(length = 30)
    public String cityOfLiving;
}
