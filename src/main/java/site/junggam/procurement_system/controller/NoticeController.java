package site.junggam.procurement_system.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/noticelist")
    public void noticelist() {
        log.info("전체공지사항목록, 부서알림게시판등록");
    }

    @GetMapping("/noticeread")
    public void noticeread() {
        log.info("전체공지상세보기");
    }




}
