package com.spring.springapi.courseapi;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    
    public List<Course> getAllCourses(int topicId) {

        List<Course>courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId)
                .forEach(courses::add);



        return courses;
    }
    public Optional<Course> getCourse(int id){
       
        return courseRepo.findById(id);



    }
    public void addCourse(Course course ){
        courseRepo.save(course);
    }
    public void updateCourse(Course course) {
    
        courseRepo.save(course);
    }
    public void deleteCourse(int id) {
        //topics.removeIf(t->t.getId() == id);
        courseRepo.deleteById(id);
    }
}
