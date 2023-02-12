package com.example.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.university.eventmodel.Event;


@Service
public class EventService {
    private static List<Event> events = new ArrayList<>();

    static {
        events.add(new Event(01,"Joining Event","Delhi","11-2-23","11.30 Am", "2.00 pm"));
        events.add(new Event(02,"Freshers Event","Mumbai","12-2-23","11.30 Am", "2.00 pm"));
        events.add(new Event(03,"Games Event","Chandigarh","13-2-23","11.30 Am", "2.00 pm"));
        events.add(new Event(04,"Demo-Interview","Kashmir","14-2-23","11.30 Am", "2.00 pm"));


    }

    public List<Event> getAll() {
        return events;
    }

    public List<Event> findAllByDate(String date1){
        // return events.stream().filter(t-> t.getDate().equals(date1)).findFirst().get();
        List<Event> e1 = new ArrayList<>();
        for(Event i:events){
            if(i.getDate().equals(date1)){
                e1.add(i);
            }
        }
        return e1;

    }
    public Event findById(int eventId){
        return events.stream().filter(t-> t.getEventid()==eventId).findFirst().get();


    }
    public void addevent(Event event) {
        events.add(event);
    }

    public void updateEvent(int eventid, Event event) {

        Event e = findById(eventid);

        e.setDate(event.getDate());
        e.setEndTime(event.getEndTime());
        e.setEventName(event.getEventName());
        e.setLocationOfEvent(event.getLocationOfEvent());
        e.setStartTime(event.getStartTime());
    }
    public void deleteEvent(int id){
        Event e = findById(id);
        events.remove(e);
    }

}