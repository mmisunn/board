package site.junggam.procurement_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.repository.NoticeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public List<NoticeDTO> getNoticeList() {
        List<Notice> notices = noticeRepository.findAll();
        List<NoticeDTO> noticeDTOList = new ArrayList<>();

        for (Notice notice : notices) {
            NoticeDTO noticeDTO = NoticeDTO.builder().noticeNumber(notice.getNoticeNumber())
                    .noticeWriter(notice.getNoticeWriter()).noticeTitle(notice.getNoticeTitle())
                    .noticeRegDate(notice.getNoticeRegDate()).build();
            noticeDTOList.add(noticeDTO);
        }
        return noticeDTOList;
    }

}
