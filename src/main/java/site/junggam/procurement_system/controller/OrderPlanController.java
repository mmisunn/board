package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/orderplan")
public class OrderPlanController {
    @RequestMapping("/productsample")
    public void productsample() {

    }
}
