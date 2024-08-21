package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import site.junggam.procurement_system.entity.DeptNotice;
import site.junggam.procurement_system.service.DeptNoticeService;

@Controller
@Log4j2
@RequestMapping("/deptnotice")
@RequiredArgsConstructor
public class DeptNoticeController {

    private final DeptNoticeService deptNoticeService;

//    @GetMapping("/noticelist")
//    public String deptnoticelist(Model model) {
//        log.info("부서 알림 목록");
//        model.addAttribute("deptnotice", deptNoticeService.list());
//        return "notice/noticelist";
//    }

    @GetMapping("/deptnoticeread/{deptNoticeNumber}")
    public String deptnoticeread(@PathVariable int deptNoticeNumber, Model model) {
        log.info("부서 알림 상세보기");
        model.addAttribute("deptnotice", deptNoticeService.read(deptNoticeNumber));
        return "deptnotice/deptnoticeread";
    }

    @GetMapping("/deptnoticeregister")
    public String deptnoticeregister() {
        log.info("부서 알림 등록");
        return "deptnotice/deptnoticeregister";
    }

    @PostMapping("/deptnoticeregister")
    public String deptregisterpost(DeptNotice deptNotice) {
        deptNoticeService.register(deptNotice);
        return "redirect:/notice/noticelist";
    }

    @GetMapping("/deptnoticemodify/{deptNoticeNumber}")
    public String deptnoticemodify(@PathVariable int deptNoticeNumber, Model model) {
        log.info("부서 알림 수정");
        model.addAttribute("deptnotice", deptNoticeService.read(deptNoticeNumber));
        return "deptnotice/deptnoticemodify";
    }

    @PostMapping("/deptnoticemodify")
    public String deptmodifypost(DeptNotice deptNotice) {
        deptNoticeService.modify(deptNotice);
        return "redirect:/notice/noticelist";
    }

    @GetMapping("/deptnoticedelete/{deptNoticeNumber}")
    public String deptnoticedelete(@PathVariable int deptNoticeNumber) {
        deptNoticeService.delete(deptNoticeNumber);
        return "notice/noticelist";
    }


}
