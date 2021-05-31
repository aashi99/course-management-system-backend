package com.springrest.springfirst.dao;

import com.springrest.springfirst.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
