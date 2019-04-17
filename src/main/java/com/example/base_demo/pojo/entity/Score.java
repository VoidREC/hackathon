package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Table(name = "score")
public class Score {

    @Column(name = "uid")
    String uid;

    @Column(name = "score")
    Integer score;
}
