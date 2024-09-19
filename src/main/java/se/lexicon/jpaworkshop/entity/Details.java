package se.lexicon.jpaworkshop.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @Setter private String details;
    @Column(nullable = false)
    @Setter private String name;
    @Column(nullable = false)
    @Setter private LocalDate birthDate;

    public Details(String details, String name, LocalDate birthDate) {
        this.details = details;
        this.name = name;
        this.birthDate = birthDate;
    }
}
