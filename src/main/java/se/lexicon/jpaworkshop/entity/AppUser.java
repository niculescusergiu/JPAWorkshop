package se.lexicon.jpaworkshop.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter private String username;
    @Setter private String password;
    @Setter private LocalDateTime regDate;

    @OneToOne
    @JoinColumn(name = "user_details_id")
    @Setter private Details userDetails;

    public AppUser(String username, String password, LocalDateTime regDate) {
        this.username = username;
        this.password = password;
        this.regDate = regDate;

    }
}
