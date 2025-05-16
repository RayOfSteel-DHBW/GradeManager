package com.school;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GradeDataRepository {
    private GradeDataClient gradeDataClient;

public GradeDataRepository(GradeStorageMode gradeStorageMode) {
        this.gradeDataClient = GradeDataClientFactory.GetDataClient(gradeStorageMode);
    }


    public ArrayList<Grade> GetGrades(String courseName) {
        ArrayList<Grade> grades = gradeDataClient.GetAllGrades();
        return grades.stream().filter(grade -> grade.courseName == courseName)
            .collect(Collectors.toCollection(ArrayList::new));
    }
    public Course GetCourse(String courseName)
    {
        return gradeDataClient.GetCourse(courseName);
    }
    public int GetGradeCount(Course course)
    {
        return gradeDataClient.GetAllGrades().size();
    };

    public ArrayList<Course> GetAllCourses()
    {
        return gradeDataClient.GetAllCourses();
    }

    public void AddGrade(Grade grade)
    {
        gradeDataClient.AddGrade(grade);
    }

    public void AddCourse(Course Course)
    {
        gradeDataClient.AddCourse(Course);
    }



}

