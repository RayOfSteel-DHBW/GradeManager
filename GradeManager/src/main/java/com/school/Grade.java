package com.school;

public class Grade {
    
    public String name;
    public String courseName;
    public int index;
    public double weighting; // 30% of final grade => weighting = 0.3;
    public double score; // 1.0 - 5.0

    public Grade(String courseName, String gradeName, double value) {
        this(courseName, gradeName, value, 1.0);
    }

    public Grade(String courseName, String gradeName, double value, double weighting) {
        this.courseName = courseName;
        this.name = gradeName;
        this.score = value;
        this.weighting = weighting;
    }

}
