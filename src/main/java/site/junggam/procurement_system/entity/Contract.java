package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"temMaterial","purchaerCode"})
@Getter
@Table(name="tbl_contract")
public class Contract {

    @Id
    private String contractCode;
    private String contractFile ;
    private Double contractPrice;
    private Integer contractLeadTime;

    @OneToOne
    @JoinColumn(name = "material_code")
    private TemMaterial temMaterial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchaserCode")
    private Purchaser purchaser;
}
