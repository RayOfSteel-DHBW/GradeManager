package com.school;

public class Grade {
    
    private Subject subject;
    private double value;

    public Grade(Subject subject, double value) {
        this.subject = subject;
        this.value = value;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getValue() {
        return value;
    }
}
