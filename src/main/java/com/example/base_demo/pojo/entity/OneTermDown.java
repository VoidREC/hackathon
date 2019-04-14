package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "大一下")
public class OneTermDown {

    @Id
    @Column(name = "uid")
    String uid;

    @Column(name = "大学物理A上")
    Integer collegePhysicsAPart1;

    @Column(name = "大学物理实验A上")
    Integer universityPhysicsExperimentsAPart1;

    @Column(name = "高等数学B下")
    Integer advancedMathematicsBPart2;

    @Column(name = "基础电路与电子学")
    Integer basicCircuitsAndElectronics;

    @Column(name = "电子线路综合实验")
    Integer comprehensiveExperimentOfElectronicCircuit;

    @Column(name = "面向对象程序设计")
    Integer objectOrientedProgramming;

    @Column(name = "average")
    Double average;
}
