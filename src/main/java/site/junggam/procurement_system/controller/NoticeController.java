package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.junggam.procurement_system.dto.DeptNoticeDTO;
import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.service.DeptNoticeService;
import site.junggam.procurement_system.service.NoticeService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Log4j2
@RequestMapping("/notice")
public class NoticeController {

    private NoticeService noticeService;
    private DeptNoticeService deptNoticeService;

    public NoticeController(NoticeService noticeService, DeptNoticeService deptNoticeService) {
        this.noticeService = noticeService;
        this.deptNoticeService = deptNoticeService;
    }

    @GetMapping("/noticelist")
    public String noticelist(Model model, Model model1) {
        List<NoticeDTO> noticeDTOList = noticeService.getNoticeList();
        model.addAttribute("noticelist", noticeDTOList);
        List<DeptNoticeDTO> deptNoticeDTOList = deptNoticeService.getDeptNoticeList();
        model1.addAttribute("deptnoticelist", deptNoticeDTOList);

        return "notice/noticelist";
    }

    @GetMapping("/noticeread/{noticeNumber}")
    public String noticeread(@PathVariable("noticeNumber") Integer noticeNumber, Model model) {
        NoticeDTO noticeDTO = noticeService.getread(noticeNumber);

        model.addAttribute("noticeDTO", noticeDTO);
        return "notice/noticeread";
    }

    @GetMapping("/noticemodify")
    public void noticemodify() {
        log.info("공지사항 수정하기");
    }




}
