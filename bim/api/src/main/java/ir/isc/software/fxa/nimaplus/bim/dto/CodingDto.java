package ir.isc.software.fxa.nimaplus.bim.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="Coding", description="Coding entity")
public class CodingDto {
    private Integer id;
    @ApiModelProperty(value = "Coding Name")
    private String codingName;
    @ApiModelProperty(value = "Identifeir of parent coding")
    private Integer parentId;

}
