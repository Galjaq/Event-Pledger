package com.events.test.event.domain;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List<Event> getAll() {
        Session session = getSessionFactory().getCurrentSession();
        Criteria criteria =  session.createCriteria(Event.class);

        return criteria.list();
    }

}