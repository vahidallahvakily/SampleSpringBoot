package ir.isc.software.fxa.nimaplus.bim.dto;

import lombok.Data;

@Data
public class CodingDto {
    private Integer id;
    private String codingName;
    private Integer parentId;

}
