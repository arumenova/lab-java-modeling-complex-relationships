package com.ironhack.assosiationofnurses.repository;
//Task2
import com.ironhack.assosiationofnurses.model.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface speakersRepository extends JpaRepository<Speakers, Long> {
}
