package com.events.test.entity;

import com.events.test.entity.Event;
import com.events.test.util.database.Identity;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review extends Identity {

    @Column(name = "topic")
    private String topic;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="event_id")
    private Event event;

}
