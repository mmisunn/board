package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/purchaseorder")
public class PurchaseOrderController {

    @RequestMapping("/orderlist")
    public void orderlist(){
        log.info("발주리스트 나옴");
    }

    @GetMapping("/orderget")
    public void orderget(@RequestParam("purchaseOrderCode") String purchaseOrderCode, Model model){
        log.info("발주서 상세보기 컨트롤러");
        log.info("발주코드는 "+purchaseOrderCode);
        model.addAttribute("purchaseOrderCode",purchaseOrderCode);
    }

}
