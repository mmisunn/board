package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample")
public class SampleController {
    
    @RequestMapping("logintest1")
    public void logintest1(){
        log.info("테스트 하는 김에 로그포제이도 테스트");
        System.out.println("테스트 하는 김에 시스아웃도 테스트");
    }
}
