package fr.elendar.hibernate_enum_mvce.repository;

import fr.elendar.hibernate_enum_mvce.model.EntityClassWorking;
import fr.elendar.hibernate_enum_mvce.model.Way;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class EntityClassWorkingRepositoryTest {
    @Autowired
    public EntityClassWorkingRepository entityClassWorkingRepository;

    @Test
    void test_ok() {
        assertThatCode(() -> {
            final EntityClassWorking entityClassWorking = new EntityClassWorking();
            entityClassWorking.setId("1");
            entityClassWorking.setWay(Way.A);
            entityClassWorkingRepository.save(entityClassWorking);
        }).doesNotThrowAnyException();
    }
}