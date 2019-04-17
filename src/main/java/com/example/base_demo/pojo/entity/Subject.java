package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;

@Setter
@Getter
@ToString
@Table(name = "subject")
public class Subject {

    @Column(name = "id")
    Integer id;

    @Column(name = "term")
    Integer term;

    @Column(name = "subject_name")
    String subjectName;
}
