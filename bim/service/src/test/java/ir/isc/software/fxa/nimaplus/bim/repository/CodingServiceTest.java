package ir.isc.software.fxa.nimaplus.bim.repository;


import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.fixture.CodingEntityFixture;
import ir.isc.software.fxa.nimaplus.bim.service.CodingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

//@Runwith for Junit 4
@ExtendWith(MockitoExtension.class)
public class CodingServiceTest {

    @Mock
    CodingRepository codingRepository;

    @InjectMocks
    CodingService codingService;

    @Test
    void call_codingRepository_save_when_successful(){
        CodingEntity codingEntity = CodingEntityFixture.newTestInstance(1);
        Mockito.when(codingRepository.save(any())).thenReturn(codingEntity);
        CodingEntity codingEntityResult=  codingService.save(codingEntity);
        Mockito.verify(codingRepository,Mockito.times(1)).save(codingEntity);
    }
}
