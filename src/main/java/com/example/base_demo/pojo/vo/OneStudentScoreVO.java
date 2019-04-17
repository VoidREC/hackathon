package com.example.base_demo.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class OneStudentScoreVO implements Serializable {

    Integer score;
    Integer rank;
    String subjectName;
}
