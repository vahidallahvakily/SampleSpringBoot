package ir.isc.software.fxa.nimaplus.bim.service;

import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.repository.CodingRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class CodingService {
    private final CodingRepository codingRepository;

    public List<CodingEntity> getCodings(){
        return codingRepository.findAll();
    }

    public Optional<CodingEntity> getCoding(Integer codingId){
        return codingRepository.findById(codingId);
    }

    @Transactional
    public CodingEntity save(CodingEntity codingEntity){
        //Validation && throws exception or (OperationResult)
        CodingEntity codingEntityResult= codingRepository.save(codingEntity);
        log.info("inserted coding entity",codingEntity.toString());
        return codingEntityResult;
    }
}
