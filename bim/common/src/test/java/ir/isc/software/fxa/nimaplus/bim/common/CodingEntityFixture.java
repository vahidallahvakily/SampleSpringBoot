package ir.isc.software.fxa.nimaplus.bim.common;

import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;

public class CodingEntityFixture {
    public static CodingEntity newTestInstance(Integer id){
        return newTestInstance(id,"TEST");
    }

    public static CodingEntity newTestInstance(Integer id,String codingName){
        CodingEntity codingEntity= new CodingEntity();
        codingEntity.setId(id);
        codingEntity.setCodingName(codingName);
        return codingEntity;
    }
}
