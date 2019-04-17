package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(name = "uid")
    String uid;

    @Column(name = "name")
    String name;

    @Column(name = "grade")
    Integer grade;

    @Column(name = "class")
    Integer classNumber;

    @Column(name = "monitor")
    Integer monitor;

    @Column(name = "password")
    String password;

    @Column(name = "major")
    String major;
}
