package ir.isc.software.fxa.nimaplus.bim.mapper;

import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.dto.CodingDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CodingMapper {
    private final ModelMapper modelMapper;

    public CodingDto convertDto(CodingEntity codingEntity){
        return modelMapper.map(codingEntity,CodingDto.class);
    }

    public CodingEntity convertEntity(CodingDto codingDto){
        return modelMapper.map(codingDto,CodingEntity.class);
    }
}
