package com.example.base_demo.pojo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "大二上")
public class TwoTermUp {

    @Id
    @Column(name = "uid")
    String uid;

    @Column(name = "大学物理A下")
    Integer collegePhysicsAPart2;

    @Column(name = "大学物理实验A下")
    Integer universityPhysicsExperimentsAPart2;

    @Column(name = "离散数学")
    Integer discreteMathematics;

    @Column(name = "数字电路与逻辑设计")
    Integer digitalCircuitAndLogicDesign;

    @Column(name = "数字逻辑电路设计实验")
    Integer digitalLogicCircuitDesignExperiments;

    @Column(name = "算法与数据结构")
    Integer algorithmsAndDataStructure;

    @Column(name = "average")
    Double average;
}
