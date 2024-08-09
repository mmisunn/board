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

import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor //생성자 의존성 주입 //@NonNull or final만 생성자로 만든다.
public class PurchaseOrderServiceImpl implements PurchaseOrderService{

    private final PurchaseOrderRepository purchaseOrderRepository;
    private final PurchaseOrderMapper purchaseOrderMapper;
    private final InspectionPlanRepository inspectionPlanRepository;

    @Override
    @Transactional
    public PurchaseOrderDTO getPurchaseOrder(String purchaseOrderCode) {
        log.info("발주상세보기 서비스");
        Optional<PurchaseOrder> result=purchaseOrderRepository.findById(purchaseOrderCode);

        if (result.isPresent()) {
            PurchaseOrder purchaseOrder = result.get();

            // PurchaseOrder를 DTO로 변환
            PurchaseOrderDTO purchaseOrderDTO = purchaseOrderMapper.toDTO(purchaseOrder);

            // PurchaseOrder에 연관된 InspectionPlan을 조회하여 DTO로 변환
            List<InspectionPlan> inspectionPlans = inspectionPlanRepository.findByPurchaseOrder(purchaseOrder);
            List<InspectionPlanDTO> inspectionPlanDTOs = purchaseOrderMapper.toInspectionPlanDTOs(inspectionPlans);

            // DTO에 InspectionPlanDTO 리스트 설정
            purchaseOrderDTO.setInspectionPlanDTOList(inspectionPlanDTOs);

            return purchaseOrderDTO;
        } else {
            return null;
        }
    }

    @Override
    public void registerPurchaseOrder(PurchaseOrderDTO purchaseOrderDTO) {
        log.info("발주처리");

    }
}
