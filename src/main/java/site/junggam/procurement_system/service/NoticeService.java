package site.junggam.procurement_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import site.junggam.procurement_system.entity.Notice;
import site.junggam.procurement_system.repository.NoticeRepository;
import java.util.List;


@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public void register(Notice notice) {
        noticeRepository.save(notice);
    }

    public List<Notice> list(int page) {
        return noticeRepository.findAll(PageRequest.of(page, 4, Sort.by(Sort.Direction.ASC, "noticeNumber")));
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
