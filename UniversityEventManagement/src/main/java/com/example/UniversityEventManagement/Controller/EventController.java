package com.example.UniversityEventManagement.Controller;

import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;


    //Add event
@PostMapping("event")
    public String addEvent(@RequestBody Event event){
    return eventService.addEvent(event);
}



   // Get All events by date
    @GetMapping("events/date")
    public List<Event> getEventsByDate(@RequestParam String date){
    return eventService.getEventsByDate(date);
    }



   // Update event
  @PutMapping("event/id/{id}/name")
    public String updateEvent(@PathVariable Long id,@RequestParam String name){
    return eventService.updateEvent(id,name);
  }


   // Delete event
@DeleteMapping("event/id/{id}")
    public String deleteEvent(@PathVariable Long id){
    return eventService.deleteEvent(id);
}
}
