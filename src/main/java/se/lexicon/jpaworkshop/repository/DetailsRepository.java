package se.lexicon.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.Details;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {

    //• Basic CRUD Operations. DONE
    //• Find a details by email.
    Details findByEmail(String email);
    //• Find details by name contains.
    Details findByNameContains(String name);
    //• Find details by name ignore-case.
    Details findByNameIgnoreCase(String name);
    //• (Optional)Add more as needed.

}
