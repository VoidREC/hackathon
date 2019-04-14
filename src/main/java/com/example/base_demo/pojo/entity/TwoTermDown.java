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

    @Column(name = "order1")
    Integer order1;

    @Column(name = "计算机组成原理实践")
    Integer practiceOfComputerCompositionPrinciple;

    @Column(name = "order2")
    Integer order2;

    @Column(name = "计算机网络")
    Integer computerNetwork;

    @Column(name = "order3")
    Integer order3;

    @Column(name = "概率论与数理统计")
    Integer probabilityTheoryAndMathematicalStatistics;

    @Column(name = "order4")
    Integer order4;

    @Column(name = "汇编语言程序设计")
    Integer assemblyLanguageProgramming;

    @Column(name = "order2")
    Integer order5;

    @Column(name = "马克思主义基本原理")
    Integer basicPrinciplesOfMarxism;

    @Column(name = "order6")
    Integer order6;

    @Column(name = "total")
    Double total;

    @Column(name = "order7")
    Integer order7;
}
