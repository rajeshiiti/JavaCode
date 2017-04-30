package com.maven.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.filter.Filter;

import com.maven.topics.Topic;

@Service
public class TopicService {

	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java","java framework","java Framework Description"),
			new Topic("cpp","cpp Framework","cpp Framework Description")));


	public List<Topic> getAllTopics() {
		return this.topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
	public void updateTopic(String id, Topic topic) {
		for(int i = 0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}


}
