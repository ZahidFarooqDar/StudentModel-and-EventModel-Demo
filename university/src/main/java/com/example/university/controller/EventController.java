package com.example.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.eventmodel.Event;
import com.example.university.service.EventService;

@RestController
@RequestMapping("/api/Event")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/find-all-event")
    public List<Event> getAll(){
        return eventService.getAll();
    }
    @GetMapping("find-event-by-date/date/{date1}")
    public List<Event> findByDate(@PathVariable String date1){
        return eventService.findAllByDate(date1);
    }
    @PostMapping("Add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addevent(event);
    }
    @PutMapping("update/eventById/{eventid}")
    public void updateEvent(@PathVariable int eventId, @RequestBody Event event){
        eventService.updateEvent(eventId,event);
    }
    @DeleteMapping("delete-event/eventbyid/{eventid}")
    public void deleteEvent(@PathVariable int id){
        eventService.deleteEvent(id);
    }

}