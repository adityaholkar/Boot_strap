package com.spring.springapi.topic;



import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public Optional<Topic> getById(@PathVariable int id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/topics")
    public void postTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
        topicService.updateTopic(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
    public void deleteTopic(@PathVariable int id) {
        topicService.deleteTopic(id);
    }
}