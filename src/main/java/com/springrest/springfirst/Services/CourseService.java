package com.springrest.springfirst.Services;

import com.springrest.springfirst.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
   public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public void deleteCourse(long courseId);
    public Course updateCourse(Course course);
}
