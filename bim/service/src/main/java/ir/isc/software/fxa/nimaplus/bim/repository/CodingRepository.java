package ir.isc.software.fxa.nimaplus.bim.repository;

import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodingRepository extends  JpaRepository<CodingEntity,Integer>{
}
