package ir.isc.software.fxa.nimaplus.bim.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenericMapper<E,D> {
    private final ModelMapper modelMapper;
    public GenericMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public D mapDto(E codingEntity, Class<D> dClass){
        return modelMapper.map(codingEntity,dClass);
    }

    public E mapEntity(D codingDto, Class<E> eClass){
        return modelMapper.map(codingDto,eClass);
    }

    public List<D> mapDto(List<E> entityList, Class<D> dClass){
        return entityList.stream()
                .map(entity -> mapDto(entity, dClass))
                .collect(Collectors.toList());
    }

    public List<E> mapEntity(List<D> dtoList, Class<E> eClass){
        return dtoList.stream()
                .map(dto -> mapEntity(dto, eClass))
                .collect(Collectors.toList());
    }
}
