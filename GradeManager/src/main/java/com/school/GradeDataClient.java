package com.school;

import java.util.ArrayList;

public abstract class GradeDataClient {

    public abstract ArrayList<Course> GetAllCourses();
    public abstract ArrayList<Grade> GetAllGrades();
    public abstract void AddCourse(Course course);
    public abstract void AddGrade(Grade grade);
}


