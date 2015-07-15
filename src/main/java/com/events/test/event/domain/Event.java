package com.events.test.event.domain;

import com.events.test.util.database.Identity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event extends Identity {

    @Column(name = "topic")
    private String topic;

    @Column(name = "description")
    private String description;

    @Column(name = "pic")
    private String pic;

    @Column(name = "status")
    private Integer status;

    @Column(name = "price")
    private Integer price;

    @OneToMany(fetch= FetchType.EAGER, mappedBy="event")
    private Set<Review> reviews;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}