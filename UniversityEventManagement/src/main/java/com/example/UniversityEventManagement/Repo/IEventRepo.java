package com.example.UniversityEventManagement.Repo;

import com.example.UniversityEventManagement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEventRepo extends JpaRepository<Event,Long> {

    List<Event> findByDate(String date);
}
