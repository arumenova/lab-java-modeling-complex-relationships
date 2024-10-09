package com.ironhack.assosiationofnurses.model;
//Task2
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Exhibition")
public class Exhibition extends Event{

    @OneToMany(mappedBy = "exhibition", cascade = CascadeType.ALL)
    private Set<Speakers> speaker=new HashSet<>();
}
