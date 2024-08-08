package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"temMaterial","purchaseOrder"})
@Getter
@Table(name="tbl_procurement_plan")
public class ProcurementPlan {
    @Id
    private String procurementPlanCode;
    private LocalDateTime procurementPlantRegDate;
    private LocalDateTime procurementPlanDeadLine;
    private Integer procurementPlanQuantity;

    @OneToOne(mappedBy = "procurementPlan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PurchaseOrder purchaseOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materialCode")
    private TemMaterial temMaterial;

}
