package com.ironhack.assosiationofnurses.repository;
//Task1
import com.ironhack.assosiationofnurses.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<Member, Long> {
}
