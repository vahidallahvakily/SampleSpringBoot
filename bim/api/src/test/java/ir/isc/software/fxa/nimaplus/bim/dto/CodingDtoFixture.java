package ir.isc.software.fxa.nimaplus.bim.dto;


public class CodingDtoFixture {

    public static CodingDto newTestInstance(Integer id, String codingName){
        CodingDto codingDto= new CodingDto();
        codingDto.setId(id);
        codingDto.setCodingName(codingName);
        return codingDto;
    }
}
