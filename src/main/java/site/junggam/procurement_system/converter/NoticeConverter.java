package site.junggam.procurement_system.converter;

import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.Notice;

import java.util.List;
import java.util.stream.Collectors;

public class NoticeConverter {

    public static NoticeDTO convertToDto(Notice notice) {
        NoticeDTO dto = new NoticeDTO();
        dto.setNoticeTitle(notice.getNoticeTitle());
        dto.setNoticeContent(notice.getNoticeContent());
        dto.setNoticeRegDate(notice.getNoticeRegDate());
        dto.setNoticeNumber(notice.getNoticeNumber());
        dto.setNoticeWriter(notice.getNoticeWriter());
        return dto;
    }

    public static List<NoticeDTO> convertToDtoList(List<Notice> notices) {
        return notices.stream()
                .map(NoticeConverter::convertToDto)
                .collect(Collectors.toList());
    }
}
