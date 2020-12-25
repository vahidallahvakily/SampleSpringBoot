package ir.isc.software.fxa.nimaplus.bim.repository;

import ir.isc.software.fxa.nimaplus.bim.NimaPlusApplicationTest;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntityFixture;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class) =>Note Only used this in case of Junit4 , for Junit5 not requried
//@ActiveProfiles("integration-test") => can we use this ???
//@ContextConfiguration(classes = {DBConfiguration.class}, loader = SpringBootContextLoader.class) => If Needed TestConfiguration
@SpringBootTest(classes = {NimaPlusApplicationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log4j2
//Note: We can have @Transactional for rollback but prefered not used for now
public class CodingRepositoryIntegrationTest {

    @Autowired
    private CodingRepository codingRepository;

    @BeforeEach
    public void cleanup(){
        //If we have static Id , we can do clearnup here
        //Any Cleanup
    }

    @AfterEach
    public void tearup(){
    }


   @Test
    public void do_create_delete_operation_coding_entity(){
      // ---- Coding Entity Insert
       CodingEntity codingEntity = CodingEntityFixture.newTestInstance(1001);
       CodingEntity codingEntityResult=  codingRepository.saveAndFlush(codingEntity);
       Assertions.assertNotNull(codingEntityResult.getId());
       log.info("Coding Entity Result ID : "+codingEntityResult.getId());
      //----- Coding Entity Delete
       codingRepository.delete(codingEntityResult);
    }
}


