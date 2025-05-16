package com.school;

import java.util.ArrayList;

public abstract class GradeDataClient {

    public Course GetCourse(String name)
    {
        ArrayList<Course> courses = GetAllCourses();
        return courses.stream().filter(course -> course.getName() == name)
            .findFirst()
            .orElse(null);
    }
    public abstract ArrayList<Course> GetAllCourses();
    public ArrayList<Grade> GetAllGrades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetAllGrades'");
    }

    public void AddGrade(Grade grade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddGrade'");
    }

}


