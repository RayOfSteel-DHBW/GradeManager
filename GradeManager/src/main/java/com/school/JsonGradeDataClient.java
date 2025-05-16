package com.school;

import java.util.ArrayList;

public class JsonGradeDataClient extends GradeDataClient{
    private String courseFileName = Constants.CoursesFileName+".json";
    private String gradeFileName = Constants.GradesFileName+".json";
    @Override
    public ArrayList<Course> GetAllCourses() {
        try {
            java.io.File file = new java.io.File(courseFileName);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            
            com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
            return mapper.readValue(file, 
                mapper.getTypeFactory().constructCollectionType(ArrayList.class, Course.class));
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        
    }

    @Override
    public ArrayList<Grade> GetAllGrades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetAllGrades'");
    }

    @Override
    public void AddCourse(Course course) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddCourse'");
    }

    @Override
    public void AddGrade(Grade grade) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddGrade'");
    }

}
