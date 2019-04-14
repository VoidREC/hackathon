package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "uid")
    String uid;

    @Column(name = "name")
    String name;

    @Column(name = "grade")
    Integer grade;

    @Column(name = "class")
    Integer className;

    @Column(name = "monitor")
    Integer monitor;

    @Column(name = "password")
    String password;
}
