package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.junggam.procurement_system.dto.PageRequestDTO;
import site.junggam.procurement_system.dto.PageResultDTO;
import site.junggam.procurement_system.dto.ProcurementPlanDTO;
import site.junggam.procurement_system.dto.PurchaseOrderDTO;
import site.junggam.procurement_system.entity.PurchaseOrder;
import site.junggam.procurement_system.service.ProcurementPlanService;
import site.junggam.procurement_system.service.PurchaseOrderService;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/purchaseordercontent")
@RequiredArgsConstructor
public class PurchaseOrderRestController {

    private final PurchaseOrderService purchaseOrderService;

    @GetMapping(value = "/allList", produces = "application/json")
    public ResponseEntity<PageResultDTO<PurchaseOrderDTO, PurchaseOrder>> getAllPurchaseOrders(PageRequestDTO pageRequestDTO) {
        log.info("발주리스트 가져오기 레스트 컨트롤러 진입");
        PageResultDTO<PurchaseOrderDTO, PurchaseOrder> purchaseOrderDTOList = purchaseOrderService.getPurchaseOrderList(pageRequestDTO);
        log.info("발주리스트 가져오기 완료");
        return new ResponseEntity<>(purchaseOrderDTOList, HttpStatus.OK);
    }

    @GetMapping("/{purchaseOrderCode}")
    public ResponseEntity<PurchaseOrderDTO> purchaseOrderGet(@PathVariable("purchaseOrderCode") String purchaseOrderCode){
        log.info("발주상세정보 레스트 컨트롤러 진입");
        log.info("발주코드는 "+purchaseOrderCode);
        PurchaseOrderDTO purchaseOrderDTO=purchaseOrderService.getPurchaseOrder(purchaseOrderCode);
        log.info("발주상세보기 가져오기 완료");
        return new ResponseEntity<>(purchaseOrderDTO, HttpStatus.OK);
    }

    @PostMapping(value = "/{purchaseOrderCode}")
    public ResponseEntity<String> purchaseOrderSave(@RequestBody PurchaseOrderDTO purchaseOrderDTO){
        log.info("발주수정 레스트컨트롤러 집입");
        log.info(purchaseOrderDTO);
        purchaseOrderService.savePurchaseOrder(purchaseOrderDTO);
        log.info("발주처리 완료!!!");
        return new ResponseEntity<>("발주처리되었습니다", HttpStatus.OK);
    }

}
