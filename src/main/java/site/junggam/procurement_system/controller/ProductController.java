package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/productlist")
    public void productlist() {

    }

    @RequestMapping("/addproducttest")
    public void addproducttest() {

    }
}
