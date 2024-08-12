package site.junggam.procurement_system.service;

import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;

import java.util.List;

public interface NoticeService {
    // 공지사항 리스트 보기
    List<Notice> getNoticeList();

    // 공지사항 상세보기
    NoticeDTO getNoticeRead(Integer noticeNumber);
}
