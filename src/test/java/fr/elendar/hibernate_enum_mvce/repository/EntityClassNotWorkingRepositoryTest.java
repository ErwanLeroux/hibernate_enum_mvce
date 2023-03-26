package fr.elendar.hibernate_enum_mvce.repository;

import fr.elendar.hibernate_enum_mvce.model.EntityClassNotWorking;
import fr.elendar.hibernate_enum_mvce.model.Way;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class EntityClassNotWorkingRepositoryTest {
    @Autowired
    public EntityClassNotWorkingRepository entityClassNotWorkingRepository;

    @Test
    void test_ko() {
        assertThatCode(() -> {
            final EntityClassNotWorking entityClassNotWorking = new EntityClassNotWorking();
            entityClassNotWorking.setId("1");
            entityClassNotWorking.setWay(Way.A);
            entityClassNotWorkingRepository.save(entityClassNotWorking);
        }).doesNotThrowAnyException();
    }
}