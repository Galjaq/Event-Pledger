package com.events.test.dao;

import com.events.test.entity.Event;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDaoImpl implements EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Event> getAllEvents() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria =  session.createCriteria(Event.class);

        return criteria.list();
    }

    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void deleteEvent(Integer eventId) {

    }
}
