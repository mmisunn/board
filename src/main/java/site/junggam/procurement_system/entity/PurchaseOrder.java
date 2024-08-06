package site.junggam.procurement_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

}
