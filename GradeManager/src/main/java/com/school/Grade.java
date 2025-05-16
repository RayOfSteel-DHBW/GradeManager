package com.school;

public class Grade {
    
    private Course subject;
    private double value;

    public Grade(Course subject, double value) {
        this.subject = subject;
        this.value = value;
    }

    public Course getSubject() {
        return subject;
    }

    public double getValue() {
        return value;
    }
}
