package com.springrest.springfirst.controller;
import com.springrest.springfirst.Services.CourseService;
import com.springrest.springfirst.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost/3000")
public class MyController {

    @Autowired  //performs dependency injection creates object and injects it into below interface's reference variable
    //private CourseServiceImplementation courseService; //reference variable (my way)
    private CourseService courseService; //conventional

    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
//        return this.getCourses(); //is giving stackoverflow error
         return this.courseService.getCourses();  //conventional
      //  return courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }




    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    //read below code
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable long courseId){
        try{
            this.courseService.deleteCourse(courseId);
//            HttpHeaders headers = new HttpHeaders();  trial for adding header
//            headers.add("Custom-Header", "foo");
            return new ResponseEntity<>("Course deleted successfully ", HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("problem in deleting object", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }




}
