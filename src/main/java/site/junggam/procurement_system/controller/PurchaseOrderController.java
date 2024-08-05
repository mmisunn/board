package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/purchaseorder")
public class PurchaseOrderController {

    @RequestMapping("/orderlist")
    public void orderlist(){
        log.info("발주리스트 나옴");
    }
    @RequestMapping("/orderread")
    public void orderread(){
        log.info("일단은 발주서 상세보기");
    }

}
