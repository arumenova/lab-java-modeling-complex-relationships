package com.ironhack.assosiationofnurses.repository;
//Task1
import com.ironhack.assosiationofnurses.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface chapterRepository extends JpaRepository<Chapter, Long> {
}
