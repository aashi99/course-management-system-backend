package com.springrest.springfirst.Services;

import com.springrest.springfirst.dao.CourseDao;
import com.springrest.springfirst.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService{

//    List<Course> courseList;

    @Autowired
    private CourseDao courseDao;


    public CourseServiceImplementation(){
//        courseList=new ArrayList<Course>();
//
//        courseList.add(new Course(145,"Java Core Course","this course contains basics of java"));
//        courseList.add(new Course(4343,"Spring Boot course","creating rest api using spring boot"));
    }

     @Override
    public List<Course> getCourses(){

        return courseDao.findAll();   //working
//        return courseList;
    }

//    @Override
//    public Course getCourse(long courseId){
//        Course c = null;
//        for(Course course: courseList){
//            if(course.getId()==courseId)
//            {
//                c=course;
//                break;
//            }
//        }
//        return c;
//        return courseDao.findById(courseId);

//        return courseDao.getOne(courseId);
//    }


       @Override
  public Course getCourse(long courseId){
      // return courseDao.getOne(courseId);
           return courseDao.findById(courseId).get();
   }



    @Override
    public Course addCourse(Course course){   //working
//        courseList.add(course);
//        System.out.println("course added successfully");

        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {   //working
//        courseList=this.courseList
//                .stream()
//                .filter(e->e.getId()!=courseId)
//                .collect(Collectors.toList());
        Course entity=courseDao.getOne(courseId);
        courseDao.delete(entity);
    }

    @Override
    public Course updateCourse( Course course) {  //working
//        courseList.forEach(e->{
//            if(course.getId()==e.getId()){
//                e.setCourseTitle(course.getCourseTitle());
//                e.setDescription(course.getDescription());
//            }
//
//        });
//        courseList.add(course);
        courseDao.save(course);
        return course;
    }
}
