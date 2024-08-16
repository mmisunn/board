package site.junggam.procurement_system.converter;

import site.junggam.procurement_system.dto.DeptNoticeDTO;
import site.junggam.procurement_system.dto.NoticeDTO;
import site.junggam.procurement_system.entity.DeptNotice;
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

    public static DeptNoticeDTO convertToDto1(DeptNotice deptNotice) {
        DeptNoticeDTO dto = new DeptNoticeDTO();
        dto.setDeptNoticeTitle(deptNotice.getDeptNoticeTitle());
        dto.setDeptNoticeContent(deptNotice.getDeptNoticeContent());
        dto.setDeptNoticeRegDate(deptNotice.getDeptNoticeRegDate());
        dto.setDeptNoticeNumber(deptNotice.getDeptNoticeNumber());
        dto.setDeptNoticeWriter(deptNotice.getDeptNoticeWriter());
        return dto;
    }

    public static List<NoticeDTO> convertToDtoList(List<Notice> notices) {
        return notices.stream()
                .map(NoticeConverter::convertToDto)
                .collect(Collectors.toList());
    }

    public static List<DeptNoticeDTO> convertToDtoList1(List<DeptNotice> deptNotices) {
        return deptNotices.stream()
                .map(NoticeConverter::convertToDto1)
                .collect(Collectors.toList());
    }
}
