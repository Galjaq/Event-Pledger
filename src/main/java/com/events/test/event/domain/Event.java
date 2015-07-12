package com.events.test.event.domain;

import com.events.test.util.database.Identity;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event extends Identity {

    @Column(name = "topic")
    private String topic;

    Event(){}

    public Event(String topic) {
        this.topic = topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}