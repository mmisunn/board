package site.junggam.procurement_system.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.dto.InspectionPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.entity.InspectionPlan;
import site.junggam.procurement_system.entity.PurchaseOrder;
import site.junggam.procurement_system.mapper.PurchaseOrderMapper;
import site.junggam.procurement_system.repository.InspectionPlanRepository;
import site.junggam.procurement_system.repository.PurchaseOrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor //생성자 의존성 주입 //@NonNull or final만 생성자로 만든다.
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    private final PurchaseOrderRepository purchaseOrderRepository;
    private final PurchaseOrderMapper purchaseOrderMapper;
    private final InspectionPlanRepository inspectionPlanRepository;

    private int getInspectionPlanCount(PurchaseOrder purchaseOrder) {
        List<InspectionPlan> inspectionPlans = inspectionPlanRepository.findByPurchaseOrder(purchaseOrder);
        int size = inspectionPlans.size();
        return size;
    }

    @Override
    @Transactional
    public List<PurchaseOrderDTO> getPurchaseOrderList() {
        try {
            List<PurchaseOrder> result = purchaseOrderRepository.findAll();
            List<PurchaseOrderDTO> dtoList = result.stream()
                    .map(purchaseOrder -> {
                        PurchaseOrderDTO dto = purchaseOrderMapper.toDTO(purchaseOrder);
                        int inspectionPlanCount = getInspectionPlanCount(purchaseOrder);
                        dto.setInspectionPlanCount(inspectionPlanCount);
                        return dto;
                    })
                    .collect(Collectors.toList());
            return dtoList;
        } catch (Exception e) {
            log.error("에러메세지", e);
            throw e; // or handle the exception appropriately
        }
    }

    @Override
    @Transactional
    public PurchaseOrderDTO getPurchaseOrder(String purchaseOrderCode) {
        log.info("발주상세보기 서비스");
        Optional<PurchaseOrder> result=purchaseOrderRepository.findById(purchaseOrderCode);

        if (result.isPresent()) {
            PurchaseOrder purchaseOrder = result.get();

            // PurchaseOrder를 DTO로 변환
            PurchaseOrderDTO purchaseOrderDTO = purchaseOrderMapper.toDTO(purchaseOrder);
            int inspectionPlanCount = getInspectionPlanCount(purchaseOrder);
            purchaseOrderDTO.setInspectionPlanCount(inspectionPlanCount);

            return purchaseOrderDTO;
        } else {
            return null;
        }
    }


    @Override
    public void savePurchaseOrder(PurchaseOrderDTO purchaseOrderDTO) {
        Optional<PurchaseOrder> result
                = purchaseOrderRepository.findById(purchaseOrderDTO.getPurchaseOrderCode());
        if(result.isPresent()) {
            PurchaseOrder purchaseOrder = result.get();
            purchaseOrder.changePurchaseOrderDate(purchaseOrderDTO.getPurchaseOrderDate());
            purchaseOrder.changePurchaseOrderStatus(purchaseOrderDTO.getPurchaseOrderStatus());
            purchaseOrder.changePurchaseOrderMemo(purchaseOrderDTO.getPurchaseOrderMemo());
            purchaseOrderRepository.save(purchaseOrder);
        }

    }


}
