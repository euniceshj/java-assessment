package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students;
    protected Map<String, Double> courseGrades;
    public StudentService(){
        students = new HashMap<>();
        courseGrades = new HashMap<>();
    }

    public void subscribeStudent( Student student )
    {
        //TODO
        students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if (students.containsKey(studentId))
        {return students.get(studentId);}
        return null;
    }

    public void addGradesToCourse(String courseId, double grade){
        courseGrades.put(courseId, grade);
    }

    public HashMap<String, Double> getStudentCourseGrades(String studentId){
        HashMap<String, Double> courses = new HashMap<>();
        courses.put("studentId", courseGrades.get(studentId));
        return courses;
    }
    public boolean showSummary()
    {
        //TODO
        if (students != null) {
            for (Student s : students.values()) {
                System.out.println(s);
                for (Course c : s.getEnrolledCourses()){
                    System.out.println(c); 
                    if(courseGrades.containsKey(c.getCode())) {
                        System.out.println("Grade: " + courseGrades.get(c.getCode()));
                    }

                }
            }
            return true;
        }
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO get student from studentId, get student's enrolledCourses, add Course to student's enrolledCourses
        Student student = students.get(studentId);
        student.enrollToCourse(course);
    }
}
