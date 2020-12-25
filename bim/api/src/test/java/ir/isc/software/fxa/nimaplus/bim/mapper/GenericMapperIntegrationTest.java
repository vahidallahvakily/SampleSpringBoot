package ir.isc.software.fxa.nimaplus.bim.mapper;

import ir.isc.software.fxa.nimaplus.bim.NimaPlusApplicationTest;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntityFixture;
import ir.isc.software.fxa.nimaplus.bim.dto.CodingDto;
import ir.isc.software.fxa.nimaplus.bim.dto.CodingDtoFixture;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {NimaPlusApplicationTest.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log4j2
public class GenericMapperIntegrationTest {

    @Autowired
    GenericMapper<CodingEntity, CodingDto> mapper;

    @Test
    void correctly_map_entity_to_dto(){
        CodingEntity entityDummy= CodingEntityFixture.newTestInstance(1);
        CodingDto dto = mapper.mapDto(entityDummy,CodingDto.class);
        Assertions.assertEquals(entityDummy.getCodingName(),dto.getCodingName());
    }

    @Test
    void correctly_map_dto_entity(){
        CodingDto dtoDummy= CodingDtoFixture.newTestInstance(1,"TESTDTO");
        CodingEntity entity = mapper.mapEntity(dtoDummy,CodingEntity.class);
        Assertions.assertEquals(dtoDummy.getCodingName(),entity.getCodingName());
    }

    @Test
    void correctly_map_list_dto_entity(){
        List<CodingDto> lstCodingDto =new ArrayList<>();
        lstCodingDto.add(CodingDtoFixture.newTestInstance(1,"TESTDTO"));
        lstCodingDto.add(CodingDtoFixture.newTestInstance(2,"TESTDTO2"));
        List<CodingEntity> entityList = mapper.mapEntity(lstCodingDto,CodingEntity.class);
        Assertions.assertEquals(2, entityList.size());
    }


    @Test
    void correctly_map_list_entity_to_dto(){
        List<CodingEntity> lstCodignEntities=new ArrayList<>();
        lstCodignEntities.add(CodingEntityFixture.newTestInstance(1,"TEST"));
        lstCodignEntities.add(CodingEntityFixture.newTestInstance(2,"TEST1"));
        List<CodingDto> lstResult = mapper.mapDto(lstCodignEntities,CodingDto.class);
        Assertions.assertEquals(2, lstResult.size());
    }



}
