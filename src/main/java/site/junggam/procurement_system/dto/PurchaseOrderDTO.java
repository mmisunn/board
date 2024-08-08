package site.junggam.procurement_system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.junggam.procurement_system.entity.PurchaseOrderStatus;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderDTO {
    //더 추가해야할 거 같은데 뭐 추가해야하지 기억이 잘 안 나
    //일단 해보고 진행
    private String purchaseOrderCode;
    private LocalDateTime purchaseOrderDate;
    private String purchaseOrderMemo;
    private ProcurementPlanDTO procurementPlanDTO;

    @Builder.Default
    private PurchaseOrderStatus purchaseOrderStatus = PurchaseOrderStatus.PENDING;

}
