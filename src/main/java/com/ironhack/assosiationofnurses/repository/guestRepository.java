package com.ironhack.assosiationofnurses.repository;
//Task2
import com.ironhack.assosiationofnurses.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface guestRepository extends JpaRepository <Guest, Long> {
}
