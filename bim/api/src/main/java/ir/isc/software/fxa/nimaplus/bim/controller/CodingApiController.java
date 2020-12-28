package ir.isc.software.fxa.nimaplus.bim.controller;

import io.swagger.annotations.*;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.dto.CodingDto;
import ir.isc.software.fxa.nimaplus.bim.mapper.GenericMapper;
import ir.isc.software.fxa.nimaplus.bim.service.CodingService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping(value = "/api/bim/v1/coding",produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@RestController
@Api(tags = "BIM-V1")
public class CodingApiController {

    private final CodingService codingService;

    private final GenericMapper<CodingEntity, CodingDto> codingMapper;

    @GetMapping
    public ResponseEntity getCodings(){
        return ResponseEntity.ok(codingService.getCodings());
    }

    @GetMapping("{codingId}")
    @ApiOperation(value = "Get Coding Resource", notes = "Get Coding by its primary identifier",
     response = CodingDto.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Not Valid Coding Id"),
            @ApiResponse(code = 404, message = "Coding not found")
    })
    public ResponseEntity getCodingByCodingId(
            @ApiParam(value = "Coding Identifier", required = true) @PathVariable("codingId") Integer codingId){
        Optional<CodingEntity> codingEntity = codingService.getCoding(codingId);
        if(!codingEntity.isPresent())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(codingMapper.mapDto(codingEntity.get(),CodingDto.class));
    }
}
