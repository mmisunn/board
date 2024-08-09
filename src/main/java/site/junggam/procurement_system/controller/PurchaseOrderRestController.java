package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.service.ProcurementPlanService;
import site.junggam.procurement_system.service.PurchaseOrderService;

@Log4j2
@RestController
@RequestMapping("/purchaseordercontent")
@RequiredArgsConstructor
public class PurchaseOrderRestController {

    private final PurchaseOrderService purchaseOrderService;

    @GetMapping("/{purchaseOrderCode}")
    public ResponseEntity<PurchaseOrderDTO> orderGet(@PathVariable("purchaseOrderCode") String purchaseOrderCode){
        log.info("발주 레스트 컨트롤러까지는 진입...함!!!!");
        log.info("발주코드는 "+purchaseOrderCode);

        PurchaseOrderDTO purchaseOrderDTO=purchaseOrderService.getPurchaseOrder(purchaseOrderCode);
//        ProcurementPlanDTO procurementPlanDTO=procurementPlanService.
        return new ResponseEntity<>(purchaseOrderDTO, HttpStatus.OK);
    }

}
