package se.lexicon.jpaworkshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.jpaworkshop.entity.AppUser;
import se.lexicon.jpaworkshop.repository.AppUserRepository;

import java.time.LocalDateTime;

@DataJpaTest
public class AppUserRepositoryTest {

    @Autowired
    AppUserRepository appUserRepository;

    @Test
    @Transactional
    public void testSaveAndFindById() {
        //1. Arrange
        AppUser appUser = new AppUser("Test", "Test", LocalDateTime.now(), null);
        //2. Act
        AppUser savedAppUser = appUserRepository.save(appUser);
        //3. Assert
        Assertions.assertNotNull(savedAppUser);
        Assertions.assertNotNull(savedAppUser.getId());
    }
}
