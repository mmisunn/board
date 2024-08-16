package site.junggam.procurement_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.repository.NoticeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Transactional
    public NoticeDTO getread(Integer noticeNumber) {
        Optional<Notice> noticeWrapper = noticeRepository.findById(noticeNumber);
        Notice notice = noticeWrapper.get();

        NoticeDTO noticeDTO = NoticeDTO.builder()
                .noticeNumber(notice.getNoticeNumber())
                .noticeTitle(notice.getNoticeTitle())
                .noticeWriter(notice.getNoticeWriter())
                .noticeContent(notice.getNoticeContent())
                .noticeRegDate(notice.getNoticeRegDate())
                .build();

        return noticeDTO;
    }

}
