package com.spring.springapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
    @Autowired
    private SpringRepo springRepo;


    private List<Topic> topics=new ArrayList<>(Arrays.asList(
        new Topic(1,"Adam ASa",45),
        new Topic(2,"ajsbf jasbnd",45),
        new Topic(3,"jordan",70)
        ));
    
    public List<Topic> getAllTopic() {

        List<Topic>topics = new ArrayList<>();
        springRepo.findAll()
                .forEach(topics::add);



        return topics;
    }
    public Optional<Topic> getTopic(int id){
        // return topics.stream()
        //             .filter(t -> t.getId() == id)
        //             .findFirst()
        //             .get();

        return springRepo.findById(id);



    }
    public void addTopic(Topic topic) {
        springRepo.save(topic);
    }
    public void updateTopic(int id,Topic topic) {
        // for(int i=0;i<topics.size();i++){
        //     Topic t = topics.get(i);
        //     if(t.getId() == id){
        //         topics.set(i,topic);
        //         return;
        //     }
        // }
        springRepo.save(topic);
    }
    public void deleteTopic(int id) {
        //topics.removeIf(t->t.getId() == id);
        springRepo.deleteById(id);
    }
}
