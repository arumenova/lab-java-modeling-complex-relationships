package com.ironhack.assosiationofnurses.model;
//Task2
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Speakers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;

    @ManyToOne
    @JoinColumn(name="conference_id")
    private Conference conference;

    @ManyToOne
    @JoinColumn(name="exhibition_id")
    private Exhibition exhibition;

}
