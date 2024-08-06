package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.entity.PurchaseOrder;

public interface PurchaseOrderService {
    //1. 발주서 목록보기

    //2-1 발주 상세보기
    PurchaseOrderDTO getPurchaseOrder(String purchaseOrderCode);

    //2-2 발주 처리
    void registerPurchaseOrder(PurchaseOrderDTO purchaseOrderDTO);
    



    
    //이하 엔티티랑 디티오처리
    
    //DTO->Entity
    default PurchaseOrder dtotoEntity(PurchaseOrderDTO dto){
        PurchaseOrder purchaseOrder
                = PurchaseOrder.builder()
                            .purchaseOrderCode(dto.getPurchaseOrderCode())
                            .purchaseOrderDate(dto.getPurchaseOrderDate())
                            .purchaseOrderMemo(dto.getPurchaseOrderMemo())
                            .build();
        return purchaseOrder;
    }
    //Entity->DTO
    default PurchaseOrderDTO entitytoDTO(PurchaseOrder entity){
        PurchaseOrderDTO purchaseOrderDTO
                = PurchaseOrderDTO.builder()
                .purchaseOrderCode(entity.getPurchaseOrderCode())
                .purchaseOrderDate(entity.getPurchaseOrderDate())
                .purchaseOrderMemo(entity.getPurchaseOrderMemo())
                .build();
        return purchaseOrderDTO;
    }
}
