package com.generation.model;

import com.generation.service.StudentService;

import java.lang.reflect.Array;
import java.util.*;

public class Student
    extends Person
    implements Evaluation
{
    private ArrayList<Course> enrolledCourses;

    float PASS_MIN_GRADE = 3.0f;


    public Student( String id, String name, String email, Date birthDate)
    {
        super( id, name, email, birthDate );
        enrolledCourses = new ArrayList<>();

    }

    public void enrollToCourse(Course course )
    {
        //TODO
        enrolledCourses.add(course);
    }

    @Override
    public List<Course> findPassedCourses()
    {
        return null;
    }

    private HashMap<String, Course>
    convertArrayListToHashMap(ArrayList<Course> arrayList)
    {
        HashMap<String, Course> newHashMap = new HashMap<>();
        for (Course c : arrayList) {
            newHashMap.put(c.getCode(), c);
        }
        return newHashMap;
    }

    public Course findCourseById( String courseId ) {
        //TODO return courseName when courseId is parsed
        HashMap<String, Course> courseMap = convertArrayListToHashMap(enrolledCourses);
        Course course = courseMap.get(courseId);
        return course;
    }



    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
