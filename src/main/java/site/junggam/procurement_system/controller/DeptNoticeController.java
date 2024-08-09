package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/deptnotice")
public class DeptNoticeController {

    @GetMapping("/deptnoticeread")
    public void deptnoticeread() {
        log.info("부서 알림 상세보기");
    }

    @GetMapping("/deptnoticemodify")
    public void deptnoticemodify() {

    }


}
