package se.lexicon.jpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entity.AppUser;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
}
