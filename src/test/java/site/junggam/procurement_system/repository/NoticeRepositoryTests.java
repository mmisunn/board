package site.junggam.procurement_system.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.junggam.procurement_system.entity.Notice;

import java.time.LocalDateTime;

@SpringBootTest
public class NoticeRepositoryTests {

    @Autowired
    private NoticeRepository noticeRepository;

    @Test
    public void insertNotice() {
        Notice notice = Notice.builder().noticeContent("공지사항 내용")
                .noticeRegDate(LocalDateTime.now()).noticeTitle("공지사항 제목")
                .noticeNumber(1).build();
        noticeRepository.save(notice);
    }
}
