package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import site.junggam.procurement_system.entity.DeptNotice;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.service.DeptNoticeService;
import site.junggam.procurement_system.service.NoticeService;

import java.util.List;


@Controller
@Log4j2
@RequestMapping("/notice")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;
    private final DeptNoticeService deptNoticeService;

    @GetMapping("/noticelist")
    public String noticelist(Model model) {
        log.info("공지사항 목록");
        model.addAttribute("notice", noticeService.list());
        // log.info("보낼데이터"+noticeService.list());
        model.addAttribute("deptnotice", deptNoticeService.list());
        // log.info("데이터" + deptNoticeService.list());
        return "notice/noticelist";
    }

    @GetMapping("/noticeread/{noticeNumber}")
    public String noticeread(@PathVariable int noticeNumber, Model model) {
        log.info("공지사항 상세보기");
        model.addAttribute("notice", noticeService.read(noticeNumber));
        return "notice/noticeread";
    }

    @GetMapping("/noticeregister")
    public String noticeregister() {
        log.info("공지사항 등록");
        return "notice/noticeregister";
    }

    @PostMapping("/noticeregister")
    public String registerpost(Notice notice) {
        noticeService.register(notice);
        return "redirect:/notice/noticelist";
    }

    @GetMapping("/noticemodify/{noticeNumber}")
    public String noticemodify(@PathVariable int noticeNumber, Model model) {
        log.info("공지사항 수정");
        model.addAttribute("notice", noticeService.read(noticeNumber));
        return "notice/noticemodify";
    }

    @PostMapping("/noticemodify")
    public String modifypost(Notice notice) {
        noticeService.modify(notice);
        return "redirect:/notice/noticelist";
    }

    @GetMapping("/noticedelete/{noticeNumber}")
    public String noticedelete(@PathVariable int noticeNumber) {
        noticeService.delete(noticeNumber);
        return "notice/noticelist";
    }

//    @GetMapping("notice/noticesearch")
//    public String noticesearch(@RequestParam(value = "keyword") String keyword, Model model) {
//        List<Notice> noticeList = noticeService.searchPosts(keyword);
//        model.addAttribute("noticelist", noticeList);
//        return "notice/noticelist";
//    }

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
}
