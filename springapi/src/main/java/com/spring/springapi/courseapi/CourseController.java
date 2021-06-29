package com.spring.springapi.courseapi;



import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.spring.springapi.topic.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getCourses(@PathVariable int id){
        return courseService.getAllCourses( id);
    }
    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Optional<Course> getById(@PathVariable int courseId){
        return courseService.getCourse(courseId);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable int topicId){
        course.setTopic(new Topic(topicId,"",0));
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Course course, @PathVariable int topicId,@PathVariable int courseId){
        course.setTopic(new Topic(topicId,"",0));
        courseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{topicId}/courses/{courseId}")
    public void deleteTopic(@PathVariable int courseId) {
        courseService.deleteCourse(courseId);
    }
}
