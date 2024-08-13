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
public class DeptNoticeDTO {

    private String deptNoticeTitle;

    private String deptNoticeContent;

    private LocalDate deptNoticeRegDate;

    private Integer deptNoticeNumber;

    private String deptNoticeWriter;

}
