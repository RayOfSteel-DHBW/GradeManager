package com.school;

import java.util.ArrayList;

import javax.security.auth.Course;

public class GradeDataRepository {
    private GradeDataClient gradeDataClient;

public GradeDataRepository(GradeStorageMode gradeStorageMode) {
        this.gradeDataClient = GradeDataClientFactory.GetDataClient(gradeStorageMode);
    }

    public ArrayList<Grade> GetGrades(String courseName){
        return gradeDataClient.GetGrade(courseName);

    }

    public Subject GetSubject(String subjectName)
    {
        return gradeDataClient.GetCourse(CourseName);
    }

    public ArrayList<Course> GetAllCourses()
    {
        return gradeDataClient.GetAllCourses();
    }

    public ArrayList<Grade> GetAllGrades()
    {
        return gradeDataClient.GetAllGrades();
    }

    public void AddGrade(Grade grade)
    {
        gradeDataClient.AddGrade(grade);
    }

    public void AddCourse(Course Course)
    {
        gradeDataClient.AddCourse(Course);
    }

    public void DeleteCourse(Course Course)
    {
        gradeDataClient.DeleteCourse(Course);
    }

    public void DeleteGrade(Course Course)
    {
        gradeDataClient.DeleteGrade(Course);
    }



}

