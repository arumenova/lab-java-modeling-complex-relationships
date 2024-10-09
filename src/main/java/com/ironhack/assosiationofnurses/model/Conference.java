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
@DiscriminatorValue("CONFERENCE")
public class Conference extends Event{

    @OneToMany(mappedBy = "conference",cascade = CascadeType.ALL)
    private Set<Speakers> speakers=new HashSet<>();

}
