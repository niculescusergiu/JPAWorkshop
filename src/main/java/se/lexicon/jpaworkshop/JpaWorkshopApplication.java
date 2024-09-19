package se.lexicon.jpaworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.lexicon.jpaworkshop.entity.AppUser;

@SpringBootApplication
public class JpaWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaWorkshopApplication.class, args);
    }


}
