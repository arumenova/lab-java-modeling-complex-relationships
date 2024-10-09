package com.ironhack.assosiationofnurses.repository;
//Task2
import com.ironhack.assosiationofnurses.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface eventRepository extends JpaRepository<Event, Long> {
}
