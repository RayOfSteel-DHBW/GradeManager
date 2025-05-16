package com.school;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class GradeDataRepository {
    private GradeDataClient gradeDataClient;

public GradeDataRepository(GradeStorageMode gradeStorageMode) {
        this.gradeDataClient = new GradeDataClient(gradeStorageMode);
    }

    public Grade GetGrade(string subjectName){
        return gradeDataClient.GetGrade(subjectName);

    }

    public Subject GetSubject(string subjectName)
    {
        return gradeDataClient.GetSubject(subjectName);
    }

    public ArrayList<Subject> GetAllSubjects()
    {
        return gradeDataClient.GetAllSubjects();
    }

    public ArrayList<Grade> GetAllGrades()
    {
        return gradeDataClient.GetAllGrades();
    }

    public void AddGrade(Grade grade)
    {
        gradeDataClient.AddGrade(grade);
    }

    public void AddSubject(Subject subject)
    {
        gradeDataClient.AddSubject(subject);
    }

    public void DeleteSubject(Subject subject)
    {
        gradeDataClient.DeleteSubject(subject);
    }

    public void DeleteGrade(Subject subject)
    {
        gradeDataClient.DeleteGrade(subject);
    }



}

