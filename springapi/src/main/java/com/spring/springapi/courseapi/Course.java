package com.spring.springapi.courseapi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.spring.springapi.topic.Topic;

@Entity
public class Course {
    @Id
    private int id;
    private String name;
    private int age;
    @ManyToOne
    private Topic topic;

    public Course() {
        
    }
    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    public Course(int id, String name, int age,int topicId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.topic = new Topic(topicId,"",0);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Topic [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
  
    
    
}
