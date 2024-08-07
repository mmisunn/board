package site.junggam.procurement_system.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Table(name="tbl_purchase_order")
public class PurchaseOrder {

    @Id
    private String purchaseOrderCode;
    private LocalDateTime purchaseOrderDate;
    private String purchaseOrderMemo;

    @OneToOne
    @JoinColumn(name = "procurement_plan_code")
    private ProcurementPlan procurementPlan;
}
