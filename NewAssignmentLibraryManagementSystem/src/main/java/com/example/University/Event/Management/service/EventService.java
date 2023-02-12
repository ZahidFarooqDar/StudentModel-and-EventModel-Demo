package com.example.University.Event.Management.service;

import com.example.University.Event.Management.model.EventManagement;
import com.example.University.Event.Management.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private IEventRepository iEventRepository;

    public List<EventManagement> findAllEvent() {
        return iEventRepository.findAll();
    }

    public List<EventManagement> findByDate(String date) {
        return iEventRepository.findByEventdate(date);
    }

    public void addEvent(EventManagement eventManagement) {
        iEventRepository.save(eventManagement);
    }

    public void updateEvent(int id, EventManagement newEventManagement) {
        EventManagement eventManagement = iEventRepository.findById(id).get();
        eventManagement.setEvent_id(newEventManagement.getEvent_id());
        eventManagement.setEvent_name(newEventManagement.getEvent_name());
        eventManagement.setLocation_of_event(newEventManagement.getLocation_of_event());
        eventManagement.setEventdate(newEventManagement.getEventdate());
        eventManagement.setStart_time(newEventManagement.getStart_time());
        eventManagement.setEnd_time(newEventManagement.getEnd_time());
    }

    public void deleteEvent(int id) {
        iEventRepository.deleteById(id);
    }
}
