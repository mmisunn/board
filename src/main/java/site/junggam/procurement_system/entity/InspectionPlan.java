package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"purchaseOrder"})
@Getter
@Table(name="tbl_inspection_plan")
public class InspectionPlan {

    @Id
    private String inspectionPlanCode;
    private LocalDateTime inspectionPlanDateTime;

    @Builder.Default
    private String inspectionPlanMemo=null;
    @Builder.Default
    private Integer inspectionPlanProgress=0;
    @Builder.Default
    private String inspectionPlanComplementary=null;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private InspectionPlanDeliveryProgress inspectionPlanDeliveryProgress=null;

    @Enumerated(EnumType.STRING)
    @Builder.Default
    private InspectionPlanStatus inspectionPlanStatus = InspectionPlanStatus.NOT_INSPECTED;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchaseOrderCode")
    private PurchaseOrder purchaseOrder;
}
