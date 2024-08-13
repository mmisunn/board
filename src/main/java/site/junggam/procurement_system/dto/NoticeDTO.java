package site.junggam.procurement_system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeDTO {

    private String noticeTitle;

    private String noticeContent;

    private LocalDate noticeRegDate;

    private Integer noticeNumber;

    private String noticeWriter;

}
