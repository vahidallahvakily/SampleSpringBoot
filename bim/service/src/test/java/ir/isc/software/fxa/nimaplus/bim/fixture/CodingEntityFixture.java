package ir.isc.software.fxa.nimaplus.bim.fixture;

import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;

public class CodingEntityFixture {
    public static CodingEntity newTestInstance(Integer id){
        CodingEntity codingEntity= new CodingEntity();
        codingEntity.setId(id);
        codingEntity.setCodingName("TEST");
        return codingEntity;
    }
}
