package site.junggam.procurement_system.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.service.NoticeService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@Log4j2
@RequestMapping("/notice")
public class NoticeController {

    private NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/noticelist")
    public String noticelist(Model model) {
        List<NoticeDTO> noticeDTOList = noticeService.getNoticeList();
        model.addAttribute("noticelist", noticeDTOList);

        return "notice/noticelist";
    }

//    @GetMapping("/noticeread/{noticeNumber}")
//    public ResponseEntity<NoticeDTO> noticeread(@PathVariable("noticeNumber") Integer noticeNumber) {
//        log.info("전체공지상세보기 글번호는 " + noticeNumber);
//        NoticeDTO noticeDTO =
//    }

    @GetMapping("/noticemodify")
    public void noticemodify() {
        log.info("공지사항 수정하기");
    }




}
