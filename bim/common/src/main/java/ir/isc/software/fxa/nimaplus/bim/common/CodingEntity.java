package ir.isc.software.fxa.nimaplus.bim.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="CODING_ENTITY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodingEntity {
    @Id
    @Column(name = "CODING_ID")
    private Integer id;
    @Column(name = "CODING_NAME")
    private String codingName;
    @Column(name = "PARENT_ID")
    private Integer parentId;

}
