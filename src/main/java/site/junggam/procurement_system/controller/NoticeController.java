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
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/noticelist")
    public String getNoticelist(Model model) {
        log.info("전체공지사항목록, 부서알림게시판등록");
        List<Notice> notices = noticeService.getNoticeList();
        List<NoticeDTO> noticeDTOS = notices.stream()
                        .map(noticeService::getNoticeList).collect(Collectors.toList());
        model.addAttribute("notices", noticeDTOS);

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
