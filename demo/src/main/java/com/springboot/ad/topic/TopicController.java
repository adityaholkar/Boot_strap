package com.springboot.ad.topic;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getTopic(){
        return Arrays.asList(
        new Topic(1,"Adam ASa",45),
        new Topic(2,"ajsbf jasbnd",45),
        new Topic(3,"jordan",60)
        );
    }
}
