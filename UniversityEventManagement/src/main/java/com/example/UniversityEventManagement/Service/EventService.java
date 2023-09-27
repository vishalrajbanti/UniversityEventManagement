package com.example.UniversityEventManagement.Service;

import com.example.UniversityEventManagement.Model.Event;
import com.example.UniversityEventManagement.Repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;

    public String addEvent(Event event) {
        iEventRepo.save(event);
        return "added";
    }

    public List<Event> getEventsByDate(String date) {
        return iEventRepo.findByDate(date);
    }

    public String updateEvent(Long id, String name) {
        Event event = iEventRepo.findById(id).get();
        event.setEventName(name);
        return "updated";
    }

    public String deleteEvent(Long id) {
        iEventRepo.deleteById(id);
        return "deleted";
    }
}
