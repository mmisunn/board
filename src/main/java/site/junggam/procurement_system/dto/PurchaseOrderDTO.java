package site.junggam.procurement_system.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.junggam.procurement_system.entity.PurchaseOrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderDTO {
    //더 추가해야할 거 같은데 뭐 추가해야하지 기억이 잘 안 나
    //일단 해보고 진행
    private String purchaseOrderCode;
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime purchaseOrderDate;
    private String purchaseOrderMemo;
    private ProcurementPlanDTO procurementPlanDTO;

    @Builder.Default
    private PurchaseOrderStatus purchaseOrderStatus = PurchaseOrderStatus.PENDING;

    @Builder.Default
    private List<InspectionPlanDTO> InspectionPlanDTOList = new ArrayList<>();

}
