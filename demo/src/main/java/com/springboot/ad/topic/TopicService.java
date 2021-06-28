package com.springboot.ad.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
    private List<Topic> topics=new ArrayList<>(Arrays.asList(
        new Topic(1,"Adam ASa",45),
        new Topic(2,"ajsbf jasbnd",45),
        new Topic(3,"jordan",70)
        ));
    
    public List<Topic> getAllTopic() {
        return topics;
    }
    public Topic getTopic(int id){
        return topics.stream()
                    .filter(t -> t.getId() == id)
                    .findFirst()
                    .get();
    }
    public void addTopic(Topic topic) {
        topics.add(topic);
    }
    
}
