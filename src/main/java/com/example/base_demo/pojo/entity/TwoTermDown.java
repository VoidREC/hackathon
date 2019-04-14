package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "大二下")
public class TwoTermDown {

    @Id
    @Column(name = "uid")
    Integer uid;

    @Column(name = "计算机组成原理A")
    Integer principleOfComputerCompositionA;

    @Column(name = "计算机组成原理实践")
    Integer practiceOfComputerCompositionPrinciple;

    @Column(name = "计算机网络")
    Integer computerNetwork;

    @Column(name = "概率论与数理统计")
    Integer probabilityTheoryAndMathematicalStatistics;

    @Column(name = "汇编语言程序设计")
    Integer assemblyLanguageProgramming;

    @Column(name = "马克思主义基本原理")
    Integer basicPrinciplesOfMarxism;

    @Column(name = "average")
    Double average;
}