package ir.isc.software.fxa.nimaplus.bim.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ir.isc.software.fxa.nimaplus.bim.common.CodingEntity;
import ir.isc.software.fxa.nimaplus.bim.mapper.CodingMapper;
import ir.isc.software.fxa.nimaplus.bim.service.CodingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/api/bim/v1/coding")
@AllArgsConstructor
@RestController
@Api(tags = "BIM-V1")
public class CodingApiController {

    private final CodingService codingService;

    private final CodingMapper codingMapper;

    @GetMapping
    public ResponseEntity getCodings(){
        return ResponseEntity.ok(codingService.getCodings());
    }

    @GetMapping("{codingId}")
    @ApiOperation("Get Coding Resource")
    public ResponseEntity getCodingByCodingId(@PathVariable("codingId") Integer codingId){
        Optional<CodingEntity> codingEntity = codingService.getCoding(codingId);
        if(!codingEntity.isPresent())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(codingMapper.convertDto(codingEntity.get()));
    }
}
