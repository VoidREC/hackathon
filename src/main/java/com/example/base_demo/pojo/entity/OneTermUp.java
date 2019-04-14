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

    @Column(name = "order1")
    Integer order1;

    @Column(name = "认知实习")
    Integer cognitivePractice;

    @Column(name = "order2")
    Integer order2;

    @Column(name = "高等数学B（上）")
    Integer advancedMathematicsBPart1;

    @Column(name = "order3")
    Integer order3;

    @Column(name = "高级语言程序设计")
    Integer highLevelLanguageProgramming;

    @Column(name = "order4")
    Integer order4;

    @Column(name = "高级语言程序设计实践")
    Integer highLevelLanguageProgrammingPractice;

    @Column(name = "order5")
    Integer order5;

    @Column(name = "线性代数")
    Integer linearAlgebra;

    @Column(name = "order6")
    Integer order6;

    @Column(name = "total")
    Double total;

    @Column(name = "order7")
    Integer order7;
}
