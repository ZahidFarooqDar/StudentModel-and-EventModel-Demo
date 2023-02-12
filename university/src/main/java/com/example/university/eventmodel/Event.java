package com.example.university.eventmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    private int eventid;
    private String eventName;
    private String locationOfEvent;
    private String date;
    private String startTime;
    private String endTime;

}
