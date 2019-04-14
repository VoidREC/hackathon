package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "大一上")
public class OneTermUp {

    @Id
    @Column(name = "uid")
    String uid;

    @Column(name = "计算机学科导论")
    Integer scienceIntroduction;

    @Column(name = "认知实习")
    Integer cognitivePractice;

    @Column(name = "高等数学B（上）")
    Integer advancedMathematicsBPart1;

    @Column(name = "高级语言程序设计")
    Integer highLevelLanguageProgramming;

    @Column(name = "高级语言程序设计实践")
    Integer highLevelLanguageProgrammingPractice;

    @Column(name = "线性代数")
    Integer linearAlgebra;

    @Column(name = "average")
    Double average;
}
