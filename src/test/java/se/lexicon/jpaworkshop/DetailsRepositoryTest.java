package se.lexicon.jpaworkshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.jpaworkshop.entity.AppUser;
import se.lexicon.jpaworkshop.entity.Details;
import se.lexicon.jpaworkshop.repository.DetailsRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@DataJpaTest
public class DetailsRepositoryTest {

    @Autowired
    DetailsRepository detailsRepository;

    @Test
    @Transactional
    public void testSaveAndFindById() {
        //1. Arrange
        Details details = new Details("Software Developer", "Sergiu Niculescu", LocalDate.of(2000, 05, 22));
        //2. Act
        Details savedDetails = detailsRepository.save(details);
        //3. Assert
        Assertions.assertNotNull(savedDetails);
        Assertions.assertNotNull(savedDetails.getId());
    }


}
