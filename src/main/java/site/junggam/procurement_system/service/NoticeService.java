package site.junggam.procurement_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.repository.NoticeRepository;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public void register(Notice notice) {
        noticeRepository.save(notice);
    }

    public List<Notice> list() {
        return noticeRepository.findAll(Sort.by(Sort.Direction.DESC, "noticeNumber"));
    }

    public Notice read(int noticeNumber) {
        return noticeRepository.findById(noticeNumber).orElse(null);
    }

    public void modify(Notice notice) {
        noticeRepository.save(notice);
    }

    public void delete(int noticeNumber) {
        noticeRepository.deleteById(noticeNumber);
    }

}
