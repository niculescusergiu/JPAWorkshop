package se.lexicon.jpaworkshop.repository;

import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {


    // Basic CRUD Operations. DONE

    //• Find a user by Username. DONE
    AppUser findByUsername(String username);
    //• Find users by registration date between two specific dates.
    AppUser findByRegDateBetween(LocalDateTime date1, LocalDateTime date2);
    //• Find users by details id.
    AppUser findByUserDetailsId(Integer id);
    //• Find user by email ignore case.
    AppUser findByUserDetailsEmailIgnoreCase(String email);
    //• (Optional)Add more as needed.

}
