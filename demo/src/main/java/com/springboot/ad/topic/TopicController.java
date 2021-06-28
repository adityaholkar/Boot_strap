package com.springboot.ad.topic;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopic(){
        return topicService.getAllTopic();
    }
    @RequestMapping("/topics/{id}")
    public Topic getById(@PathVariable int id){
        return topicService.getTopic(id);
    }
}
