package com.example.base_demo.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class OneScoreVO implements Serializable{

    String uid;

    String name;

    Integer classNumber;

    Integer term;

    Integer total;

    String percent;

    List<SubjectInfo> SubjectInfo;

    @Getter
    @Setter
    public static class SubjectInfo implements Serializable{

        String subjectName;

        Integer rank;

        Integer classNumber;

        Integer score;

        Integer term;

        String average;

        String excellentRate;

        String passRate;
    }
}
