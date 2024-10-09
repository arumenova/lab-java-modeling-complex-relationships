package com.ironhack.assosiationofnurses.model;
// Task1
import ch.qos.logback.core.status.Status;
import com.ironhack.assosiationofnurses.enums.StatusType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//Task1
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate renewalDate;

    @Enumerated(EnumType.STRING)
    private StatusType status;

    @OneToOne(mappedBy = "president")
    private Chapter presidentOf;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

}
