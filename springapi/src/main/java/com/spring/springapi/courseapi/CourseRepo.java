package com.spring.springapi.courseapi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course,Integer> {
    public List<Course> findByTopicId(int id);
}
