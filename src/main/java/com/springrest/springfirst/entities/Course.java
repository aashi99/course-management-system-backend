package com.springrest.springfirst.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String courseTitle;
    private String description;

    public long getId() {
        return id;
    }

    public Course(long id, String courseTitle, String description) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.description = description;
    }

    public Course(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseTitle='" + courseTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
