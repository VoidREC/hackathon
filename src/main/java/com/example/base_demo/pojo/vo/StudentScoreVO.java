package com.example.base_demo.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@ToString
public class StudentScoreVO implements Serializable {

    Integer scienceIntroduction;

    Integer cognitivePractice;

    Integer advancedMathematicsBPart1;

    Integer highLevelLanguageProgramming;

    Integer highLevelLanguageProgrammingPractice;

    Integer linearAlgebra;

    Integer collegePhysicsAPart1;

    Integer universityPhysicsExperimentsAPart1;

    Integer advancedMathematicsBPart2;

    Integer basicCircuitsAndElectronics;

    Integer comprehensiveExperimentOfElectronicCircuit;

    Integer objectOrientedProgramming;

    Integer collegePhysicsAPart2;

    Integer universityPhysicsExperimentsAPart2;

    Integer discreteMathematics;

    Integer digitalCircuitAndLogicDesign;

    Integer digitalLogicCircuitDesignExperiments;

    Integer algorithmsAndDataStructure;

    Integer principleOfComputerCompositionA;

    Integer practiceOfComputerCompositionPrinciple;

    Integer computerNetwork;

    Integer probabilityTheoryAndMathematicalStatistics;

    Integer assemblyLanguageProgramming;

    Integer basicPrinciplesOfMarxism;

    Double average;
}
