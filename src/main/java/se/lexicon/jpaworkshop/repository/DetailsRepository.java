package se.lexicon.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.Details;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {
}
